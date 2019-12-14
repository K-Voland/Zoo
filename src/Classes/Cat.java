package Classes;

import java.io.*;
import java.util.ArrayList;

public class Cat extends Pet {
    ArrayList<String> cats = new ArrayList<>();

    @Override
    public void AddPets() {
        cats.add(" 1) Манчкин");
        cats.add(" 2) Мейн-кун");
        cats.add(" 3) Сиамская кошка");
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
    @Override
    public void GetInfo(Pet pet, String species) {
        System.out.println("Класс кошек к услугам!");
        super.url += "CatInfo";
        switch (species) {
            case "mainkun":
                super.url += "/mainkun.txt";
                break;
            case "manchkin":
                super.url += "/manchkin.txt";
                break;
            case "siam":
                super.url += "/siam.txt";
                break;
        }
        super.GetInfo(pet, species);
        System.out.println(url);
    }
}
