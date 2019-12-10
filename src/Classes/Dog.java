package Classes;

import java.util.ArrayList;

public class Dog extends Pet {
    ArrayList<String> dogs = new ArrayList<>();

    @Override
    public void AddPets() {
        dogs.add("Немецкая овчарка");
        dogs.add("Корги");
        dogs.add("Доберман");
    }
    @Override
    public String ListPet() {
        AddPets();
        String pet = "";
        for(String s : dogs) {
            pet += "\n" + s;
        }
        return pet;
    }
}
