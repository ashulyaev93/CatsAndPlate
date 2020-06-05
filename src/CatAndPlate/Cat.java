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

    public void eat (Plate plate)
    {
        isCheakEat = plate.checkEat(name, appetite);
    }
    //проверка еды в тарелке
    public boolean isCheakEat()
    {
        return isCheakEat;
    }
}
