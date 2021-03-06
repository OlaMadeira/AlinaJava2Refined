package animal;

public class Tiger extends Animal
{
    /**
     * Статическое поле. Едино для всех созданных экземпляров тигров
     */
    public static int tigerCounter = 0;

    /**
     * Не статическое поле. Уникально и изменяемо для каждого тигра.
     * Не может быть получено через Tiger.name, может быть получен для tiger.name
     */
    public String name = "(empty)";

    public Tiger(String name) {
        this.name = name;
    }

    private int kittenCount = 0;

    /**
     * Конструктор класса. Вызывается каждый раз при вызове new Tiger()
     */
    public Tiger()
    {
        tigerCounter = tigerCounter + 1;
    }

    @Override
    public boolean isCanSpeak()
    {
        return false;
    }

    /**
     * Увеличиваем значение kittenCount
     */
    public void addOneMore()
    {
        kittenCount = kittenCount +1;
    }

    /**
     * @return текущее значение kittenCount
     */
    public int getCurrentCounter()
    {
        int currentKittenCount = kittenCount;
        return kittenCount;
    }

}
