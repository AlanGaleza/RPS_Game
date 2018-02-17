package services;

import model.Moves;
import model.Player;

import java.util.List;
import java.util.Scanner;

public class GameRpsResultImpl implements GameResultService {

    @Override
    public void process(AiDrawService aiDrawService, PlayersCreator playersCreator) {

        boolean end = false;
        String player1Pick;
        boolean pickLoop = false;
        int player1Counter = 0;
        int player2Counter = 0;
        List<Player> players = playersCreator.playerCreator();
        Scanner inputs = new Scanner(System.in);

        while(!end) {

            System.out.println("Pick: 1 - Paper, 2 - Rock, 3 - Scissors");
            player1Pick = inputs.next();

            while(pickLoop) {
                if (player1Pick.equals("1") || player1Pick.equals("2") || player1Pick.equals("3")) {
                    pickLoop = true;
                } else {
                    pickLoop = false;
                    System.out.println("Try Again");
                    player1Pick = inputs.next();
                }
            }

            Moves player2Pick = aiDrawService.randomDraw();

            if (player1Counter != 2 && player2Counter != 2) {

                if (player1Pick.equals("1") && player2Pick.equals(Moves.SCISSORS)) {
                    player2Counter++;
                    System.out.println(players.get(1).getUserName() + " win this round");
                    pickLoop = false;
                } else if (player1Pick.equals("1") && player2Pick.equals(Moves.ROCK)) {
                    player1Counter++;
                    System.out.println(players.get(0).getUserName() + " win this round");
                    pickLoop = false;
                } else if (player1Pick.equals("2") && player2Pick.equals(Moves.PAPER)) {
                    player2Counter++;
                    System.out.println(players.get(1).getUserName() + " win this round");
                    pickLoop = false;
                } else if (player1Pick.equals("2") && player2Pick.equals(Moves.SCISSORS)) {
                    player1Counter++;
                    System.out.println(players.get(0).getUserName() + " win this round");
                    pickLoop = false;
                } else if (player1Pick.equals("3") && player2Pick.equals(Moves.ROCK)) {
                    player2Counter++;
                    System.out.println(players.get(1).getUserName() + " win this round");
                    pickLoop = false;
                } else if (player1Pick.equals("3") && player2Pick.equals(Moves.PAPER)) {
                    player1Counter++;
                    System.out.println(players.get(0).getUserName() + " win this round");
                    pickLoop = false;
                } else {
                    System.out.println("Draw");
                    pickLoop = false;
                }

            } else {
                end = true;
                System.out.println("Game has ended." );
            }
        }
        if (player1Counter == 2) {
            System.out.println(players.get(0).getUserName() + " WIN ");
        } else {
            System.out.println(players.get(1).getUserName() + " WIN ");
        }
    }
}
