package view;

import model.ToyStore;

public class Raffle extends Action{

    public Raffle(ToyStore toyStore) {
        super(toyStore);
    }

    @Override
    public void execute() {
        toyStore.raffle();
    }
}
