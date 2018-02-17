package services;

import java.util.concurrent.ThreadLocalRandom;

public class RandomNumberGeneratorServiceImpl implements RandomNumberGeneratorService{

    public int rand() {
        return ThreadLocalRandom.current().nextInt(1, 4);
    }
}
