import javax.swing.JOptionPane;
public class QuadraticEquation {
    public static void main(String[] args) {
        String strA = JOptionPane.showInputDialog("Enter a:");
        String strB = JOptionPane.showInputDialog("Enter b:");
        String strC = JOptionPane.showInputDialog("Enter c:");
        double a = Double.parseDouble(strA);
        double b = Double.parseDouble(strB);
        double c = Double.parseDouble(strC);
        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Infinite solutions");
                } else {
                    System.out.println("No solution");
                }
            } else {
                double x = -c / b;
                System.out.println("x = " + x);
            }
        } else {
            double delta = b * b - 4 * a * c;
            if (delta > 0) {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            } else if (delta == 0) {
                double x = -b / (2 * a);
                System.out.println("x1 = x2 = " + x);
            } else {
                System.out.println("No real solution");
            }
        }
    }
}