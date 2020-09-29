import javax.swing.*;

/**
 * Created by Christoffer Grännby
 * Date: 2020-09-28
 * Time: 10:37
 * Project: Inlämningsuppgift 1
 * Copyright: MIT
 */

/**
 * En klas som ärver från en superklass
 */
public class Dog extends Animal implements ICalculatePortion{

    /**
     * Ärver namn och vikt från superklassen Animal samt vilken mat djuret ska ha från Enum-klassen
     * @param name Läser in namnet på djuret
     * @param weight Läser in vikten på djuret
     */
    // Polymorfism, använder konstruktorn från superklassen för att skapa en subklass
    public Dog(String name, int weight){
        super(name, weight);
        super.kindOfFood = KindOfFood.DOOGFOOD.toString();
    }

    /**
     * En metod som räknar ut och skriver ut information om djuret samt hur mycket mat det ska äta
     */
    public void calculatePortion(){
        ImageIcon dog = new ImageIcon(Dog.class.getResource("/Images/dog.png"));
        JOptionPane.showMessageDialog(null, "Hunden " + getName() + " ska ha " + getWeight() * 1000/100 + "g" + kindOfFood, "Hund",
                JOptionPane.INFORMATION_MESSAGE, dog );
    }
}
