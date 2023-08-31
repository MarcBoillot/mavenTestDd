package com.baeldung;

import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

import static org.junit.Assert.assertTrue;

public class DataBaseTest {

    @Test
    public void TestDatabaseConnection() {
        String url = "jdbc:mysql://localhost:3306/dungeonDragon";
        Properties properties = new Properties();
        properties.setProperty("heroes.username", "marc");
        properties.setProperty("heroes.password", "1234");

        try {
            String username = properties.getProperty("heroes.username");
            String password = properties.getProperty("heroes.password");

            Connection connection = DriverManager.getConnection(url, username, password);
            assertTrue(true);
        } catch (Exception e) {
            e.printStackTrace();
            assertTrue(false);
        }
    }
}