import javax.swing.JOptionPane;
public class CalculateNumbers{
public static void 
main(String[] args){

String strNum1=JOptionPane.showInputDialog("Enter the first number:");
String strNum2=JOptionPane.showInputDialog("Enter the second number:");
double Num1 = Double.parseDouble(strNum1);
double Num2 = Double.parseDouble(strNum2);
System.out.println("Sum:"+(Num1+Num2));
System.out.println("Different:"+(Num1-Num2));
System.out.println("Product:"+(Num1*Num2));
if(Num2!=0){
System.out.println("Quotient: "+(Num1/Num2));
}
else{
System.out.println("Cannot divide by zero");
}
}
}