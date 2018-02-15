package services;

import model.Moves;

public class RpsAiDrawServiceImpl {

    private RandomNumberGeneratorService randomNumberGeneratorService;

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
