import java.util.Random;

public class Personsetup
{
    public static void main (String[] args)
    {
        Random random = new Random();

        String name = "";
        int age=0;
        int experience = 0;
        int strength = 0;
        int armor = 0;
        int luck = 0;
        int health = 0;
        int intelligence = 0;

        String hello = "Create a person";
        String input_name = "Input person's name: ";
        String input_age = "Input person's aaprox age: ";

        String [] person_stats = new String[7];

        Stat_Generation Stat_0 = new Stat_Generation(age);
        Stat_Generation Stat_1 = new Stat_Generation(experience);
        Stat_Generation Stat_2 = new Stat_Generation(strength);
        Stat_Generation Stat_3 = new Stat_Generation(armor);
        Stat_Generation Stat_4 = new Stat_Generation(luck);
        Stat_Generation Stat_5 = new Stat_Generation(health);
        Stat_Generation Stat_6 = new Stat_Generation(intelligence);

        Descriptions output = new Descriptions();
        Descriptions input = new Descriptions();

        output.display_text(hello);
        output.display_text(input_name);
        name = input.insert_text();
        output.display_text(input_age);
        age = Integer.parseInt(input.insert_text()) + random.nextInt(5);
        output.display_text(hello);







    }


}
