public class Inhabitant {
    protected int income;
    public int taxableIncome() {
        return income;
    }
    public int tax() {
        if((taxableIncome() * 0.1) < 1) {
            return 1;
        }
        else {
            return (int) (taxableIncome() * 0.1);    
        }
    }
    public void setIncome(int income) throws IllegalArgumentException {
        if(income < 0) {
            throw new IllegalArgumentException("No negative values as income accepted!");
        }
        else {
            this.income = income;
        }
    }
}