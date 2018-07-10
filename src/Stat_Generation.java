import java.util.Random;

public class Stat_Generation
{
    public Stat_Generation(int stat)
    {
        stat_name = stat;
    }

    private int stat_name;
    Random random = new Random();

    public int Stat_creation(int type)
    {
        type += random.nextInt(100);
        return type;
    }


}
