package com.iesam.carnejoven.features.buy.data.local;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.iesam.carnejoven.features.buy.domain.Buy;

import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
public class FileLocalDataSourceBuy {
    private String nameFile="Buying.txt";
    private Gson gson= new Gson();
    private final Type type= new TypeToken<Buy>(){}.getType();
    public void saveBuy(Buy buy) {
        try {
            if (!Files.exists(Paths.get(nameFile))) {
                Files.createFile(Paths.get(nameFile));
            }
            FileWriter myWriter = new FileWriter(nameFile, true);
            myWriter.write(gson.toJson(buy) + System.lineSeparator());
            myWriter.close();
            System.out.println("Datos guardados correctamente");
        } catch (IOException e) {
            System.out.println("No se pudo guardar la compra");
        }
    }
    public Buy obtainBuy(String id) {
        try {
            List<String> lines = Files.readAllLines(Paths.get(nameFile));
            for (String line : lines) {
                Buy buy = gson.fromJson(line, Buy.class);
                if (buy.getId().equals(id)) {
                    return buy;
                }
            }
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error al obtener la compra");
        }
        return null;
    }
}
