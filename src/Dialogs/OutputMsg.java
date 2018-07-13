package Dialogs;

import Characteristic.AllStats;
import java.util.ArrayList;

public class OutputMsg implements Messages
{
    @Override
    public void showText(String text)
    {
        System.out.println(text);
    }

    @Override
    public void showStringArray(String[] textarray)
    {
        for (int i = 0; i <= textarray.length-1; i++)
        {
            System.out.println(textarray[i]);
        }
    }

    @Override
    public void showIntArray(int[] intarray)
    {
        for (int i = 0; i <= intarray.length-1; i++)
        {
            System.out.println(intarray[i]);
        }
    }

    @Override
    public void showPersonStats(AllStats fullperson)
    {
        AllStats[] fullPersonStats = new AllStats[8];
        ArrayList<AllStats> stats = new ArrayList<AllStats>();
        for (AllStats b: stats)
        {
            System.out.println(b);
        }
    }

    @Override
    public void showInt(int value) {

    }

    @Override
    public String getStringValue() {
        return null;
    }

    @Override
    public int getIntValue() {
        return 0;
    }
}
