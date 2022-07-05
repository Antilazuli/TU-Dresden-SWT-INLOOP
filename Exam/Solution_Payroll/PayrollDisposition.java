interface PayrollDisposition {
    abstract void sendPayment(Employee empl, double payment) throws IllegalArgumentException;
}