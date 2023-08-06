package view;

import model.Toy;
import model.ToyStore;

import java.util.List;

public class Action {
    protected ToyStore toyStore;

    public Action(ToyStore toyStore){
        this.toyStore = toyStore;
    }
    public void execute(){
        System.out.println("Available Toys:");
        List<Toy> availableToys = toyStore.getAvailableToys();
        for (Toy toy : availableToys) {
            System.out.println("Toy ID: " + toy.getId() + ", Name: " + toy.getName() + ", Brand: " + toy.getBrand() +
                    ", Quantity: " + toy.getQuantity() + ", Weight: " + toy.getWeight());
        }
    }
}
