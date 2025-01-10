package org.example;

public class Player {
    private String name;
    private int healthPercentage;
    private Weapon weapon;


    public Player(String name, int healthPercentage, Weapon weapon){
        this.name = name;
        if(healthPercentage > 100){
            this.healthPercentage = 100;
        }else this.healthPercentage = Math.max(healthPercentage, 0);

        this.weapon = weapon;
    }

    public int healthRemaining(){
        return healthPercentage;
    }

    public void loseHealth(int damage){
        healthPercentage = healthPercentage - damage;
        if(healthPercentage < 0){
            System.out.println(name + " player has been knocked out of game");
            healthPercentage = 0;
        }
    }

    public void restoreHealth(int healthPotion){
        healthPercentage = healthPercentage + healthPotion;
        if(healthPercentage > 100){
            healthPercentage = 100;
        }
    }
}
