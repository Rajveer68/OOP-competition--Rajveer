package model;

public class Mouse extends Animal {
    
    public Mouse(String name, int ageMonths) {
        super(name, ageMonths);
    }
    
    @Override
    protected int getAdultThreshold() {
        return 5;
    }
    
    @Override
    protected String getBabyLabel() {
        return "pup";
    }
    
    @Override
    protected String getAdultLabel() {
        return "mouse";
    }
    
    @Override
    protected String getBabySound() {
        return "squeak";
    }
    
    @Override
    protected String getAdultSound() {
        return "SQUEAK!";
    }
    
    @Override
    public void introduce() {
        System.out.println("My sound is \"" + getSound() + "\". I am " + getName() + ", a " + getLabel() + ".");
        System.out.println("I am " + getAgeMonths() + " months old.");
    }
}
