package Weapons;

import Characteristic.AllStats;

public interface StrengthModifiers
{
    AllStats smallSword (AllStats playerStats); // UP to: Strength+400 / Stamina-200 / Armor+100 / Health 0 / intelligence 0
    AllStats sword (AllStats playerStats); // UP to: Strength+500 / Stamina-400 / Armor+200 / Health 0 / intelligence 0
    AllStats twoHandedSword (AllStats playerStats); // UP to: Strength+600 / Stamina-1000 / Armor+300 / Health-100 / intelligence -300
    AllStats hammer (AllStats playerStats); // UP to: Strength+500 / Stamina-700 / Armor+250 / Health+200 / intelligence -400
    AllStats smallThrowableAxe (AllStats playerStats); // UP to: Strength+400 / Stamina-100 / Armor+0 / Health +100 / intelligence +300
    AllStats largeAxe (AllStats playerStats); // UP to: Strength+500 / Stamina-800 / Armor+400 / Health 0 / intelligence -500
}
