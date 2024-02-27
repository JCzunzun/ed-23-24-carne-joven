package com.iesam.carnejoven.features.user.data.local;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.iesam.carnejoven.features.user.domain.User;

import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileLocalDataSourceUser {

    private String nameFile="Users.txt";
    private Gson gson= new Gson();
    private final Type type= new TypeToken<User>(){}.getType();
    public void saveUser(User user) {
        try {
            if (!Files.exists(Paths.get(nameFile))) {
                Files.createFile(Paths.get(nameFile));
            }
            FileWriter myWriter = new FileWriter(nameFile, true);
            myWriter.write(gson.toJson(user) + System.lineSeparator());
            myWriter.close();
            System.out.println("Datos guardados correctamente");
        } catch (IOException e) {
            System.out.println("No se pudo guardar la compañia");
        }
    }
    public User obtainCompany(String id) {
        try {
            List<String> lines = Files.readAllLines(Paths.get(nameFile));
            for (String line : lines) {
                User user = gson.fromJson(line, User.class);
                if (user.getNif().equals(id)) {
                    return user;
                }
            }
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error al obtener las compañias");
        }
        return null;
    }
}
