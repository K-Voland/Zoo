package Classes;

import java.io.*;
import java.util.ArrayList;

public class Rabbit extends Pet {
    ArrayList<String> rabbits = new ArrayList<>();

    @Override
    public void AddPets() {
        rabbits.add(" 1) Новозеландский красный");
        rabbits.add(" 2) Венский голубой кролик ");
        rabbits.add(" 3) Французский великан");
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

    @Override
    public void GetInfo(Pet pet, String species) {
        System.out.println("Класс кроликов к услугам!");
        super.url += "RabbitInfo";
        switch (species) {
            case "france":
                super.url += "/france.txt";
                break;
            case "novozel":
                super.url += "/novozel.txt";
                break;
            case "venskii":
                super.url += "/venskii.txt";
                break;
        }
        super.GetInfo(pet, species);
        System.out.println(url);
    }
}
