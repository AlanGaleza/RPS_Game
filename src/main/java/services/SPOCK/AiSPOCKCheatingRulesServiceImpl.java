package services.SPOCK;

import services.AiCheatingRulesService;

import java.util.concurrent.ThreadLocalRandom;

public class AiSPOCKCheatingRulesServiceImpl implements AiCheatingRulesService {

    @Override
    public int rand() {
        return ThreadLocalRandom.current().nextInt(1, 6);
    }
}
