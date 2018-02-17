package services.SPOCK;

import model.Moves;
import services.AiCheatingRulesService;
import services.AiDrawService;
import services.RPS.AiRpsCheatingRulesServiceImpl;

public class AiSPOCKDrawServiceImpl implements AiDrawService {

    private final AiCheatingRulesService aiCheatingRulesService;

    public AiSPOCKDrawServiceImpl(AiSPOCKCheatingRulesServiceImpl aiSPOCKCheatingRulesService) {
        this.aiCheatingRulesService = aiSPOCKCheatingRulesService;
    }

    @Override
    public Moves randomDraw(int numberOfRounds, int player1Move, int player1Wins, int player2Wins) {

        int random = aiCheatingRulesService.rand();

        if (random == 1) {
            return Moves.PAPER;
        } else if (random == 2) {
            return Moves.ROCK;
        } else if (random == 3) {
            return Moves.SCISSORS;
        } else if (random == 4) {
            return Moves.SPOCK;
        } else {
            return Moves.LIZARD;
        }
    }
}
