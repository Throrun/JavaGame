package player;

import items.Item;
import org.yaml.snakeyaml.Yaml;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Map;

public class Player {

    private int hp;//health of player
    private String name; // name of player
    private int money; // amount of money
    private String location; // place where are player now
    private String weapon; // player weapon
    //TODO backpack in other class
    public Player(String name) throws FileNotFoundException {
        hp = 100;
        money = 0;
    }
    public int getDamage(int value){
        return hp-value;
    }
    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }
    public int getHp() {
        return hp;
    }
    public String getLocation() {
        return location;
    }
    public void addToBackpack(Item item){

    }
}
