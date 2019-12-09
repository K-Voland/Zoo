package Classes;

import java.util.Scanner;

public class Start {

    private static String name;
    Scanner reader = new Scanner(System.in);

    public void Greeting() {
        String work;

        StoreServices service = new StoreServices();
        service.AddServices();
        service.AddPet();

        try {
            System.out.println("Добро пожаловать в наш магазин,как вам можно обращаться?");
            Thread.sleep(2000);
            System.out.println("Введите ваше имя:");
            name = reader.nextLine();
            if(name != null) {
                System.out.println("Добро пожаловать, " + name + "!");
                System.out.println("Наш магазин предоставляет такие услуги: " + service.ListService());
                System.out.println("Что желаете: Купить, Селекционировать или Получить информацию?");
                work = reader.nextLine().toLowerCase();

                switch (work) {
                    case "купить" :
                        service.buy();
                        break;
                    case "селекционировать" :
                        service.selection();
                        break;
                    case "получить информацию" :
                        service.info();
                        break;

                } // конец свича

            } // конец приветствия(if)
        } catch (Exception e) { e.printStackTrace(); }

    }

    public String getName() {
        return name;
    }
}
