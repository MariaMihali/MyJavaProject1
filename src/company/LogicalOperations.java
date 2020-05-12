package company;

public class LogicalOperations {
    //Pb. 3
    public int checkBiggerNumber(int firstNumber, int secondNumber) {
        if (firstNumber > secondNumber) {
            return firstNumber;
        } else {
            return secondNumber;
        }

    }

    //Pb. 4
    public String checkText(String text) {
        if (text.equals("FastTrackIT")) {
            return "Learning text comparison";
        } else {
            return "Got to try some more";
        }
    }

    //Pb. 5
    public String checkTextNumber(String text1, int number) {
        if (text1.equals("FastTrackIT") && number <= 3) {
            return "FastTrackIT" + number;
        } else if (!text1.equals("FastTrackIT") && number >= 4) {
            return number + "FastTrackIT";
        }

        return null;
    }

    //Pb. 6
    public String checkNumber1(int number1) {
        if (number1 > 8 || number1 == 6) {
            return "The amont of snow this winter was(cm):" + number1;
        } else {
            return "The forecast snow is(cm):" + number1;
        }
    }

    //Pb. 7
    public String checkNumber2(int number2) {
        if (number2 > 3 && number2 != 4) {
            return "The number is greater than 3 and not equal to 4";
        } else if (number2 == 4) {
            return "The number is equal to 4";
        } else if (number2 < 3) {
            return "The number is lower than 3";
        }
        return null;
    }

    //Pb. 8
    public int returnNumber(int x) {
        switch (x) {
            case 0:
                System.out.println("The number is: 0!");
                break;
            case 1:
                System.out.println("The number is: 1!");
                break;
            case 2:
                System.out.println("The number is: 2!");
                break;
            case 3:
                System.out.println("The number is: 3!");
                break;
            case 4:
                System.out.println("The number is: 4!");
                break;
            case 5:
                System.out.println("The number is: 5!");
                break;
            case 6:
                System.out.println("The number is: 6!");
                break;
            case 7:
                System.out.println("The number is: 7!");
                break;
            case 8:
                System.out.println("The number is: 8!");
                break;
            case 9:
                System.out.println("The number is: 9!");
                break;
        }
        return x;
    }

    //Pb. 9
    public boolean isNumberEven(double number3) {
        if (number3 % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    //Pb. 10
    public boolean isEligibleToVote(int age) {
        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }

    //Pb. 11
    public String largestNumber(int firstNumber, int secondNumber, int thirdNumber) {
        if (firstNumber >= secondNumber && firstNumber >= thirdNumber) {
            return "The largest number is: " + firstNumber;
        } else if (secondNumber >= firstNumber && secondNumber >= thirdNumber) {
            return "The largest number is: " + secondNumber;
        } else {
            return "The largest number is: " + thirdNumber;
        }
    }

    //lab 12

    //Pb.1
    public void printToHundred(int number) {
        for (int i = number; i <= 100; i++) {
            System.out.println(i);
        }
    }

    //Pb.2
    public void printToMinusHundred(int number1) {
        for (int i = number1; i >= -100; i--) {
            System.out.println(i);
        }
    }

    //Pb.3
    public void printFromFirstNumberToSecondNumber(int firstNumber, int secondNumber) {
        for (int i = firstNumber, j = secondNumber; i <= secondNumber; i++, j++) {
            System.out.println(i);
        }
    }

    //Pb.4
    

    //Pb.5
    public void printEvenNumberToHundred(int number2) {
        for (int i = number2; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    //Pb.6
    public void printOddNumberToHundred(int number3) {
        for (int i = number3; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

    //Pb. 7
    public int getSumToHundred(int number4) {
        int sum = 0;
        for (int i = number4; i <= 100; i++) {
            sum = sum + i;
        }
        return sum;
    }

    //Pb.8
    public float getSumAndAvarageFromHundred(int number5) {
        float sum = 0;
        for (int i = number5; i <= 100; i++) {
            sum = sum + i;
        }
        float avarage = sum / 100;
        System.out.println(sum);
        return avarage;
    }

    //Pb.9
    public void symbolNumber(int n) {
        for (int j=1;j<=n;j++) {
            for (int i=n;j<=i;i--){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //While
    //Pb.1
    public void printToHundred1(int number6){
        int i=number6;
        while (i<=100) {
            System.out.println(i);
            i++;
        }
    }
    //Pb.2
    public void printToMinusHundred1(int number7){
        int i=number7;
        while (i>=-100) {
            System.out.println(i);
            i--;
        }
    }
    //Pb.3
    public void printFromFirstNumberToSecondNumber1(int firstNumber2, int secondNumber2) {
        int i=firstNumber2, j=secondNumber2;
        while (i<=secondNumber2){
            System.out.println(i);
            i++;
            j++;
        }
    }
    //Pb.4


    //Pb.5
    public void printEvenNumberToHundred1(int number8) {
        int i=number8;
        while(i<=100){
            if (i%2==0){
                System.out.println(i);
            }
                i++;
        }
            }

    //Pb.6
    public void printOddNumberToHundred1(int number9) {
        int i=number9;
        while(i<=100){
            if (i%2!=0){
                System.out.println(i);
            }
            i++;
        }
    }
    //Pb.7
    public float printNumberRange(){
        int i=111;
        float sum=0;
        while(i<=8899){
            sum=sum+i;
            i++;
        }
        int count=8899-111;
        return sum/count;
    }
    //Pb.8

    //Pb.9
    public void firstTwentyNumbersFibonacci( int number10){
        int count=20, number1=0,number2=1;
        int i=number10;
        while(i<=count) {
            int sum = number1+number2 ;
            number1 = number2;
            number2 = sum;
            System.out.println(sum);
            i++;
        }


    }

    //Pb.10





    }




