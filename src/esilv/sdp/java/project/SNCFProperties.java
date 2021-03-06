package esilv.sdp.java.project;

import java.io.IOException;
import java.util.Properties;

public class SNCFProperties {
    private static Properties props;

    private SNCFProperties() {
        props = new Properties();
        try {
            props.load(getClass().getResourceAsStream("config.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static SNCFProperties getInstance() {
        return Holder.instance;
    }
    private static class Holder {
        static SNCFProperties instance = new SNCFProperties();
    }

    public String getProperty(String key) {
        return props.getProperty(key);
    }
    public String getProperty(String key, String defaultValue) {
        return props.getProperty(key, defaultValue);
    }

}