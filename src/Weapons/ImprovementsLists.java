package Weapons;

public class ImprovementsLists implements ImprovementsList
{
    @Override
    public String[] strengthImprovements() {
        String [] strengthImprList = new String [6];
        strengthImprList[0] = "Small Sword";
        strengthImprList[1] = "Sword";
        strengthImprList[2] = "Two Handed Sword";
        strengthImprList[3] = "Hammer";
        strengthImprList[4] = "Small Throwable Axe";
        strengthImprList[5] = "Large Axe";

        return strengthImprList;
    }

    @Override
    public String[] staminaImprovements() {
        String [] staminaImprList = new String [6];
        staminaImprList[0] = "Small Sword";
        staminaImprList[2] = "Sword";
        staminaImprList[3] = "Two Handed Sword";
//        strengthImprList[4] = "Hammer";
//        strengthImprList[5] = "Small Throwable Axe";
//        strengthImprList[6] = "Large Axe";

        return new String[6];
    }

    @Override
    public String[] armorImprovements() {
        return new String[0];
    }

    @Override
    public String[] healthImprovements() {
        return new String[0];
    }

    @Override
    public String[] intelligencrImprovements() {
        return new String[0];
    }
}