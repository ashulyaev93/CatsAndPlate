package CatAndPlate;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        //Тарелка общая для всех котов;
        Plate plate = new Plate (120);
        plate.info();

        //Массив котов;
        Cat[] cats = new Cat[3];
        cats[0] = new Cat("Phill",40);
        cats[1] = new Cat("Tom", 30);
        cats[2] = new Cat("Baks", 50);

        for(int i = 0; i < cats.length; i++)
        {
            cats[i].eat(plate);
            System.out.println("Сытость кота: " + cats[i].isCheakEat());
            boolean isEat = cats[i].isCheakEat();
                    if(!isEat)
                    {
                        System.out.println("Добавьте в тарелку еду!");
                        Scanner scan = new Scanner(System.in);
                        int addedFood = scan.nextInt();
                        plate.addEat(addedFood);
                        cats[i].eat(plate);
                    }
        }
        System.out.println("Все коты наелись!");
    }
}

