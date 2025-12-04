package model;

public abstract class Animal {
    private String name;
    private int ageMonths;
    
    public Animal(String name, int ageMonths) {
        this.name = name;
        this.ageMonths = ageMonths;
    }
    
    public String getName() {
        return name;
    }
    
    public int getAgeMonths() {
        return ageMonths;
    }
    
    public void growOlder(int months) {
        this.ageMonths += months;
    }
    
    protected String getLabel() {
        return isAdult() ? getAdultLabel() : getBabyLabel();
    }
    
    protected String getSound() {
        return isAdult() ? getAdultSound() : getBabySound();
    }
    
    protected boolean isAdult() {
        return ageMonths >= getAdultThreshold();
    }
    
    protected abstract int getAdultThreshold();
    protected abstract String getBabyLabel();
    protected abstract String getAdultLabel();
    protected abstract String getBabySound();
    protected abstract String getAdultSound();
    public abstract void introduce();
}
