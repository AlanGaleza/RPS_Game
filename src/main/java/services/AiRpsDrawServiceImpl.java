package services;

import model.Moves;

public class AiRpsDrawServiceImpl implements AiDrawService {

    private final RandomNumberGeneratorService randomNumberGeneratorService;

    public AiRpsDrawServiceImpl(RandomNumberGeneratorServiceImpl randomNumberGeneratorService) {
        this.randomNumberGeneratorService = randomNumberGeneratorService;
    }

    @Override
    public Moves randomDraw() {

        int random = randomNumberGeneratorService.rand();

        if (random == 1) {
            return Moves.PAPER;
        } else if (random == 2) {
            return Moves.ROCK;
        } else {
            return Moves.SCISSORS;
        }
    }
}
