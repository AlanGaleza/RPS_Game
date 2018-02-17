package services.RPS;

import model.Moves;
import services.AiCheatingRulesService;

import java.util.concurrent.ThreadLocalRandom;

public class AiRpsCheatingRulesServiceImpl implements AiCheatingRulesService {

    public int rand() {
        return ThreadLocalRandom.current().nextInt(1, 4);
    }
}
