import java.util.Map;
class Payroll {
    private int payday;
    private PayrollDisposition disposition;
    
    public Payroll(PayrollDisposition disposition, int payday) throws NullPointerException, IllegalArgumentException {
        if(disposition == null) {
            throw new NullPointerException("Disposition can't be null");
        }
        if(payday < 1 || payday > 30) {
            throw new IllegalArgumentException("Payday should be valid Integer");
        }
        this.disposition = disposition;
        this.payday = payday;
    }
    
    public void doPayroll(PayrollDB db) {
        for(Employee i: db.getEmployeeList()) {
            if(i.isPayday(payday)) {
                try {
                    disposition.sendPayment(i, i.calculatePay() - i.calculateDeductions());
                }
                catch(Exception e) {}
            }
        }
    }
}