package object.notification.java;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.Set;
import object.notification.java.ObjectB;

public class ObjectA {
    private int THRESHOLD;
    private int value;
    private ObjectB objB;


    ObjectA(ObjectB objB) {
        this.objB = objB;
        Properties props = new Properties();
        InputStream input = getClass().getClassLoader().getResourceAsStream("config.properties");
        try {
            props.load(input);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        this.THRESHOLD = Integer.parseInt(props.getProperty("THRESHOLD"));
    }

    public void setValue(int value) {
        this.value = value;
        if (this.value > THRESHOLD) this.notification();
    }

    private void notification() {
        this.objB.notifying();
    }
}

