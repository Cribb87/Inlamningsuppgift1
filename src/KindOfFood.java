/**
 * Created by Christoffer Grännby
 * Date: 2020-09-28
 * Time: 12:34
 * Project: Inlämningsuppgift 1
 * Copyright: MIT
 */

/**
 * Ett enum som deklarerar värden till tre olika konstanter
 */
public enum KindOfFood {
        DOOGFOOD(" hundfoder"),
        CATFOOD(" kattfoder"),
        SNAKEFOOD(" ormpellets");

    private final String food;

    KindOfFood(String s){
        this.food = s;
    }

    @Override
    public String toString() {
        return food;
    }
}
