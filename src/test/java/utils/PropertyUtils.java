package utils;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertyUtils {
    static Properties properties = new Properties();

    public static Properties propertyLoader() throws IOException {

        BufferedReader reader;

        reader = new BufferedReader(new FileReader("src/test/resources/stg_login_config.properties"));
        properties.load(reader);
        reader.close();
        return properties;

    }


    public static String getUsername() throws IOException {

       String username = properties.getProperty("username");
       return username;
    }

    public static String getPassword() throws IOException {

        String password = propertyLoader().getProperty("password");
        return password;
    }
    public static String getBaseURL() throws IOException {

        String url = propertyLoader().getProperty("baseURL");
        return url;
    }











}
