import java.util.Random;

public class Personsetup
{
    public static void main (String[] args) {
        Random random = new Random();

        String[] stat_names = new String[8];
        Stat_Generation Stats = new Stat_Generation();
        Descriptions output = new Descriptions();
        Descriptions input = new Descriptions();
        Descriptions printAll = new Descriptions();

        stat_names[0] = "Name";
        stat_names[1] = "Age";
        stat_names[2] = "Experience";
        stat_names[3] = "Strength";
        stat_names[4] = "Armor";
        stat_names[5] = "Luck";
        stat_names[6] = "health";
        stat_names[7] = "intelligence";

        String input_name = "Input person's name: ";
        String input_age = "Input person's aaprox age: ";
        String players_number = "Input number of players: ";

        output.display_text(players_number);
        int players_num = Integer.parseInt(input.insert_text());
        String[][] person_stats = new String[players_num][8];

        for (int player_counter = 0; player_counter <= players_num-1; player_counter++)
        {
            output.display_text(input_name);
            person_stats[player_counter][0] = input.insert_text();
            output.display_text(input_age);
            person_stats[player_counter][1] = Integer.toString(Integer.parseInt(input.insert_text()) + random.nextInt(5) - random.nextInt(10));

            for (int i = 2; i <= stat_names.length - 1; i++)
                person_stats[player_counter][i] = Integer.toString(Stats.Stat_creation(Integer.parseInt(person_stats[player_counter][1])));
        }

        printAll.display_all_stats(stat_names, person_stats );
        System.out.println(" ");
    }
}
