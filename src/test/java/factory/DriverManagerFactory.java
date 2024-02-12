package factory;

import Constants.DriverType;

import java.sql.Driver;

public class DriverManagerFactory {

    public static DriverManager getManager(DriverType driverType) {

        switch (driverType) {
            case CHROME: {
                return new ChromeDriverManager();
            }
            case FIREFOX: {
                return new FirefoxDriverManager();
            }
            default:
                throw new IllegalArgumentException("Unexpected Value:" + driverType);
        }

    }

}