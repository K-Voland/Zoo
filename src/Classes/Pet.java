package Classes;

import java.io.*;

public abstract class Pet {
        String url = "C:/Users/datmol/IdeaProjects/Zoo/Info/";

    public void AddPets() {

    }

    public String ListPet() {
        return null;
    }

    public void GetInfo(Pet pet, String species) {
                try {
                    FileInputStream file = new FileInputStream(url);
                    BufferedReader sc = new BufferedReader(new InputStreamReader(file));
                    String line;

                    while ((line = sc.readLine()) != null) {
                        System.out.println(line);
                    }
                    file.close();
                    sc.close();
                } catch (FileNotFoundException e) {
                    System.out.println("Файл не найден");
                } catch (IOException e) { e.printStackTrace(); }
    }

    public void PetInfo(Pet pet, String species) {

    }

}
