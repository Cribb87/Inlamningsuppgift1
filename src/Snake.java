import javax.swing.*;

/**
 * Created by Christoffer Grännby
 * Date: 2020-09-28
 * Time: 10:37
 * Project: Inlämningsuppgift 1
 * Copyright: MIT
 */

/**
 * En klass som ärver från en superklass
 */
public class Snake extends Animal{

    /**
     * Ärver namn och vikt från superklassen Animal samt vilken mat djuret ska ha från Enum-klassen
     * @param name Läser in namnet på djuret
     * @param weight Läser in vikten på djuret
     */
    public Snake(String name, int weight) {
        super(name, weight);
        super.kindOfFood = KindOfFood.SNAKEFOOD.toString();
    }

    /**
     * En metod som räkanr ut och skriver ut information om djuret samt hur mycket mat det ska äta
     */
    public void calculatePortion(){
        ImageIcon snake = new ImageIcon(Snake.class.getResource("/Images/snake.png"));
        JOptionPane.showMessageDialog(null, "Ormen " + getName() + " ska ha 20g" + kindOfFood, "Orm", JOptionPane.INFORMATION_MESSAGE, snake);
    }
}