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
            default: System.out.println("Извините,но у нас нет таких животных("); break;
            case "1" :
                Rabbit rabbit = new Rabbit();
                System.out.println("Отлично,я могу продать вам несколько кроликов: " + rabbit.ListPet());
                break;
            case "2" :
                Cat cat = new Cat();
                System.out.println("Отлично,я могу продать вам несколько кошек: " + cat.ListPet());
                break;
            case "3" :
                Dog dog = new Dog();
                System.out.println("Отлично,я могу продать вам несколько собак: " + dog.ListPet());
                break;
        }//конец свича покупки
    }

    public void selection() {
        String PetName;
        System.out.println("Для селекции мы можем предложить вам таких животных: " + ListPet() + "\n" + "Какие животные вас заинтересовали?");
        PetName = reader.nextLine().toLowerCase();
        switch (PetName) {
            default: System.out.println("Извините,но у нас нет таких животных("); break;
            case "1" :
                Rabbit rabbit = new Rabbit();
                System.out.println("Отлично, для селекции у нас есть несколько пород кроликов: " + rabbit.ListPet());
                break;
            case "2" :
                Cat cat = new Cat();
                System.out.println("Отлично, для селекции у нас есть несколько пород кошек: " + cat.ListPet());
                break;
            case "3" :
                Dog dog = new Dog();
                System.out.println("Отлично, для селекции у нас есть несколько пород собак: " + dog.ListPet());
                break;

        } //конец свича селекции
    }

    public void info() {
        String PetName;
        String Pet;

        System.out.println("Наш магазин может предоставить вам информацию о таких животных: " + ListPet() + "\n" + "Какие животные вас заинтересовали?");
        PetName = reader.nextLine().toLowerCase();

        switch (PetName) {
            default:
                System.out.println("Извините,но у нас нет таких животных("); break;
            case "1" :
                Rabbit rabbit = new Rabbit();

                System.out.println("Отлично, вы можете получить информацию о таких породах кроликов: " + rabbit.ListPet());
                System.out.println("Информацию о каком кролике вы хотите?");
                Pet = reader.nextLine().toLowerCase();

                if (Pet.equals("1")) {
                    rabbit.GetInfo(rabbit,"novozel");
                } else if(Pet.equals("2")) {
                    rabbit.GetInfo(rabbit,"venskii");
                } else if(Pet.equals("3")) {
                    rabbit.GetInfo(rabbit,"france");
                } else System.out.println("Простите,но у нас нет такой породы кроликов");
                break;
            case "2" :
                Cat cat = new Cat();

                System.out.println("Отлично, вы можете получить информацию о таких породах кошек: " + cat.ListPet());
                System.out.println("Информацию о какой кошке вы хотите?");

                Pet = reader.nextLine().toLowerCase();
                if (Pet.equals("1")) {
                    cat.GetInfo(cat,"manchkin");
                } else if(Pet.equals("2")) {
                    cat.GetInfo(cat,"mainkun");
                } else if(Pet.equals("3")) {
                    cat.GetInfo(cat,"siam");
                } else System.out.println("Простите,но у нас нет такой породы кошек");
                break;
            case "3" :
                Dog dog = new Dog();

                System.out.println("Отлично, вы можете получить информацию о таких породах собак: " + dog.ListPet());
                System.out.println("Информацию о какой собаке вы хотите?");

                Pet = reader.nextLine().toLowerCase();
                if (Pet.equals("1")) {
                    dog.GetInfo(dog,"nemec");
                } else if(Pet.equals("2")) {
                    dog.GetInfo(dog,"korgi");
                } else if(Pet.equals("3")) {
                    dog.GetInfo(dog,"doberman");
                } else System.out.println("Простите,но у нас нет такой породы собак");
                break;

        } //конец свича информации


    }
}
