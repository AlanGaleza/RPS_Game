package services;

import model.Moves;

public class AiRpsDrawServiceImpl implements AiDrawService {

    private RandomNumberGeneratorServiceImpl randomNumberGeneratorServiceImpl = new RandomNumberGeneratorServiceImpl();

    @Override
    public Moves randomDraw() {

        int random = randomNumberGeneratorServiceImpl.rand();

        if (random == 1) {
            return Moves.PAPER;
        } else if (random == 2) {
            return Moves.ROCK;
        } else {
            return Moves.SCISSORS;
        }
    }
}
