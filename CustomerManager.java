import java.util.ArrayList;
import java.util.List;

public class CustomerManager {
    private List<String> customers = new ArrayList<>();

    public void addCustomer(String name) {
        customers.add(name);
        System.out.println(" [+] Đã thêm khách hàng: " + name);
    }

    public void displayCustomers() {
        System.out.println(" [=] Danh sách khách hàng hiện tại: " + customers);
    }
}