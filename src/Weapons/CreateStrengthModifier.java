package Weapons;

import Characteristic.AllStats;

import java.util.Random;

public class CreateStrengthModifier implements StrengthModifiers
{
    @Override
    public AllStats smallSword(AllStats playerStats)
    {
        AllStats smallSwordModifier = new AllStats();
        Random random = new Random();

        smallSwordModifier.Strength += random.nextInt(400);
        smallSwordModifier.Stamina -= random.nextInt(200);
        smallSwordModifier.Armor += random.nextInt(100);
        smallSwordModifier.Health += random.nextInt(0);
        smallSwordModifier.Intelligence += random.nextInt(0);
        return smallSwordModifier;
    }

    @Override
    public AllStats sword(AllStats playerStats)
    {
        AllStats swordModifier = new AllStats();
        Random random = new Random();

        swordModifier.Strength += random.nextInt(500);
        swordModifier.Stamina -= random.nextInt(400);
        swordModifier.Armor += random.nextInt(200);
        swordModifier.Health += random.nextInt(0);
        swordModifier.Intelligence += random.nextInt(0);
        return swordModifier;
    }

    @Override
    public AllStats twoHandedSword(AllStats playerStats) {
        AllStats twoHandedSword = new AllStats();
        Random random = new Random();

        twoHandedSword.Strength += random.nextInt(600);
        twoHandedSword.Stamina -= random.nextInt(1000);
        twoHandedSword.Armor += random.nextInt(300);
        twoHandedSword.Health -= random.nextInt(100);
        twoHandedSword.Intelligence -= random.nextInt(300);
        return twoHandedSword;
    }

    @Override
    public AllStats hammer(AllStats playerStats) {
        AllStats hammer = new AllStats();
        Random random = new Random();

        hammer.Strength += random.nextInt(500);
        hammer.Stamina -= random.nextInt(700);
        hammer.Armor += random.nextInt(250);
        hammer.Health += random.nextInt(200);
        hammer.Intelligence -= random.nextInt(400);
        return hammer;
    }

    @Override
    public AllStats smallThrowableAxe(AllStats playerStats) {
        AllStats smallThrowableAxe = new AllStats();
        Random random = new Random();

        smallThrowableAxe.Strength += random.nextInt(400);
        smallThrowableAxe.Stamina -= random.nextInt(100);
        smallThrowableAxe.Armor += random.nextInt(0);
        smallThrowableAxe.Health += random.nextInt(100);
        smallThrowableAxe.Intelligence += random.nextInt(300);
        return smallThrowableAxe;
    }

    @Override
    public AllStats largeAxe(AllStats playerStats) {
        AllStats largeAxe = new AllStats();
        Random random = new Random();

        largeAxe.Strength += random.nextInt(500);
        largeAxe.Stamina -= random.nextInt(800);
        largeAxe.Armor += random.nextInt(400);
        largeAxe.Health += random.nextInt(0);
        largeAxe.Intelligence -= random.nextInt(500);
        return largeAxe;
    }
}