import java.util.Random;

public class Stat_Generation
{
//    public Stat_Generation(String stat)
//    {
//        stat_name = stat;
//    }
//
//    private String stat_name;
    Random random = new Random();

    public int Stat_creation(int age)
    {
        int stat_value = 0;
        for(int i = 1; i <= age; i++)
            stat_value += random.nextInt(100);

        return stat_value;
    }


}
