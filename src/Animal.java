/**
 * Created by Christoffer Grännby
 * Date: 2020-09-28
 * Time: 10:34
 * Project: Inlämningsuppgift 1
 * Copyright: MIT
 */

/**
 * En superklass som hämtar namn, vikt och vilken typ av mat som gäller för respektive djur
 */
public class Animal {

    protected String name;
    protected int weight;
    protected String kindOfFood;

    /**
     * En metod som läser in namn och vikt för ett djur
     * @param name Talar om djurets namn
     * @param weight Talar om djurets vikt
     */
    public Animal(String name, int weight){
        this.name = name;
        this.weight = weight;
    }

    /**
     * En metod som hämtar namnet för djuret
     * @return En String returnerar namnet på djuret
     */
    public String getName() {
        return name;
    }

    /**
     * En metod som hämtar vikten för djuret
     * @return En String som returnerar vikten på djuret
     */
    public int getWeight() {
        return weight;
    }
}
