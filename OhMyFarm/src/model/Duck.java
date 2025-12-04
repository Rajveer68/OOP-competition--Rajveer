package model;

public class Duck extends Animal {
    
    public Duck(String name, int ageMonths) {
        super(name, ageMonths);
    }
    
    @Override
    protected int getAdultThreshold() {
        return 6;
    }
    
    @Override
    protected String getBabyLabel() {
        return "duckling";
    }
    
    @Override
    protected String getAdultLabel() {
        return "duck";
    }
    
    @Override
    protected String getBabySound() {
        return "cheep";
    }
    
    @Override
    protected String getAdultSound() {
        return "QUACK!";
    }
    
    @Override
    public void introduce() {
        System.out.println("I am " + getName() + ", a " + getLabel() + ", and I say \"" + getSound() + "\".");
        System.out.println("I am " + getAgeMonths() + " months old.");
    }
}
