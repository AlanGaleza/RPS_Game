package services;

import repository.PlayerCreatorRepository;

public class GameProcess {

    private final AiDrawService aiDrawService;
    private final GameResultService gameResultService;

    public GameProcess(AiDrawService aiDrawService, GameResultService gameResultService) {
        this.aiDrawService = aiDrawService;
        this.gameResultService = gameResultService;
    }

    public void gameProcess() {

        PlayerCreatorRepository playerCreatorRepository = new PlayerCreatorRepository();
        playerCreatorRepository.playerCreateList("A", "B");

        boolean result = gameResultService.process(aiDrawService);

    }
}
