package repository;

import model.Player;

import java.util.ArrayList;
import java.util.List;

public class PlayerCreatorRepository {

    private List<Player> playersList = new ArrayList<>();

    public List<Player> playerCreateList(String player1Name, String player2Name) {

        Player player1 = new Player(player1Name);
        Player player2 = new Player(player2Name);

        playersList.add(player1);
        playersList.add(player2);

        return new ArrayList<>(playersList);
    }

    public Player getPlayersList(int number) {
        return playersList.get(number);
    }
}
