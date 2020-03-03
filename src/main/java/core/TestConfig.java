package core;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class TestConfig {

    private static File resourcesDirectory = new File("src/main/resources/config");
    private static InputStream envConfig;
    private static Properties properties;

    public static void load (String environment) throws Exception {
        envConfig = new FileInputStream(resourcesDirectory+"/config."+environment+".properties");
        properties = new Properties();
        properties.load(envConfig);
    }

    public static String getProperty(String key){
        if(properties.containsKey(key)){
            return properties.getProperty(key);
        }
        return null;
    }

    public static void addProperty(String property, String value) {
        if(!properties.equals(null)){
            properties.setProperty(property,value);
        }
    }
}
