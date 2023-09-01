package com.baeldung.dd.BDD;

import com.baeldung.dd.characters.Characters;
import com.baeldung.dd.characters.Magician;
import com.baeldung.dd.characters.Warrior;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.IOException;
import java.util.Properties;
import java.io.FileInputStream;

public class DataBase {
    /**
     * recuperation du .env
     */
    public static final String CONFIG_FILE = ".env";

    /**
     * @return
     * @throws DataBaseException retourne une erreur pour la base de donnée
     */
    public static List<Characters> getHeroes() throws DataBaseException {
        List<Characters> heroes = new ArrayList<>();

        String url;
        String username;
        String password;
        /**
         * je stock la config dans les properties et je lis la config
         */
        try {
            Properties properties = new Properties();
            properties.load(new FileInputStream(CONFIG_FILE));

            url = "jdbc:mysql://localhost:3306/dungeonDragon";
            username = properties.getProperty("heroes.username");
            password = properties.getProperty("heroes.password");
        } catch (IOException e) {
            throw new DataBaseException("Erreur lors de la lecture du fichier de configuration");
        }
        /**
         * je test ma connexion dans le premier try et ensuite je recupere les données présente dans la bdd
         */
        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            String query = "SELECT type, name, strength, life FROM hero";

            try (PreparedStatement statement = connection.prepareStatement(query);
                 ResultSet resultSet = statement.executeQuery()) {

                while (resultSet.next()) {
                    String type = resultSet.getString("type");
                    String name = resultSet.getString("name");
                    int strength = resultSet.getInt("strength");
                    int life = resultSet.getInt("life");
                    /**
                     * il met une ref vers la class en attente
                     */
                    Class<?> characters = Class.forName("com.baeldung.dd.characters." + type);
//                    String str = type;
//                    str = str.substring(0, 1).toUpperCase() + str.substring(1);
                    /**
                     * recupere le construct de la class
                     */
                    Constructor<?> charConstruct = characters.getConstructor(String.class, int.class, int.class);
                    /**
                     * il instancie
                     */
                    Object characterInstan = charConstruct.newInstance(name, life, strength);
                    /**
                     * il ajoute a heroes la class instanciée
                     */
                    heroes.add((Characters) characterInstan);

//                    if ("Warrior".equals(type)) {
//                        Warrior warrior = new Warrior(name, strength, life);
//                        heroes.add(warrior);
//                    } else if ("magician".equals(type)) {
//                        Magician magician = new Magician(name, strength, life);
//                        heroes.add(magician);
//                    }
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }

        } catch (SQLException e) {
            throw new DataBaseException("Erreur lors de l'accès à la base de données");
        }

        return heroes;
    }
}