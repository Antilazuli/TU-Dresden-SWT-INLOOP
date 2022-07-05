abstract class Employee {
    protected String id;
    
    public Employee(String id) throws NullPointerException, IllegalArgumentException {
        if(id == null) {
            throw new NullPointerException("Employee must have an ID");
        }
        if(id.equals("")) {
            throw new IllegalArgumentException("Employee ID can't be empty");
        }
        this.id = id;
    }
    
    public String getId() {
        return id;
    }
    
    abstract boolean isPayday(int dayOfMonth) throws IllegalArgumentException;
    abstract double calculatePay() throws UnpayableEmployeeException;
    abstract double calculateDeductions();
}