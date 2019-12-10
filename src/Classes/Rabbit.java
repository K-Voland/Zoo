package Classes;

import java.util.ArrayList;

public class Rabbit extends Pet {
    ArrayList<String> rabbits = new ArrayList<>();

    @Override
    public void AddPets() {
        rabbits.add("Новозеландский красный");
        rabbits.add("Венский голубой кролик ");
        rabbits.add("Французский великан");
    }
    @Override
    public String ListPet() {
        AddPets();
        String pet = "";
        for(String s : rabbits) {
            pet += "\n" + s;
        }
        return pet;
    }
}
