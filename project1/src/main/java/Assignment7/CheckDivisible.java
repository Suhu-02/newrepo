package Assignment7; //assignment 7 first question

//Child class
public class CheckDivisible extends AddNumbers {
public void check(int a, int b) {
   int sum = super.add(a, b);
   System.out.println("Sum: " + sum);

   if (sum % 10 == 0) {
       System.out.println("The sum is divisible by 10.");
   } else {
       System.out.println("The sum is not divisible by 10.");
   }
}
}