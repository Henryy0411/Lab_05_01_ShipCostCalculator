public class ShipCostCalculator {
    public static void main(String[] args) {
        double price = 50;
        double shippingCost;
        double totalCost;

        shippingCost = price * .02;

        if (price >= 100){
            System.out.println("Your shipping cost is free!" );
        }else if(price < 100){
            System.out.println("Your shipping cost is :" + shippingCost);
        }
    }
}
