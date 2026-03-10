public class Calculator {
    
    // CHÚ Ý: Đây là dòng để tạo Merge Conflict khi thuyết trình!
    // Bạn Hoài sẽ đổi thành 2000.0 trên nhánh main
    // Bạn Tiến sẽ đổi thành 1800.0 trên nhánh tính năng (feature branch)
    private static final double BASE_PRICE = 1500.0; 

    public double calculateBill(double kwh) {
        System.out.println("Đang tính toán với đơn giá: " + BASE_PRICE + " VND/kWh");
        return kwh * BASE_PRICE;
    }
}