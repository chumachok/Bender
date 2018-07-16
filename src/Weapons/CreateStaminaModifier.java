package Weapons;

import Characteristic.AllStats;

import java.util.Random;

public class CreateStaminaModifier implements StaminaModifiers
{
    @Override
    public AllStats firstLevelTrainings(AllStats playerStats) {
        AllStats firstLevelTrainings = new AllStats();
        Random random = new Random();

        firstLevelTrainings.Strength += random.nextInt(400);
        firstLevelTrainings.Stamina += random.nextInt(800);
        firstLevelTrainings.Armor += random.nextInt(100);
        firstLevelTrainings.Health += random.nextInt(100);
        firstLevelTrainings.Intelligence += random.nextInt(100);
        return firstLevelTrainings;
    }

    @Override
    public AllStats secondLevelTrainings(AllStats playerStats) {
        AllStats secondLevelTrainings = new AllStats();
        Random random = new Random();

        secondLevelTrainings.Strength += random.nextInt(500);
        secondLevelTrainings.Stamina += random.nextInt(900);
        secondLevelTrainings.Armor += random.nextInt(100);
        secondLevelTrainings.Health += random.nextInt(200);
        secondLevelTrainings.Intelligence += random.nextInt(200);
        return secondLevelTrainings;
    }

    @Override
    public AllStats thirdLevelTrainings(AllStats playerStats) {
        AllStats thirdLevelTrainings = new AllStats();
        Random random = new Random();

        thirdLevelTrainings.Strength += random.nextInt(600);
        thirdLevelTrainings.Stamina += random.nextInt(1000);
        thirdLevelTrainings.Armor += random.nextInt(100);
        thirdLevelTrainings.Health += random.nextInt(300);
        thirdLevelTrainings.Intelligence += random.nextInt(300);
        return thirdLevelTrainings;
    }

    @Override
    public AllStats firstLevelRelax(AllStats playerStats) {
        AllStats firstLevelRelax = new AllStats();
        Random random = new Random();

        firstLevelRelax.Strength += random.nextInt(100);
        firstLevelRelax.Stamina += random.nextInt(2000);
        firstLevelRelax.Armor -= random.nextInt(200);
        firstLevelRelax.Health += random.nextInt(400);
        firstLevelRelax.Intelligence -= random.nextInt(500);
        return firstLevelRelax;
    }

    @Override
    public AllStats secondLevelRelax(AllStats playerStats) {
        AllStats secondLevelRelax = new AllStats();
        Random random = new Random();

        secondLevelRelax.Strength += random.nextInt(0);
        secondLevelRelax.Stamina += random.nextInt(3000);
        secondLevelRelax.Armor -= random.nextInt(200);
        secondLevelRelax.Health += random.nextInt(0);
        secondLevelRelax.Intelligence -= random.nextInt(600);
        return secondLevelRelax;
    }

    @Override
    public AllStats thirdLevelRelax(AllStats playerStats) {
        AllStats thirdLevelRelax = new AllStats();
        Random random = new Random();

        thirdLevelRelax.Strength -= random.nextInt(500);
        thirdLevelRelax.Stamina += random.nextInt(4000);
        thirdLevelRelax.Armor -= random.nextInt(200);
        thirdLevelRelax.Health -= random.nextInt(400);
        thirdLevelRelax.Intelligence -= random.nextInt(700);
        return thirdLevelRelax;
    }
}
