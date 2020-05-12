package company;


public class Lab11 {
 public static void main(String[] args) {
  //Pb1.

  Calculator myCalculator = new Calculator();
  int addtition = myCalculator.addition(2, 4);
  System.out.println("The result of the addition is:" + addtition);
  int substraction = myCalculator.substraction(4, 2);
  System.out.println("The result of the substraction is:" + substraction);
  double multiplication = myCalculator.multiplication(2, 4);
  System.out.println("The result of the multiplication is:" + multiplication);
  double division = myCalculator.division(4, 2);
  System.out.println("The result of the division is:" + division);

  // Pb. 3
  LogicalOperations op = new LogicalOperations();
  int biggest = op.checkBiggerNumber(4, 6);
  System.out.println("The bigger number is:" + biggest);

  //Pb. 4
  String text = "FastTrackIT";
  System.out.println(op.checkText(text));

  //Pb. 5
  String text1 = "FastTrackIT";
  int number = 2;
  System.out.println(op.checkTextNumber(text1, number));

  //Pb. 6
  int number1 = 5;
  System.out.println(op.checkNumber1(number1));

  //Pb. 7
  int number2 = 2;
  System.out.println(op.checkNumber2(number2));

  //Pb.8
  int x=7;
  System.out.println(op.returnNumber(x));

  //Pb. 9
  double number3=3;
  System.out.println(op.isNumberEven(number3));

  //Pb. 10
  int age=19;
  System.out.println(op.isEligibleToVote(age));
  //Pb. 11
  int firstNumber=10, secondNumber=20, thirdNumber=15;
  System.out.println(op.largestNumber(firstNumber,secondNumber,thirdNumber));

 }

}

