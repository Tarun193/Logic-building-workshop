public class ArraySum {
    public static void main(String[] args) {
        // Array
        int[] price = { 20, 40, 50, 30, 10, 5 };

        // Total, hold the the total, currently total is 0;
        int total = 0;

        for (int i = 0; i < price.length; i++) {
            total += price[i];
        }

        System.out.println("The total is: " + total);
    }
}
