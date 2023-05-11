package engines.gameEngine;

import org.yaml.snakeyaml.Yaml;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Map;

public class GameSavesController {
    public static Map<String,Object> getDataFromSave() throws FileNotFoundException { //TODO How to dodge this exception and give it to starter
        InputStream inputStream = new FileInputStream("resources/saves/saves.yml");
        Yaml yaml = new Yaml();
        return yaml.load(inputStream);
    }
}
