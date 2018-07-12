import java.util.Scanner;

public class Descriptions
{
    public static String [] Set_stat_names(String [] stat_names)
    {
        stat_names[0] = "Name";
        stat_names[1] = "Age";
        stat_names[2] = "Experience";
        stat_names[3] = "Strength";
        stat_names[4] = "Armor";
        stat_names[5] = "Luck";
        stat_names[6] = "health";
        stat_names[7] = "intelligence";

        return stat_names;
    }

    public static String insert_text ()
    {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        return text;
    }

    public static void display_text (String text)
    {
        System.out.println(text);
    }

    public static void display_neded_stat (int point, String[] stat_values)
    {
        System.out.println(stat_values[point]);
    }

    public static void display_all_stats (String[] stat_names, String [][] stat_values)
    {
        for (int i = 0; i <= stat_values.length-1; i++) {
            for (int j = 0; j <= stat_names.length - 1; j++)
                System.out.println(stat_names[j] + ": " + stat_values[i][j]);
            System.out.println(" ");
        }
    }

}
