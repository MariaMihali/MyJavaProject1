package company;

public class LogicalOperations {
    //Pb. 3
    public int checkBiggerNumber(int firstNumber, int secondNumber) {
        if (firstNumber > secondNumber) {
            return firstNumber;
        }else{
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
    public String returnNumber (int x){
        switch(x){
            case 0:
                return "The number is: 0!";
            case 1:
                return "The number is: 1!";
            case 2:
                return "The number is: 2!";
            case 3:
                return "The number is: 3!";
            case 4:
                return "The number is: 4!";
            case 5:
                return "The number is: 5!";
            case 6:
                return "The number is: 6!";
            case 7:
                return "The number is: 7!";
            case 8:
                return "The number is: 8!";
            case 9:
                return "The number is: 9!";
            default:
                return "Not valid";

        }
    }

    //Pb. 9
    public boolean isNumberEven (double number3){
        if (number3 % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
    //Pb. 10
    public boolean isEligibleToVote(int age){
        if (age >= 18){
            return true;
        }else {
            return false;
        }
    }
    //Pb. 11
    public String largestNumber(int firstNumber, int secondNumber, int thirdNumber){
        if (firstNumber>=secondNumber && firstNumber>=thirdNumber){
            return "The largest number is: "+firstNumber;
        }else if (secondNumber>=firstNumber && secondNumber>=thirdNumber) {
            return "The largest number is: "+secondNumber;
        }else {
            return "The largest number is: "+thirdNumber;
        }

    }

}


