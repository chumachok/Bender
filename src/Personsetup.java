import java.util.Random;

public class Personsetup
{
    public static void main (String[] args) {

        String[] stat_names = new String[8];
        Descriptions output = new Descriptions();
        Descriptions input = new Descriptions();
        Descriptions printAll = new Descriptions();
        Person_creation player = new Person_creation();

        stat_names[0] = "Name";
        stat_names[1] = "Age";
        stat_names[2] = "Experience";
        stat_names[3] = "Strength";
        stat_names[4] = "Armor";
        stat_names[5] = "Luck";
        stat_names[6] = "health";
        stat_names[7] = "intelligence";

        String players_number = "Input number of players: ";

        output.display_text(players_number);
        int players_num = Integer.parseInt(input.insert_text());
        String[][] person_stats = new String[players_num][8];

        for (int player_counter = 0; player_counter <= players_num-1; player_counter++)
        {
            person_stats[player_counter] = player.Creation();
        }

        printAll.display_all_stats(stat_names, person_stats );
    }
}
