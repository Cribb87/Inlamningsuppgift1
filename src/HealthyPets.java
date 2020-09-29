import javax.swing.*;

/**
 * Created by Christoffer Grännby
 * Date: 2020-09-28
 * Time: 10:49
 * Project: Inlämningsuppgift 1
 * Copyright: MIT
 */

public class HealthyPets {

    public void pets(){

        // Läs in vilket djur som ska få mat via en dialogruta
        while (true){
            String input = JOptionPane.showInputDialog("Vilket djur ska få mat?");

            // Hantera avbrott av programmet
            if (input == null){
                JOptionPane.showMessageDialog(null,"Programmet avslutas", "Adjö", JOptionPane.WARNING_MESSAGE);
                break;
            }
            // Hantera stora bokstäver och mellanslag
            input = input.trim();
            input = input.toLowerCase();

            switch (input){

                case "sixten":
                    Dog sixten = new Dog("Sixten",5);
                    sixten.calculatePortion();
                    break;

                case "dogge":
                    Dog dogge = new Dog("Dogge",10);
                    dogge.calculatePortion();
                    break;

                case "venus":
                    Cat venus = new Cat("Venus", 5);
                    venus.calculatePortion();
                    break;

                case "ove":
                    Cat ove = new Cat("Ove",3);
                    ove.calculatePortion();
                    break;

                case "hypno":
                    Snake hypno = new Snake("Hypno",1);
                    hypno.calculatePortion();
                    break;

                    // Hantera felinmatning
                default:
                    JOptionPane.showMessageDialog(null,"Felaktig inmatning. Vänligen försök igen", "Fel", JOptionPane.ERROR_MESSAGE);
                    continue;
            }
        }
    }

    public static void main(String[] args) {

        HealthyPets pets = new HealthyPets();
        pets.pets();
    }
}
