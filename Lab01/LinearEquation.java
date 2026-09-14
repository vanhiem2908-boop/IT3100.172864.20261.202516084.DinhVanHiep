import javax.swing.JOptionPane;

public class LinearEquation {
    public static void main(String[] args) {
        String strA = JOptionPane.showInputDialog("Enter a:");
        String strB = JOptionPane.showInputDialog("Enter b:");

        double a = Double.parseDouble(strA);
        double b = Double.parseDouble(strB);

        if (a == 0) {
            if (b == 0) {
                System.out.println("Infinite solutions");
            } else {
                System.out.println("No solution");
            }
        } else {
            double x = -b / a;
            System.out.println("x = " + x);
        }
    }
}