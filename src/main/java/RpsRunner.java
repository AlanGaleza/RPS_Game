import services.*;

public class RpsRunner {

    public static void main(String args[]) {

        GameProcess gameProcess = new GameProcess(new AiRpsDrawServiceImpl(new RandomNumberGeneratorServiceImpl()), new GameRpsResultImpl(), new PlayerRpsCreatorImpl());
        gameProcess.gameProcess();
    }
}
