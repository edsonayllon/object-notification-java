package object.notification.java;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ObjectB {
    private String NOTIFICATION_MESSAGE;
    private Properties props = new Properties();

    ObjectB() {
        Properties props = new Properties();
        InputStream input = getClass().getClassLoader().getResourceAsStream("config.properties");
        try {
            props.load(input);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        this.NOTIFICATION_MESSAGE = props.getProperty("NOTIFICATION_MESSAGE");
    }

    public String notifying() {
        System.out.println(this.NOTIFICATION_MESSAGE);
        return this.NOTIFICATION_MESSAGE;
    }
}

