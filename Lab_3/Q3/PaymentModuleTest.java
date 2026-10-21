package Q3;

public class PaymentModuleTest {
    public static void main(String []args){
        PaymentModule module = new PaymentModule();
        Fulltimer f = new Fulltimer("George", 3000);
        Manager m1 = new Manager("Ibrahim", 4000, 6);
        Manager m2 = new Manager("Ege", 4500, 12);
        Hourly h = new Hourly("Alice", 100, 6);

        module.payment(f);
        module.payment(m1);
        module.payment(m2);
        module.payment(h);

        System.out.println("Total Payment: " + module.getTotalPay());
    }
}
