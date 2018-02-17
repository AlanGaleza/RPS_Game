import services.*;
import services.RPS.AiRpsCheatingRulesServiceImpl;
import services.RPS.AiRpsDrawServiceImpl;
import services.RPS.GameRpsResultImpl;
import services.SPOCK.AiSPOCKDrawServiceImpl;
import services.SPOCK.GameSPOCKResultImpl;

import java.util.Scanner;

public class RpsRunner {

    public static void main(String args[]) {

        String pick;
        boolean loopEnd = false;

        System.out.println("Welcom, wchich game would You like to play, 1 - RPS, 2- SPOOK, 3 - exit");
        Scanner input = new Scanner(System.in);
        while(!loopEnd) {
            pick = input.next();
            if (pick.equals("1")) {
                loopEnd = true;
                GameProcess gameRpsProcess = new GameProcess(new AiRpsDrawServiceImpl(new RandomNumberGeneratorServiceImpl()), new GameRpsResultImpl(), new PlayerCreatorImpl());
                gameRpsProcess.gameProcess();
            } else if (pick.equals("2")) {
                loopEnd = true;
                GameProcess gameSPOCKProcess = new GameProcess(new AiSPOCKDrawServiceImpl(new AiRpsCheatingRulesServiceImpl()), new GameSPOCKResultImpl(), new PlayerCreatorImpl());
                gameSPOCKProcess.gameProcess();
            } else if (pick.equals("3")) {
                System.out.println("See you");
                return;
            } else {
                System.out.println("Bad pick, try again");
            }
        }
    }
}
