import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

public class Pet {

    ArrayList<String> pets = new ArrayList<>();

    public void AddPet() {
        pets.add("Кролики");
        pets.add("Кошки");
        pets.add("Собаки");
    }

    public String ListPet() {
        String pet = "";
        for(String s : pets) {
               pet += "\n" + s;
            }
        return pet;
    }


    public void buy() {

    }

    public void selection() {

    }

}
