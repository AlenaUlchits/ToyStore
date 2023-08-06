package view;

import model.ToyStore;

import java.util.Scanner;

public class UpdateToyWeight extends Action{

    public UpdateToyWeight(ToyStore toyStore) {
        super(toyStore);
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Toy ID:");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter New Weight:");
        double weight = scanner.nextDouble();
        scanner.nextLine();

        toyStore.updateWeight(id, weight);
        System.out.println("Toy weight updated successfully.");
    }
}
