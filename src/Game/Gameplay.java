package Game;

import Characteristic.CreateStat;
import Dialogs.OutputMsg;

interface Player {};



public class Gameplay
{
    public static void main (String[] args)
    {
        CreateStat SetStat = new CreateStat();
        OutputMsg DisplayText = new OutputMsg();

        int a = 0;

        SetStat.getName();
        SetStat.getAge();
        SetStat.getExperience(a);
        SetStat.getHealth(a);
        SetStat.getStrength(a);
        SetStat.getArmor(a);
        SetStat.getIntelligence(a);
        SetStat.getLuck(a);






    }





}
