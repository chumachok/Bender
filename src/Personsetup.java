import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Personsetup
{
    public static void main (String[] args) {
        Random random = new Random();

        String[] Stat_names = new String[8];

        Stat_names[0] = "Name";
        Stat_names[1] = "Age";
        Stat_names[2] = "Experience";
        Stat_names[3] = "Strength";
        Stat_names[4] = "Armor";
        Stat_names[5] = "Luck";
        Stat_names[6] = "health";
        Stat_names[7] = "intelligence";


        String hello = "Create a person";
        String input_name = "Input person's name: ";
        String input_age = "Input person's aaprox age: ";

        String[] person_stats = new String[8];

        Stat_Generation Stats = new Stat_Generation();

        Descriptions output = new Descriptions();
        Descriptions input = new Descriptions();

        output.display_text(hello);
        output.display_text(input_name);
        person_stats[0] = input.insert_text();
        output.display_text(input_age);
        person_stats[1] = Integer.toString(Integer.parseInt(input.insert_text()) + random.nextInt(5) - random.nextInt(10));

        for (int i = 2; i <= 7; i++)
        person_stats[i] = Integer.toString(Stats.Stat_creation(Integer.parseInt(person_stats[1])));

        output.display_text(hello);




        }












    }

