package services.RPS;

import model.Moves;
import services.AiCheatingRulesService;
import services.AiDrawService;

public class AiRpsDrawServiceImpl implements AiDrawService {

    private final AiCheatingRulesService aiCheatingRulesService;

    public AiRpsDrawServiceImpl(AiRpsCheatingRulesServiceImpl aiRpsCheatingRulesService) {
        this.aiCheatingRulesService = aiRpsCheatingRulesService;
    }

    @Override
    public Moves randomDraw(int numberOfRounds, int player1Move, int player1Wins, int player2Wins) {

        int random = aiCheatingRulesService.rand();

        if (random == 1) {
            return Moves.PAPER;
        } else if (random == 2) {
            return Moves.ROCK;
        } else {
            return Moves.SCISSORS;
        }
    }
}
