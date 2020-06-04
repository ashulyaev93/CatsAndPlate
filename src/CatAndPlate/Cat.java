package CatAndPlate;

public class Cat
{
    private String name;
    private int appetite;
    private boolean isCheakEat = false;

    public Cat(String name, int appetite)
    {
        this.name = name;
        this.appetite = appetite;
    }

    public void eat (Plate p)
    {
        isCheakEat = p.checkEat(appetite);
    }
//проверка еды
    public boolean isCheakEat()
    {
        return isCheakEat;
    }
}
