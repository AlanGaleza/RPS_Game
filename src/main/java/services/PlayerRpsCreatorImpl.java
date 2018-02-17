package services;

import model.Player;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PlayerRpsCreatorImpl implements PlayersCreator{

    @Override
    public List<Player> playerCreator() {

        String name;

        List<Player> playerList = new ArrayList<>();
        Scanner inputs = new Scanner(System.in);

        System.out.println("Choose player 1 name");
        name = inputs.nextLine();

        Player player1 = new Player(name);
        Player player2 = new Player("AI");

        playerList.add(player1);
        playerList.add(player2);

        return playerList;
    }
}
