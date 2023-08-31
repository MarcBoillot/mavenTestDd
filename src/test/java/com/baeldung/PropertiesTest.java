package com.baeldung;

import com.baeldung.dd.BDD.DataBase;
import org.junit.Test;

import java.io.FileInputStream;
import java.util.Properties;

import static org.junit.Assert.assertTrue;

public class PropertiesTest {

    @Test
    public void greeterSaysHello() {
        Properties properties = new Properties();

        try {
            properties.load(new FileInputStream(DataBase.CONFIG_FILE));
        } catch (Exception e) {
            assertTrue(false);
        }

        String username = properties.getProperty("heroes.username");
        String password = properties.getProperty("heroes.password");
        assertTrue(username, username.equalsIgnoreCase("marc"));
        assertTrue(password, password.equalsIgnoreCase("1234"));
    }

}
