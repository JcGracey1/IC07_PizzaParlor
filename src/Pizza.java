public class Pizza {
    private boolean mMushrooms;
    private boolean mPepperoni, mSausage, mVegan;
    private char mSize;

    public Pizza(boolean mushrooms, boolean pepperoni, boolean sausage, char size, boolean vegan) {
        mMushrooms = mushrooms;
        mPepperoni = pepperoni;
        mSausage = sausage;
        mSize = size;
        mVegan = vegan;
    }

    public int getNumToppings()
    {
        int numToppings = 0;
        if (mPepperoni) numToppings++;
        if (mSausage) numToppings++;
        if (mMushrooms) numToppings++;
        if (mVegan) numToppings++;
        return numToppings;
    }

    public char getSize() {
        return mSize;
    }

    @Override
    public String toString() {
        String output= "Pizza [Size=" + mSize;
                if(mPepperoni) output += ", Pepperoni";
                if(mMushrooms) output += ", Mushrooms";
                if(mSausage) output += ", Sausage";
                if(mVegan) output += ", Vegan]";

                return output;
    }
}
