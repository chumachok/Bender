import java.util.Random;

public class Person_creation
{

    public static String [] Creation ()
    {
        Random random = new Random();

        Descriptions output = new Descriptions();
        Descriptions input = new Descriptions();
        Stat_Generation Stats = new Stat_Generation();

        String input_name = "Input person's name: ";
        String input_age = "Input person's aaprox age: ";
        String [] person_stats = new String [8];

        output.display_text(input_name);
        person_stats[0] = input.insert_text();
        output.display_text(input_age);
        person_stats[1] = Integer.toString(Integer.parseInt(input.insert_text()) + random.nextInt(5) - random.nextInt(10));

        for (int i = 2; i <= 7; i++)
            person_stats[i] = Integer.toString(Stats.Stat_creation(Integer.parseInt(person_stats[1])));

        return person_stats;
    }

}
