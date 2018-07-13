public class Game1
{
    public static void main (String[] args)
    {
        String[] Stat_names = new String[8];
        Descriptions output = new Descriptions();
        Descriptions input = new Descriptions();
        Descriptions printAll = new Descriptions();
        Person_creation player = new Person_creation();
        Descriptions SetNames = new Descriptions();
        Stat_names = SetNames.Set_stat_names(Stat_names);

        String players_number_title = "Players";
        String players_number = "Input number of players: ";

        output.display_text(players_number);

//        System.out.println(Integer.toString(players_number));
//        start.display_Frame(players_number_title, players_number);


        int players_num = Integer.parseInt(input.insert_text());
        String[][] person_stats = new String[players_num][8];

        for (int player_counter = 0; player_counter <= players_num-1; player_counter++)
        {
            person_stats[player_counter] = player.Creation();
        }

        printAll.display_all_stats(Stat_names, person_stats );

//        for (int player_counter = 0; player_counter <= players_num-1; player_counter++)
//        {
//            output.display_text("Select weapon");
//
//
//
//        }
    }
}
