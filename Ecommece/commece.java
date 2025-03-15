public class commece {
    public static double calculateTotalPrice(int[] prices, boolean isPremiumMember) {
        double totalPrice = 0;
        for (int price : prices) {
            totalPrice += price;
        }
        if (isPremiumMember) {
            totalPrice *= 0.95;
        }
        if (totalPrice > 5000) {
            totalPrice *= 0.90;
        }
        return totalPrice;
    }

    public static void main(String[] args) {
        int[] cartPrices = {1500, 3000, 2000};
        boolean isPremium = true;

        double finalPrice = calculateTotalPrice(cartPrices, isPremium);
        System.out.println("Total price after discounts: ₹" + finalPrice);
    }
}
