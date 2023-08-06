package view;

import model.ToyStore;
import model.Toy;

import java.util.Scanner;

public class AddNewToy extends Action{

    public AddNewToy(ToyStore toyStore) {
        super(toyStore);
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Toy ID:");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter Toy Name:");
        String name = scanner.nextLine();

        System.out.println("Enter Toy Brand:");
        String brand = scanner.nextLine();

        System.out.println("Enter Toy Quantity:");
        int quantity = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter Toy Weight:");
        double weight = scanner.nextDouble();
        scanner.nextLine();

        Toy toy = new Toy(id, name, brand, quantity, weight);
        toyStore.addToy(toy);
        System.out.println("Toy added successfully.");
    }
}
