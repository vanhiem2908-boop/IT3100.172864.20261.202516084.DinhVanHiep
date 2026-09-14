public class PrintCostArray {
    public static void main(String[] args) {
        double[] cost = {19.95, 24.95, 14.95, 29.95, 9.95};

        for (int i = 0; i < cost.length; i++) {
            System.out.println(cost[i]);
        }

        System.out.println("Number of items: " + cost.length);
    }
}