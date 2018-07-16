package Game;

import Characteristic.AllStats;
import Characteristic.CreateStat;
import Dialogs.Input;
import Dialogs.InputMsg;
import Dialogs.Output;
import Dialogs.OutputMsg;

public class Gameplay
{
    public static void main (String[] args)
    {
        CreateStat SetStat = new CreateStat();
        Output DisplayText = new OutputMsg();
        Input getText = new InputMsg();

        DisplayText.showText("Set number of Players: ");
        int quantityPlayers = getText.getIntValue();

        AllStats [] array = new AllStats[quantityPlayers];

        for (int i = 0; i <= array.length-1; i++)
        {
            array [i] = new AllStats();
            array [i].Name = SetStat.getName();
            array [i].Age = SetStat.getAge();
            array [i].Experience = SetStat.getExperience(array [i].Age);
            array [i].Health = SetStat.getHealth(array [i].Age);
            array [i].Strength = SetStat.getStrength(array [i].Age);
            array [i].Armor = SetStat.getArmor(array [i].Age);
            array [i].Intelligence = SetStat.getIntelligence(array [i].Age);
            array [i].Luck = SetStat.getLuck(array [i].Age);
            array [i].Stamina = SetStat.getStamina(array [i].Age);
        }

        for (int i = 0; i <= array.length-1; i++)
        {
            DisplayText.showPersonStats(array[i]);
            DisplayText.showText("");
        }

        DisplayText.showText("player " + array[1].Name + " Select what to modify: ");

        String statToModify = getText.getStringValue();












    }
}