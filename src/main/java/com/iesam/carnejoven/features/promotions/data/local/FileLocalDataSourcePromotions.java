package com.iesam.carnejoven.features.promotions.data.local;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.iesam.carnejoven.features.buy.domain.Buy;
import com.iesam.carnejoven.features.promotions.domain.Promotions;

import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FileLocalDataSourcePromotions {
    private String nameFile="Promotions.txt";
    private Gson gson= new Gson();
    private final Type type= new TypeToken<Promotions>(){}.getType();
    public void savePromotion(Promotions promotions) {
        try {
            if (!Files.exists(Paths.get(nameFile))) {
                Files.createFile(Paths.get(nameFile));
            }
            FileWriter myWriter = new FileWriter(nameFile, true);
            myWriter.write(gson.toJson(promotions) + System.lineSeparator());
            myWriter.close();
            System.out.println("Datos guardados correctamente");
        } catch (IOException e) {
            System.out.println("No se pudo guardar la compra");
        }
    }
    public Promotions obtainPromotion(String id) {
        try {
            List<String> lines = Files.readAllLines(Paths.get(nameFile));
            for (String line : lines) {
                Promotions promotions = gson.fromJson(line, Promotions.class);
                if (promotions.getId().equals(id)) {
                    return promotions;
                }
            }
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error al obtener la compra");
        }
        return null;
    }
    public ArrayList<Promotions> obtainPromotions(){
        ArrayList<Promotions> promotions= new ArrayList<>();
        try{
            List<String> lines=Files.readAllLines(Paths.get(nameFile));
            for(String line:lines){
                Promotions promotion=gson.fromJson(line, Promotions.class);
                promotions.add(promotion);
            }
        }catch (IOException e) {
            System.out.println("Error al leer el archivo de promociones");
        }
        return promotions;
    }
    public void deletePromotion(String id) {
        try {
            ArrayList<Promotions> promotions = obtainPromotions();

            Iterator<Promotions> iterator = promotions.iterator();
            while (iterator.hasNext()) {
                Promotions promotion = iterator.next();
                if (promotion.getId().equals(id)) {
                    // Si se encuentra la promoción con el ID, eliminarla de la lista de promociones
                    iterator.remove();
                    System.out.println("Promoción eliminada con éxito.");
                }
            }

            // Escribir las promociones restantes de vuelta en el archivo
            FileWriter writer = new FileWriter(nameFile, false); // false Sobrescribe el archivo
            for (Promotions promotion : promotions) {
                writer.write(gson.toJson(promotion) + System.lineSeparator());
            }
            writer.close();
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error al eliminar la promoción");
        }
    }
}
