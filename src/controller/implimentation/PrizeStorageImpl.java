package controller.implimentation;

import controller.PrizeStorageI;
import model.Toy;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class PrizeStorageImpl implements PrizeStorageI {
    private String path;

    public PrizeStorageImpl(String filePath){
        this.path = filePath;
    }
    @Override
    public void savePrizeToy(Toy toy){
        try(BufferedWriter writer = new BufferedWriter(
                new FileWriter(path, true))){
            writer.write("Toy Id: " + toy.getId() + ", Name: " + toy.getName() + ", Brand: " + toy.getBrand());
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
