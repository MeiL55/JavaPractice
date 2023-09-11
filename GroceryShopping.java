public class GroceryShopping
{
 public static void main(String[] args){
  double bananaCost = 3.99;
  double appleCost = 1.25;
  int numApples = 4;
  double couponValue = 0.53;
  double taxRate = 0.08;
  double orderTotal = 0.0;
  orderTotal += bananaCost / 2;
  orderTotal += appleCost * numApples;
  orderTotal -= couponValue * 3;
  orderTotal *= 1 + taxRate;
  double orderTotalTrunc = orderTotal * 100 ;
  orderTotalTrunc = (int)orderTotalTrunc/100.0;
  System.out.println("Your order total is $" + orderTotalTrunc + ".");
  int dollars = 10;
  dollars -= orderTotalTrunc;
  System.out.println("You have " + dollars +" dollar bills remaining.");
  
  }
}

