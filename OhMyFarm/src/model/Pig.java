package model;

public class Pig extends Animal {
    
    public Pig(String name, int ageMonths) {
        super(name, ageMonths);
    }
    
    @Override
    protected int getAdultThreshold() {
        return 10;
    }
    
    @Override
    protected String getBabyLabel() {
        return "piglet";
    }
    
    @Override
    protected String getAdultLabel() {
        return "pig";
    }
    
    @Override
    protected String getBabySound() {
        return "oink";
    }
    
    @Override
    protected String getAdultSound() {
        return "OINK-OINK";
    }
    
    @Override
    public void introduce() {
        System.out.println("At " + getAgeMonths() + " months old, I am " + getName() + " the " + getLabel() + ".");
        System.out.println("My sound is \"" + getSound() + "\".");
    }
}
