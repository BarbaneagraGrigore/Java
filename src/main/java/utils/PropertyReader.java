package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;

public class PropertyReader {
    public static String readProperty(String property) {
        String propertyValue = "Property not found";
        Properties properties = new Properties();
        try {
            Path pathToProperties = Paths.get("src", "test", "resources", "configuration.properties");
            InputStream fileInputStream = new FileInputStream(pathToProperties.toString());
            properties.load(fileInputStream);
            propertyValue = properties.getProperty(property);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return propertyValue;
    }
}
