package Classes;

import java.io.*;
import java.util.ArrayList;

public class Dog extends Pet {
    ArrayList<String> dogs = new ArrayList<>();

    @Override
    public void AddPets() {
        dogs.add(" 1) Немецкая овчарка");
        dogs.add(" 2) Корги");
        dogs.add(" 3) Доберман");
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

    @Override
    public void GetInfo(Pet pet, String species) {
        System.out.println("Класс собак к услугам!");
        super.url += "DogInfo";
            switch (species) {
                case "korgi":
                   super.url += "/korgi.txt";
                    break;
                case "nemec":
                    super.url += "/nemec.txt";
                    break;
                case "doberman":
                    super.url += "/doberman.txt";
                    break;
            }
        super.GetInfo(pet, species);
        System.out.println(url);
    }

}
