public class Calculator {
    

    private static final double BASE_PRICE = 1800.0; 

    public double calculateBill(double kwh) {
        System.out.println("Đang tính toán với đơn giá: " + BASE_PRICE + " VND/kWh");
        return kwh * BASE_PRICE;
    }
}