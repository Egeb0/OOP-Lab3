package Q3;

public class PaymentModule {
    private double totalPay;

    public PaymentModule(){
        this.totalPay = 0;
    }

    public double getTotalPay(){
        return totalPay;
    }

    public void payment(Employee employee){
        double amount = employee.computePay();

        if(employee instanceof Manager){
            Manager manager = (Manager) employee;

            if(manager.getWorkYear() > 10){
                amount = amount *2;
            }
        }

        totalPay += amount;
    }
}
