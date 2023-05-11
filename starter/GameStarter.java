package starter;

import static starter.ReqStarter.mainCheck;

public class GameStarter {
    public static void startOfTheGame(){
        if(!mainCheck()){
            System.exit(404);
        }


        //TODO we have any saves?
        //TODO all loadings idk what
    }
}
