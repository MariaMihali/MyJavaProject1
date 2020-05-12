package company;

public class Lab12 {
    public static void main(String[] args) {
        LogicalOperations op = new LogicalOperations();

        //Pb.1
        int number=50;
        op.printToHundred(number);

        //Pb. 2
        int number1=10;
        op.printToMinusHundred(number1);

        //Pb.3
        int firstNumber=5;
        int secondNumber=20;
        op.printFromFirstNumberToSecondNumber(firstNumber,secondNumber);

        //Pb.4


        //Pb.5
        int number2=1;
        op.printEvenNumberToHundred(number2);

        //Pb.6
        int number3=1;
        op.printOddNumberToHundred(number3);

        //Pb.7
        int number4=90;
        System.out.println(op.getSumToHundred(number4));

        //Pb.8
        int number5=50;
        System.out.println(op.getSumAndAvarageFromHundred(number5));

        //Pb.9
        int n=7;
        op.symbolNumber(n);

        //While
        //Pb.1
        int number6=90;
        op.printToHundred1(number6);

        //Pb.2
        int number7=5;
        op.printToMinusHundred1(number7);

        //Pb.3
        int firstNumber2=5;
        int secondNumber2=20;
        op.printFromFirstNumberToSecondNumber1(firstNumber2,secondNumber2);

        //Pb.4

        //Pb.5
        int number8=1;
        op.printEvenNumberToHundred1(number8);

        //Pb.6
        int number9=1;
        op.printOddNumberToHundred1(number9);

        //Pb.7
        System.out.println(op.printNumberRange());


        //Pb.8

        //Pb.9
        int number10=1;
        op.firstTwentyNumbersFibonacci(number10);

        //Pb.10

    }
}

