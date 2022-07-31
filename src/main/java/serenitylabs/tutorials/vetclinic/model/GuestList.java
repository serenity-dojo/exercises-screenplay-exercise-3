package serenitylabs.tutorials.vetclinic.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.TreeSet;

import static java.util.Comparator.comparing;

public class GuestList {

    private Collection<Pet> pets = new TreeSet<>(comparing(Pet::getName));

    public List<Pet> getGuests() {
        return new ArrayList<>(pets);
    }

    public void add(Pet pet) {
        pets.add(pet);
    }

    public int size() {
        return pets.size();
    }

    public boolean remove(Pet pet) {
        return pets.remove(pet);
    }
}
