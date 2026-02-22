package practice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.sql.*;

import org.awaitility.Awaitility;

import java.util.concurrent.TimeUnit;
import net.datafaker.Faker;
public class SQLConnectionTest {

    private Connection conn;


    Faker faker = new Faker();

    @BeforeClass
    public void setupConnection() throws SQLException {
        String URL = "jdbc:sqlserver://localhost:1433;" +
                "databaseName=BankDB;" +
                "user=admin;" +
                "password=1234abcd;" +
                "trustServerCertificate=true;";
        conn = DriverManager.getConnection(URL);
        System.out.println("Connected to BankDB!");
    }

    @AfterClass
    public void closeConnection() throws SQLException {
        if (conn != null && !conn.isClosed()) {
            conn.close();
            System.out.println("Connection closed.");
        }
    }

    @Test
    public void testInsertAccount() throws SQLException {
        String email = faker.internet().emailAddress();
        String name = faker.name().firstName();
        String lastName = faker.name().lastName();
        double balance = faker.number().randomDouble(2, 1, 50000);
        insertAccount(name, lastName, email, balance, 1, 1);
        Awaitility.await()
                .atMost(10, TimeUnit.SECONDS)
                .pollInterval(1, TimeUnit.SECONDS)
                .until(() -> accountExistsByEmail(email));
        System.out.println("Account successfully inserted and found!");
    }

    private void insertAccount(String firstName, String lastName, String email,
                               double balance, int typeId, int statusId) throws SQLException {
        String sql = "INSERT INTO Accounts (DateOpened, TypeId, FirstName, LastName, Email, Balance, StatusId) " +
                "VALUES (GETDATE(), ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, typeId);
            ps.setString(2, firstName);
            ps.setString(3, lastName);
            ps.setString(4, email);
            ps.setDouble(5, balance);
            ps.setInt(6, statusId);
            ps.executeUpdate();
        }
    }

    private boolean accountExistsByEmail(String email) {
        String sql = "SELECT * FROM Accounts WHERE Email = ?";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, email);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                System.out.println("Account found:");
                System.out.println("  AccountId : " + rs.getInt("AccountId"));
                System.out.println("  Name      : " + rs.getString("FirstName") + " " + rs.getString("LastName"));
                System.out.println("  Email     : " + rs.getString("Email"));
                System.out.println("  Balance   : " + rs.getDouble("Balance"));
                System.out.println("  DateOpened: " + rs.getTimestamp("DateOpened"));
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}

