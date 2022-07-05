class Appointee extends Employee {
    private int payday;
    private int hoursPerMonth;
    private double payPerHour;
    
    public Appointee( String id, int payday, int hoursPerMonth, double payPerHour) throws IllegalArgumentException {
        super(id);
        if(payPerHour <= 0.0 || payday < 1 || payday > 30 || hoursPerMonth <= 0) {
            throw new IllegalArgumentException("faulty parameters were given to the Appointee constructor");
        }
        this.payday = payday;
        this.hoursPerMonth = hoursPerMonth;
        this.payPerHour = payPerHour;
    }
    
    public boolean isPayday(int dayOfMonth) throws IllegalArgumentException {
        if(dayOfMonth < 1 || dayOfMonth > 30) {
            throw new IllegalArgumentException("Day of Month should be a valid number");
        }
        if(payday == dayOfMonth) {
            return true;
        }
        return false;
    }
    
    public double calculatePay() {
        return hoursPerMonth * payPerHour;
    }
    
    public double calculateDeductions() {
        return calculatePay() * 0.4;
    }
}