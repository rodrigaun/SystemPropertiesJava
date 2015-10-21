package center.rodrigo.core;

import java.io.FileInputStream;
import java.util.Enumeration;
import java.util.Properties;

public class LoadProperties {

    public void load() {

        Properties prop = new Properties();
        FileInputStream input = null;

        try {
            input = new FileInputStream("system.properties");

            if (input != null) {

                prop.load(input);
                Enumeration<Object> keys = prop.keys();

                while (keys.hasMoreElements()) {
                    String key = String.valueOf(keys.nextElement());
                    System.setProperty(key, prop.getProperty(key));
                }
            }
            input.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void useProperties() {
        System.out.println(System.getProperty("numero"));
        System.out.println(System.getProperty("usuario"));
        System.out.println(System.getProperty("senha"));
        System.out.println(System.getProperty("url"));
    }
}