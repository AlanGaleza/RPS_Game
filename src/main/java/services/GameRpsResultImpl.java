package services;

import model.Moves;

public class GameRpsResultImpl implements GameResultService {

    @Override
    public boolean process(AiDrawService aiDrawService) {

        boolean end = false;
        int player1Counter = 0;
        int player2Counter = 0;


        while(!end) {

            Moves player1Pick = Moves.PAPER;
            Moves player2Pick = aiDrawService.randomDraw();

            if (player1Counter != 2 && player2Counter != 2) {

                if (player1Pick.equals(Moves.PAPER) && player2Pick.equals(Moves.SCISSORS)) {
                    player2Counter++;
                    System.out.println("Player 2 win this round");
                } else if (player1Pick.equals(Moves.PAPER) && player2Pick.equals(Moves.ROCK)) {
                    player1Counter++;
                    System.out.println("Player 1 win this round");
                } else if (player1Pick.equals(Moves.ROCK) && player2Pick.equals(Moves.PAPER)) {
                    player2Counter++;
                    System.out.println("Player 2 win this round");
                } else if (player1Pick.equals(Moves.ROCK) && player2Pick.equals(Moves.SCISSORS)) {
                    player1Counter++;
                    System.out.println("Player 1 win this round");
                } else if (player1Pick.equals(Moves.SCISSORS) && player2Pick.equals(Moves.ROCK)) {
                    player2Counter++;
                    System.out.println("Player 2 win this round");
                } else if (player1Pick.equals(Moves.SCISSORS) && player2Pick.equals(Moves.PAPER)) {
                    player1Counter++;
                    System.out.println("Player 1 win this round");
                } else {
                    System.out.println("Draw");
                }

            } else {
                end = true;
                System.out.println("Game has ended." );
            }
        }
        if (player1Counter == 2) {
            return true;
        } else {
            return false;
        }
    }
}
