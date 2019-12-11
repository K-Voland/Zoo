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
        if ("manchkin".equals(species)) {
            System.out.println("Няшка с маленькими лапкамм к вашим услугам!");
            try {
                FileInputStream file = new FileInputStream("C:/Users/datmol/IdeaProjects/Zoo/Info/CatInfo/manchkin.txt");
                BufferedReader sc = new BufferedReader(new InputStreamReader(file));
                String line;

                while ((line = sc.readLine()) != null) {
                    System.out.println(line);
                }
                file.close();
                sc.close();
            } catch (FileNotFoundException e) { System.out.println("Файл не найден"); }
            catch (IOException e) { e.printStackTrace(); }
        } //конец проверки на манчкина

        if ("mainkun".equals(species)) {
            System.out.println("Пушистый гигант к вашим услугам!");
            try {
                FileInputStream file = new FileInputStream("C:/Users/datmol/IdeaProjects/Zoo/Info/CatInfo/mainkun.txt");
                BufferedReader sc = new BufferedReader(new InputStreamReader(file));
                String line;

                while ((line = sc.readLine()) != null) {
                    System.out.println(line);
                }
                file.close();
                sc.close();
            } catch (FileNotFoundException e) { System.out.println("Файл не найден"); }
            catch (IOException e) { e.printStackTrace(); }
        } //конец проверки на мейнкуна

        if ("siam".equals(species)) {
            System.out.println("Голубоглазый красавец к вашим услугам!");
            try {
                FileInputStream file = new FileInputStream("C:/Users/datmol/IdeaProjects/Zoo/Info/CatInfo/siam.txt");
                BufferedReader sc = new BufferedReader(new InputStreamReader(file));
                String line;

                while ((line = sc.readLine()) != null) {
                    System.out.println(line);
                }
                file.close();
                sc.close();
            } catch (FileNotFoundException e) { System.out.println("Файл не найден"); }
            catch (IOException e) { e.printStackTrace(); }
        } //конец проверки на сиамского
    }
}
