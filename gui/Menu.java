package gui;

import java.util.Scanner;

import static helpers.SystemShortcuts.cls;

public class Menu {
    MenuElements currentStatus;
//    public void switchStatus(MenuElements status){
//        switch (status){
//            case NEW_GAME:
//                break;
//            case SAVES:
//                break;
//            case EXIT_GAME:
//                break;
//            case DEV_MODE:
//                break;
//        }
//    }
    public void switchStatus(){
        switch (this.currentStatus) {
            case MAIN_MENU:
                mainMenu();
                break;
            case NEW_GAME:
                //TODO new game
                break;
            case SAVES:
                savesMenu();
                break;
            case EXIT_GAME:
                exitMenu();
                break;
            case DEV_MODE:
                devMode();
                break;
        }
    }
    public void mainMenuStarter(){
        currentStatus = MenuElements.MAIN_MENU;
    }
    public void mainMenu(){
        currentStatus = MenuElements.MAIN_MENU;
        System.out.print("#### Main Menu ####\n1.Start Game\n2.Saves\n3.Exit\n###################\nEnterChoice:");
        selectOption();
    }
    public void savesMenu(){
        System.out.print("###### Saves ######\n1. ....\n2. ....\n3.Back to Main Menu\n###################\nEnterChoice: ");
        selectOption();
    }
    public void exitMenu(){
        System.exit(1);
    }
    public void startNewGame(){

    }
    public void devMode(){
        //TODO shows all options for example setting new weapons or items
    }

    /**
     * MAIN_MENU
     * 1.Start new Game
     * 2.Saves
     * 3.Exit
     *
     *
     * SAVES
     * 1. ........
     * 2. ........
     * 3. Back to menu
     */
    public void selectOption(){
        Scanner in = new Scanner(System.in);
        String element = in.nextLine();
        switch (currentStatus){
            case MAIN_MENU:
                switch(element) {
                    case "1":
                        currentStatus = MenuElements.NEW_GAME;
                        break;
                    case "2":
                        currentStatus = MenuElements.SAVES;
                        break;
                    case "3":
                        currentStatus = MenuElements.EXIT_GAME;
                        break;
                    case "xd":
                        currentStatus = MenuElements.DEV_MODE;
                    default:
                        System.out.printf("Wrong input");
                }
                switchStatus();
                break;
            case SAVES:
                switch(element) {
                    case "1":
                        //TODO connect with 1 save
                        break;
                    case "2":
                        //TODO connect with 2 save
                        break;
                    case "3":
                        currentStatus = MenuElements.MAIN_MENU;
                        break;
                    default:
                        System.out.printf("Wrong input");
                }
                switchStatus();
                break;
            case EXIT_GAME:
                exitMenu();
                break;
            case DEV_MODE:
                //TODO DEV mode layout
                break;
            default:
                System.exit(2);
        }
        cls(); // clear console

    }
}
