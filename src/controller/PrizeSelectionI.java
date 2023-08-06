package controller;

import model.Toy;

import java.util.List;

public interface PrizeSelectionI {
    Toy selectToyForPrize(List<Toy> toys);
}
