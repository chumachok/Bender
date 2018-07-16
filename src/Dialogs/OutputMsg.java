package Dialogs;

import Characteristic.AllStats;
import Weapons.AllImprovements;

import java.sql.SQLOutput;

public class OutputMsg implements Output
{
    @Override
    public void showText(String text)
    {
        System.out.println(text);
    }

    @Override
    public void showPersonStats(AllStats fullperson)
    {
        System.out.println("Name: " + fullperson.Name);
        System.out.println("Age: " + fullperson.Age);
        System.out.println("Armor: " + fullperson.Armor);
        System.out.println("Strength: " + fullperson.Strength);
        System.out.println("Health: " + fullperson.Health);
        System.out.println("Experience: " + fullperson.Experience);
        System.out.println("Intelligence: " + fullperson.Intelligence);
        System.out.println("Luck: " + fullperson.Luck);
    }

    @Override
    public void showStrengthImpr(AllImprovements strengthImpr)
    {
        System.out.println("Small Sword: " + strengthImpr.smallSword);

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
    public void showInt(int value) {




    }
}
