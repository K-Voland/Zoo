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
        if ("novozel".equals(species)) {
            System.out.println("Приветствуйте Новозеландского пушистика!");
            try {
                FileInputStream file = new FileInputStream("C:/Users/datmol/IdeaProjects/Zoo/Info/RabbitInfo/novozel.txt");
                BufferedReader sc = new BufferedReader(new InputStreamReader(file));
                String line;

                while ((line = sc.readLine()) != null) {
                    System.out.println(line);
                }
                file.close();
                sc.close();
            } catch (FileNotFoundException e) { System.out.println("Файл не найден"); }
            catch (IOException e) { e.printStackTrace(); }
        } //конец проверки на новозеландского

        if ("venskii".equals(species)) {
            System.out.println("Приветствуйте Венского пушистика!");
            try {
                FileInputStream file = new FileInputStream("C:/Users/datmol/IdeaProjects/Zoo/Info/RabbitInfo/venskii.txt");
                BufferedReader sc = new BufferedReader(new InputStreamReader(file));
                String line;

                while ((line = sc.readLine()) != null) {
                    System.out.println(line);
                }
                file.close();
                sc.close();
            } catch (FileNotFoundException e) { System.out.println("Файл не найден"); }
            catch (IOException e) { e.printStackTrace(); }
        } //конец проверки на венского

        if ("france".equals(species)) {
            System.out.println("Приветствуйте Французского пушистика!");
            try {
                FileInputStream file = new FileInputStream("C:/Users/datmol/IdeaProjects/Zoo/Info/RabbitInfo/france.txt");
                BufferedReader sc = new BufferedReader(new InputStreamReader(file));
                String line;

                while ((line = sc.readLine()) != null) {
                    System.out.println(line);
                }
                file.close();
                sc.close();
            } catch (FileNotFoundException e) { System.out.println("Файл не найден"); }
            catch (IOException e) { e.printStackTrace(); }
        } //конец проверки на французского

    }
}
