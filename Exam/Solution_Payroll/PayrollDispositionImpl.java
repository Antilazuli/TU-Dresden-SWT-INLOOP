import java.util.*;
class PayrollDispositionImpl implements PayrollDisposition {
    private Map<Employee, Double> payments;
    
    public PayrollDispositionImpl() {
        payments = new HashMap<>();
    }
    
    public void sendPayment(Employee empl, double payment) throws NullPointerException, IllegalArgumentException {
        if(empl == null) {
            throw new NullPointerException("Employee can't be null");
        }
        else if(payment <= 0.0) {
            throw new IllegalArgumentException("Payment can't be zero or less");
        }
        payments.put(empl, payment);
    }
    
    public double getTotal() {
        double t = 0;
        for (double i : payments.values()){
            t += i;
        }
        return t;
    }
    
    public double getAverage() {
        if(payments.size() > 0) {
            return getTotal() / payments.size();
        }
            return 0;
    }
    
    public Map<Employee, Double> getPayments() {
        return payments;
    }
}