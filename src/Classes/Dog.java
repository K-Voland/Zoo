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
            if ("korgi".equals(species)) {
                System.out.println("Корги: заняшкаю тебя своей большой и пушистой жопкой!");
                try {
                    FileInputStream file = new FileInputStream("C:/Users/datmol/IdeaProjects/Zoo/Info/DogInfo/korgi.txt");
                    BufferedReader sc = new BufferedReader(new InputStreamReader(file));
                    String line;

                    while ((line = sc.readLine()) != null) {
                        System.out.println(line);
                    }
                    file.close();
                    sc.close();
                } catch (FileNotFoundException e) { System.out.println("Файл не найден"); }
                catch (IOException e) { e.printStackTrace(); }
            } //конец проверки на корги

            if ("nemec".equals(species)) {
                System.out.println("Немец: о, дружище, я так скучал!!!");
                try {
                    FileInputStream file = new FileInputStream("C:/Users/datmol/IdeaProjects/Zoo/Info/DogInfo/nemec.txt");
                    BufferedReader sc = new BufferedReader(new InputStreamReader(file));
                    String line;

                    while ((line = sc.readLine()) != null) {
                        System.out.println(line);
                    }
                    file.close();
                    sc.close();
                } catch (FileNotFoundException e) { System.out.println("Файл не найден"); }
                catch (IOException e) { e.printStackTrace(); }
            } //конец проверки на немца

            if ("doberman".equals(species)) {
                System.out.println("Доберман: ты только посмотри,на каком уровне брутальности я нахожусь.");
                try {
                    FileInputStream file = new FileInputStream("C:/Users/datmol/IdeaProjects/Zoo/Info/DogInfo/doberman.txt");
                    BufferedReader sc = new BufferedReader(new InputStreamReader(file));
                    String line;

                    while ((line = sc.readLine()) != null) {
                        System.out.println(line);
                    }
                    file.close();
                    sc.close();
                } catch (FileNotFoundException e) { System.out.println("Файл не найден"); }
                catch (IOException e) { e.printStackTrace(); }
            } //конец проверки на добермана
        }

}
