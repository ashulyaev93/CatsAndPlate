package CatAndPlate;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
//Сюда массив котов лучше
        System.out.println("Добавьте в тарелку еду!");
        Scanner scan = new Scanner(System.in);
        int addedFood = scan.nextInt();

        Cat cat = new Cat ("Barsik", 100);
        Plate plate = new Plate (100);
        plate.addEat(addedFood);
        plate.info();
        cat.eat(plate);
        System.out.println("Сытость кота: " + cat.isCheakEat());
    }
}
