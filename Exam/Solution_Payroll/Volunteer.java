class Volunteer extends Employee {
    public Volunteer(String id) {
        super(id);
    }
    
    public boolean isPayday(int dayOfMonth) throws IllegalArgumentException {
        if(dayOfMonth < 1 || dayOfMonth > 30) {
            throw new IllegalArgumentException("Day of Month should be a valid integer");
        }
        return false;
    }
    
    public double calculatePay() throws UnpayableEmployeeException {
        throw new UnpayableEmployeeException("Volunteers don't receive any payment");
    }
    
    public double calculateDeductions() {
        return 0;
    }
}