package Classes;

import java.util.ArrayList;

public class StoreServices {
    ArrayList<String> pets = new ArrayList<>();
    ArrayList<String> services = new ArrayList<>();

    public void AddPet () {
        pets.add(" 1) Кролики");
        pets.add(" 2) Кошки");
        pets.add(" 3) Собаки");
    }
    public String ListPet() { // Метод вывода списка животных в приветсвии
        String pet = "";
        for(String s : pets) {
            pet += "\n" + s;
        }
        return pet;
    }

    public void AddServices() {
        services.add(" 1) Купить взрослого животного");
        services.add(" 2) Селекционировать");
        services.add(" 3) Получить информацию о всех животных");
    }
    public String ListService() {  // Метод вызова списка услуг
        String service = "";
        for(String s : services){
            service += "\n" + s;
        }
        return service;
    }



    public void buy() {
        System.out.println("У нас вы можете купить таких животных: " + ListPet() +"\n" + "Какие животные вас заинтересовали?");
    }

    public void selection() {
        System.out.println("Для селекции мы можем предложить вам таких животных: " + ListPet() + "\n" + "Какие животные вас заинтересовали?");
    }

    public void info() {
        System.out.println("Наш магазин может предоставить вам информацию о таких животных: " + ListPet() + "\n" + "Какие животные вас заинтересовали?");
    }
}
