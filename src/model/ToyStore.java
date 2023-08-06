package model;

import controller.implimentation.PrizeSelectionImpl;
import controller.implimentation.PrizeStorageImpl;

import java.util.ArrayList;
import java.util.List;

public class ToyStore {
    private List<Toy> toys;
    private List<Toy> prizeToys;
    private PrizeSelectionImpl prizeSelection;
    private PrizeStorageImpl prizeStorage;

    public ToyStore(PrizeSelectionImpl prizeSelection, PrizeStorageImpl prizeStorage) {
        this.toys = new ArrayList<>();
        this.prizeToys = new ArrayList<>();
        this.prizeSelection = prizeSelection;
        this.prizeStorage = prizeStorage;
    }

    public void addToy(Toy toy){
        toys.add(toy);
    }

    public void updateWeight(int toyId, double weight){
        for (Toy toy : toys){
            if(toy.getId() == toyId){
                toy.setWeight(weight);
                break;
            }
        }
    }
    public List<Toy> getAvailableToys() {
        return new ArrayList<>(toys);
    }

    public void raffle() {
        Toy prizeToy = prizeSelection.selectToyForPrize(toys);
        if (prizeToy != null) {
            prizeToys.add(prizeToy);
            removePrizeToyFromList(prizeToy);
            prizeStorage.savePrizeToy(prizeToy);
            System.out.println("Congratulations! You won a toy: " + prizeToy.getName());
        }
    }

    private void removePrizeToyFromList(Toy prizeToy) {
        for (int i = 0; i < toys.size(); i++) {
            Toy toy = toys.get(i);
            if (toy.getId() == prizeToy.getId()) {
                toy.decreaseQuantity();
                if (toy.getQuantity() == 0) {
                    toys.remove(i);
                }
                break;
            }
        }
    }

}
