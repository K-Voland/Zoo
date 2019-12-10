package Classes;

import java.util.ArrayList;
import java.util.Scanner;

public class StoreServices {
    ArrayList<String> pets = new ArrayList<>();
    ArrayList<String> services = new ArrayList<>();

    Scanner reader = new Scanner(System.in);

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
        String PetName;
        System.out.println("У нас вы можете купить таких животных: " + ListPet() +"\n" + "Какие животные вас заинтересовали?");
        PetName = reader.nextLine().toLowerCase();
        switch (PetName) {
            case "кролики" :
                Rabbit rabbit = new Rabbit();
                System.out.println("Отлично,я могу продать вам несколько кроликов: " + rabbit.ListPet());
                break;
            case "кошки" :
                Cat cat = new Cat();
                System.out.println("Отлично,я могу продать вам несколько кошек: " + cat.ListPet());
                break;
            case "собаки" :
                Dog dog = new Dog();
                System.out.println("Отлично,я могу продать вам несколько собак: " + dog.ListPet());
                break;

        }
    }

    public void selection() {
        String PetName;
        System.out.println("Для селекции мы можем предложить вам таких животных: " + ListPet() + "\n" + "Какие животные вас заинтересовали?");
        PetName = reader.nextLine().toLowerCase();
        switch (PetName) {
            case "кролики" :
                Rabbit rabbit = new Rabbit();
                System.out.println("Отлично, для селекции у нас есть несколько пород кроликов: " + rabbit.ListPet());
                break;
            case "кошки" :
                Cat cat = new Cat();
                System.out.println("Отлично, для селекции у нас есть несколько пород кошек: " + cat.ListPet());
                break;
            case "собаки" :
                Dog dog = new Dog();
                System.out.println("Отлично, для селекции у нас есть несколько пород собак: " + dog.ListPet());
                break;

        }
    }

    public void info() {
        System.out.println("Наш магазин может предоставить вам информацию о таких животных: " + ListPet() + "\n" + "Какие животные вас заинтересовали?");
    }
}
