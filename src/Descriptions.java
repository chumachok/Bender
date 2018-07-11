import java.util.Scanner;

public class Descriptions
{
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

    public static void display_all_stats (String[] stat_names, String [] stat_values)
    {
        for (int i = 0; i <= stat_names.length; i++)
        {
            System.out.println(stat_names[i]+ ": " + stat_values[i]);
        }
    }

}
