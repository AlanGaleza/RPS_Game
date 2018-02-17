package services;

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

        int rounds;
        Scanner inputs = new Scanner(System.in);

        System.out.println("Number of wining rounds");
        rounds = inputs.nextInt();
        boolean game = gameResultService.process(aiDrawService, playersCreator, rounds);

        if (game) {
            System.out.println("Lets try again");
            System.out.println("Number of wining rounds");
            rounds = inputs.nextInt();
            gameResultService.process(aiDrawService, playersCreator, rounds);
        }
    }
}
