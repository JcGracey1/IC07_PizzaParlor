import java.text.NumberFormat;
import java.util.Arrays;

public class PizzaOrder {
    private int mNumPizzas;
    private static final int MAX_PIZZAS = 100;
    private Pizza[] mPies = new Pizza[MAX_PIZZAS];

    public boolean addPizzaToOrder(char size, boolean mushrooms, boolean pepperoni, boolean sausage, boolean vegan){
        if (mNumPizzas < MAX_PIZZAS) {
            mPies[mNumPizzas++] = new Pizza(mushrooms, pepperoni, sausage, size, vegan);
            return true;
        }
        return false;
    }

    public double calcCost(){
        double cost = 0.0;
        for (int i = 0; i < mNumPizzas; i++) {
            // make a decision on size:
            switch (mPies[i].getSize())
            {
                case 'S':
                    cost += 8.0;
                    break;
                case 'M':
                    cost += 10.0;
                    break;
                case 'L':
                    cost += 12.0;
                    break;
            }
            // add toppings:
            cost += mPies[i].getNumToppings();
        }
        return cost;
    }


    @Override
    public String toString() {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String output = "Pizza Order: Number of Pies = " + mNumPizzas + "\n";
        // Loop through each pizza in the array
        for (int i = 0; i < mNumPizzas; i++)
            output += "Pie #" + (i+1) + ": " + mPies[i] + "\n";
        output += "Total Cost = " + currency.format(calcCost()) + "\n";
        return output;
    }
}
