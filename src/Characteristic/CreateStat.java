package Characteristic;

import Dialogs.InputMsg;
import Dialogs.OutputMsg;

import java.util.Random;

public class CreateStat implements Stats
{

    Random random = new Random();

    @Override
    public String getName()
    {
        OutputMsg inputNameMsg = new OutputMsg();
        InputMsg getName = new InputMsg();

        inputNameMsg.showText("Please set new Hero name: ");
        String playerName = getName.getStringValue();
        return playerName;
    }

    @Override
    public int getAge()
    {
        OutputMsg inputAgeMsg = new OutputMsg();
        InputMsg getAge = new InputMsg();

        inputAgeMsg.showText("Please set approximate Hero age: ");
        int playerAge = getAge.getIntValue();
        return playerAge;
    }

    @Override
    public int getExperience(int age)
    {
        int counter = 0;
        int experience = 0;

        while (counter <= age)
        {
            experience += random.nextInt(100);
            counter++;
        }
        return experience;
    }

    @Override
    public int getStrength(int age) {
        int counter = 0;
        int strength = 0;

        while (counter <= age)
        {
            strength += random.nextInt(100);
            counter++;
        }
        return strength;
    }

    @Override
    public int getArmor(int age) {
        int counter = 0;
        int armor = 0;

        while (counter <= age)
        {
            armor += random.nextInt(100);
            counter++;
        }
        return armor;
    }

    @Override
    public int getLuck(int age) {
        int counter = 0;
        int luck = 0;

        while (counter <= age)
        {
            luck += random.nextInt(100);
            counter++;
        }
        return luck;
    }

    @Override
    public int getHealth(int age) {
        int counter = 0;
        int health = 0;

        while (counter <= age)
        {
            health += random.nextInt(100);
            counter++;
        }
        return health;
    }

    @Override
    public int getIntelligence(int age)
    {
        int counter = 0;
        int intelligence = 0;

        while (counter <= age)
        {
            intelligence += random.nextInt(100);
            counter++;
        }
        return intelligence;
    }

    @Override
    public int getStamina(int age) {
        int counter = 0;
        int stamina = 0;

        while (counter <= age)
        {
            stamina += random.nextInt(200);
            counter++;
        }
        return stamina;
    }
}
