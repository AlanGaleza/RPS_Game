package services;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.List;
import java.util.Scanner;

public class GameProcess {

    private final AiDrawService aiDrawService;
    private final GameResultService gameResultService;
    private final PlayersCreator playersCreator;

    public GameProcess(AiDrawService aiDrawService, GameResultService gameResultService, PlayersCreator playersCreator) {
        this.aiDrawService = aiDrawService;
        this.gameResultService = gameResultService;
        this.playersCreator = playersCreator;
    }

    public void gameProcess() {

        int modePick;

        Scanner inputs = new Scanner(System.in);
        System.out.println("Choose game mode, 1 - RPS, 2 - SPOCK");
        modePick = inputs.nextInt();

        if(modePick == 1) {
            gameResultService.process(aiDrawService, playersCreator);
        } else {
            System.out.println("bad pick");
        }




    }
}
