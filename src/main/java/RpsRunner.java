import services.AiRpsDrawServiceImpl;
import services.GameProcess;
import services.GameRpsResultImpl;

public class RpsRunner {

    public static void main(String args[]) {

        GameProcess gameProcess = new GameProcess(new AiRpsDrawServiceImpl(), new GameRpsResultImpl());
        gameProcess.gameProcess();
    }
}
