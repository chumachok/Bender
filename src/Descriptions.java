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

    public static void display_all_stats (String[] stat_names, String [][] stat_values)
    {
        for (int i = 0; i <= stat_values.length-1; i++) {
            for (int j = 0; j <= stat_names.length - 1; j++)
                System.out.println(stat_names[j] + ": " + stat_values[i][j]);
            System.out.println(" ");
        }

    }

}
