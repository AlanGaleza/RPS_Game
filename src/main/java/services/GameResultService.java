package services;

public interface GameResultService {

    boolean process(AiDrawService aiDrawService, PlayersCreator playersCreator, int rounds);
}
