import gui.Menu;
import player.Player;
import starter.GameStarter;
import starter.GameStarter.*;

import static starter.GameStarter.startOfTheGame;

public class Main {
    public static void main(String[] args) {
        startOfTheGame();
        Menu menu = new Menu();
        menu.mainMenuStarter();
        while (true){
            menu.switchStatus();
        }


    }
}
