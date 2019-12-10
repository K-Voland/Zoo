package Classes;

import java.util.ArrayList;

public class Cat extends Pet {
    ArrayList<String> cats = new ArrayList<>();

    @Override
    public void AddPets() {
        cats.add("Манчкин");
        cats.add("Мейн-кун");
        cats.add("Сиамская кошка");
    }
    @Override
    public String ListPet() {
        AddPets();
        String pet = "";
        for(String s : cats) {
            pet += "\n" + s;
        }
        return pet;
    }
}
