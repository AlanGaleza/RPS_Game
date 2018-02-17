package services;

import model.Moves;

public interface AiDrawService {

    Moves randomDraw(int numberOfRounds, int player1Move, int player1Wins, int player2Wins);
}
