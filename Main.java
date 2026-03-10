public class Main {
    public static void main(String[] args) {
        System.out.println("===============================================");
        System.out.println("  HỆ THỐNG QUẢN LÝ HÓA ĐƠN ĐIỆN     ");
        System.out.println("===============================================");

        // 1. Quản lý khách hàng
        CustomerManager manager = new CustomerManager();
        manager.addCustomer("Nguyễn Văn A");
        manager.addCustomer("Trần Thị B");
        
        System.out.println("-----------------------------------------------");

        // 2. Tính tiền điện
        Calculator calc = new Calculator();
        double usage = 150.5; // Giả sử dùng 150.5 ký điện
        double total = calc.calculateBill(usage);

        System.out.println("Tổng số điện tiêu thụ: " + usage + " kWh");
        System.out.println("Tổng tiền phải thanh toán: " + total + " VND");
        System.out.println("===============================================");
    }
}