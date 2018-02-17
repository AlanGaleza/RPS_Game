package services.RPS;

import model.Moves;
import model.Player;
import services.AiDrawService;
import services.GameResultService;
import services.PlayersCreator;

import java.util.List;
import java.util.Scanner;

public class GameRpsResultImpl implements GameResultService {

    @Override
    public boolean process(AiDrawService aiDrawService, PlayersCreator playersCreator, int rounds) {

        boolean end = false;
        String player1Pick;
        Moves player1PickMove;
        Moves player2Pick = Moves.PAPER;
        String gameRepeat;
        boolean pickLoop;
        int player1Counter = 0;
        int player2Counter = 0;
        List<Player> players = playersCreator.playerCreator();
        Scanner inputs = new Scanner(System.in);

        while(!end) {

            if (player1Counter != rounds && player2Counter != rounds) {

                System.out.println("Pick: 1 - Paper, 2 - Rock, 3 - Scissors, n - start again, x - end game");
                player1Pick = inputs.next();
                pickLoop = false;

                while(!pickLoop) {
                    player2Pick = aiDrawService.randomDraw();
                    switch (player1Pick) {
                        case "1" :
                            player1PickMove = Moves.PAPER;
                            System.out.println("U picked: " + player1PickMove );
                            System.out.println("AI picked: " + player2Pick );
                            pickLoop = true;
                            break;
                        case "2" :
                            player1PickMove = Moves.ROCK;
                            System.out.println("U picked: " + player1PickMove );
                            System.out.println("AI picked: " + player2Pick );
                            pickLoop = true;
                            break;
                        case "3" :
                            player1PickMove = Moves.SCISSORS;
                            System.out.println("U picked: " + player1PickMove );
                            System.out.println("AI picked: " + player2Pick );
                            pickLoop = true;
                            break;
                        case "x" :
                            System.out.println("See You");
                            return false;
                        case "n" :
                            return true;
                        default :
                            System.out.println("Bad pick try again");
                            player1Pick = inputs.next();
                            break;
                    }
                }
                if (player1Pick.equals("1") && player2Pick.equals(Moves.SCISSORS)) {
                    ++player2Counter;
                    System.out.println(players.get(1).getUserName() + " win this round");
                } else if (player1Pick.equals("1") && player2Pick.equals(Moves.ROCK)) {
                    ++player1Counter;
                    System.out.println(players.get(0).getUserName() + " win this round");
                } else if (player1Pick.equals("2") && player2Pick.equals(Moves.PAPER)) {
                    ++player2Counter;
                    System.out.println(players.get(1).getUserName() + " win this round");
                } else if (player1Pick.equals("2") && player2Pick.equals(Moves.SCISSORS)) {
                   ++player1Counter;
                    System.out.println(players.get(0).getUserName() + " win this round");
                } else if (player1Pick.equals("3") && player2Pick.equals(Moves.ROCK)) {
                    ++player2Counter;
                    System.out.println(players.get(1).getUserName() + " win this round");
                } else if (player1Pick.equals("3") && player2Pick.equals(Moves.PAPER)) {
                    ++player1Counter;
                    System.out.println(players.get(0).getUserName() + " win this round");

                } else {
                    System.out.println("Draw");
                }

                System.out.println("Score: " + (players.get(0).getUserName() + ": " + player1Counter));
                System.out.println("Score: " + (players.get(1).getUserName() + ": " + player2Counter));

            } else {
                end = true;
                System.out.println("Game has ended." );
            }
        }
        if (player1Counter == rounds) {
            System.out.println(players.get(0).getUserName() + " WIN ");
        } else {
            System.out.println(players.get(1).getUserName() + " WIN ");
        }
        System.out.println("What u want to do? n - lets play again, x - end game.");
        gameRepeat = inputs.next();
        if (gameRepeat.equals("n")) {
            return true;
        } else {
            System.out.println("See You");
            return false;
        }
    }
}
