package Weapons;

import Characteristic.AllStats;

public interface ArmorModifiers
{
    AllStats helmet (AllStats playerStats); // UP to: Strength-50 / Stamina-100 / Armor+200 / Health-50 / intelligence-400
    AllStats chest (AllStats playerStats); // UP to: Strength-300 / Stamina-600 / Armor+800 / Health-50 / intelligence-50
    AllStats hands (AllStats playerStats); // UP to: Strength-200 / Stamina-500 / Armor+400 / Health-100 / intelligence-50
    AllStats gauntlets (AllStats playerStats); // UP to: Strength-50 / Stamina-100 / Armor+150 / Health-50 / intelligence-50
    AllStats legs (AllStats playerStats); // UP to: Strength-200 / Stamina-400 / Armor+400 / Health +100 / intelligence-50
    AllStats foots (AllStats playerStats); // UP to: Strength-50 / Stamina-250 / Armor+150 / Health+100 / intelligence-50
}
