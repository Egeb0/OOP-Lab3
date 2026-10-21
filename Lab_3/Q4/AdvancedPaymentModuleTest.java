
package Q4;

import Q3.Employee;
import Q3.Fulltimer;
import Q3.Manager;
import Q3.Hourly;

public class AdvancedPaymentModuleTest {
    public static void main(String[] args) {

        AdvancedPaymentModule module = new AdvancedPaymentModule();

        Employee[] employees = {
                new Fulltimer("George", 3000),
                new Manager("Ibrahim", 4000, 6),
                new Manager("Ege", 4500, 12),
                new Hourly("Alice", 100, 6)
        };

        module.payment(employees);

        System.out.println("Array Total: " + module.getTotalPay());
        
        module.payment(new Fulltimer("John", 1000));

        System.out.println("After Single Payment: " + module.getTotalPay());
    }
}
