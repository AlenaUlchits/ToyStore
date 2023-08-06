import controller.implimentation.PrizeSelectionImpl;
import controller.implimentation.PrizeStorageImpl;
import model.ToyStore;
import view.*;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        PrizeSelectionImpl prizeSelection = new PrizeSelectionImpl();
        PrizeStorageImpl prizeStorage = new PrizeStorageImpl("prize_toys.txt");
        ToyStore toyStore = new ToyStore(prizeSelection, prizeStorage);
        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu(scanner);
        menu.addOption("Add New Toy", new AddNewToy(toyStore));
        menu.addOption("Update Toy Weight", new UpdateToyWeight(toyStore));
        menu.addOption("Organize Raffle", new Raffle(toyStore));
        menu.addOption("Show Available Toys", new Action(toyStore));

        menu.show();
        scanner.close();
    }
}