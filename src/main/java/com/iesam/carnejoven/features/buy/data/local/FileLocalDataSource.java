package com.iesam.carnejoven.features.buy.data.local;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.iesam.carnejoven.features.buy.domain.Buy;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
public class FileLocalDataSource {
    private String nameFile="Buying.txt";
    private Gson gson= new Gson();
    private final Type type= new TypeToken<Buy>(){}.getType();
    public void saveBuy(Buy buy){
        try{
            FileWriter myWriter = new FileWriter(nameFile);
            myWriter.write(gson.toJson(buy));
            myWriter.close();
            System.out.println("Datos Guardados correctamente");
        }catch (IOException e){
            System.out.println("No se guardo La compra");
        }
    }
    public Buy obtainBuy(String id){
        try{
            String fileContent = new String(Files.readAllBytes(Paths.get(nameFile)));
            Buy[] buys = gson.fromJson(fileContent, Buy[].class);
            for(Buy buy:buys){
                if(buy.getId().equals(id)){
                    return buy;
                }
            }
        }catch (IOException e){
            System.out.println("Ha ocurrido un error no se encontro el objeto con dicha id");
        }
        return null;
    }
}
