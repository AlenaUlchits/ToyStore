package controller.implimentation;

import controller.PrizeSelectionI;
import model.Toy;

import java.util.List;
import java.util.Random;

public class PrizeSelectionImpl implements PrizeSelectionI {
    private Random rand;

    public PrizeSelectionImpl(){
        rand = new Random();
    }
    @Override
    public Toy selectToyForPrize(List<Toy> toys) {
        double toyWeight = toys.stream().mapToDouble(Toy :: getWeight).sum();
        double randomWeight = rand.nextDouble() * toyWeight;
        double weightSum = 0;

        for(Toy toy : toys){
            weightSum += toy.getWeight();
            if(randomWeight <= weightSum){
                return toy;
            }
        }
        return null;
    }
}
