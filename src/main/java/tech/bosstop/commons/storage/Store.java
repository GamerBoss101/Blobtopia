package tech.bosstop.commons.storage;

import java.io.File;
import java.io.IOException;

public class Store {

    private static boolean runFile() throws IOException {
        boolean runBat = true;
        if(!FileUtil.fileExists(new File("./run.bat"))) {
            runBat = false;
            FileUtil.writeFile("./run.bat", "java -jar blobtopia.jar\n@pause\n");
        }
        return runBat;
    }
    
    public static boolean enable() throws IOException {
        return runFile();
    }
}
