import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateUtils {

    public String getFormattedDate(int daysFromToday) {
        LocalDate targetDate = LocalDate.now().plusDays(daysFromToday);
        return targetDate.format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));
    }
}
