package util;

import org.testng.annotations.Test;

import java.io.*;
import java.util.Properties;

/**
 * @author Ajeet Vishwakarma
 * @Date 22/12/2022 - 4:20 PM
 */
public class Base {

    protected static Properties prop;
    BufferedReader reader;

    public void setUp() throws IOException {
        String propertyFilePath = "src\\test\\resources\\iLMS.properties";
        reader = new BufferedReader(new FileReader(propertyFilePath));
        prop = new Properties();
        prop.load(reader);
        reader.close();
    }

    public String getAuthToken() {
        String authToken = prop.getProperty("authToken");
        return authToken;
    }

}
