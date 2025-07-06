package practice;

import org.testng.annotations.Test;

import java.util.List;

public class RockPaperScissors {

    @Test
    public void gameTester() {
        List<String[]> gameInputs = List.of(
                new String[]{"S", "P"},
                new String[]{"S", "R"},
                new String[]{"P", "P"},
                new String[]{"R", "S"}
        );
        int gameNumber = 1;
        for (String [] gameInput : gameInputs){
            String result = getWinner(gameInput[0], gameInput[1]);
            System.out.println("Game " + gameNumber + " : " + result);
        }

    }

    public String getWinner(String player1, String player2) {
        if (player1.equals(player2)) return "Tie";
        if (
                (player1.equals("R") && player2.equals("S"))
                        || (player1.equals("S") && player2.equals("P"))
                        || (player1.equals("P") && player2.equals("R"))) {
            return "player 1 wins";
        }
       else{
            return "Player 2 wins";
        }
    }
}
