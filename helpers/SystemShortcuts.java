package helpers;

public class SystemShortcuts {
    public static void cls(){
        try {
            new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
        }catch (Exception E){
            System.out.println(E);
        }
    }
}
