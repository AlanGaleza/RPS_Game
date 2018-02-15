package services;

import java.util.concurrent.ThreadLocalRandom;

public class RandomNumberGeneratorService {

    public int rand() {
        return ThreadLocalRandom.current().nextInt(1, 4);
    }

}
