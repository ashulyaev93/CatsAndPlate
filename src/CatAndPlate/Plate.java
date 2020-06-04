package CatAndPlate;

public class Plate
{
    private int food;

    public Plate(int food)
    {
        this.food = food;
    }
    //Введите колличество еды, которое хотите дать коту;
    public void addEat(int food)
    {
        this.food += food;
    }

    //Информация о том, сколько еды в тарелке;
    public void info()
    {
        System.out.println("plate: " + food);
    }

    //Проверка котом еды в тарелке;
    public boolean checkEat(int appetite)
    {
        if(appetite > food)
        {
            System.out.println("Что-то мало еды! Не буду есть пока не доложишь!");
            System.out.println("plate: " + food + ". Даже не притронусь!");
            return false;
        }
        else //Изменение еды в тарелке в соответстствии аппетиту кота;
            {
                if (appetite <= food)
                {
                    food -= appetite;
                    System.out.println("Омномном.Хрум.Хрясть.");
                    System.out.println("plate: " + food);
                    return true;
                }
                else if (appetite > food) //Работало бы, если бы наглое животное не проверяло колличество еды перед тем, как идти есть;
                {
                    System.out.println("Еды в тарелке меньше, чем хотел бы съесть кот. Кот не наелся!");
                }
                return false;
            }
    }
}
