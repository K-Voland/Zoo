import java.nio.channels.MulticastChannel;
import java.util.Scanner;

public class Start {
    private static String name;
    private static String work;
    Pet pet = new Pet();


    public void Greeting() {
        pet.AddPet();
        try {
            Scanner reader = new Scanner(System.in);
            System.out.println("Добро пожаловать в наш магазин,как вам можно обращаться?");
            Thread.sleep(2000);

            System.out.println("Введите ваше имя:");
            name = reader.nextLine();

            if (name != null) {
                System.out.println("Добро пожаловать, " + name + "!");
                System.out.println("Наш магазин предоставляет такой выбор действий: \n" + " 1) Купить взрослого животного \n"
                        + " 2) Селекционировать \n" + " 3) Вывести информацию о всех животных ");
                System.out.println("Что желаете: Купить, Селекционировать или Вывести?");
                work = reader.nextLine();

                System.out.println("В нашем магазине есть несколько видов домашних животных: " + pet.ListPet());

                System.out.println("С каким животным вы хотите это выполнить?");


            }
        } catch (InterruptedException e) { e.printStackTrace(); }
    }

    public String getName() {
        return name;
    }
}
