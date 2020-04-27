package company;
public class Lab10 {
    public static void main(String[] args) {

        printMyName();
        System.out.println("Maria");
        System.out.println(rez(10,5));
        System.out.println(rez1(10,3));
        System.out.println(rez2(-5,8,6));
        System.out.println(rez3(55,9));
        System.out.println(rez4(20,3,5,8));
        System.out.println(rez5(5,15,3,2,8));
        System.out.println("The result of the addition is:"+addition(2,4));
        System.out.println("The result of the substraction is:"+substraction(4,2));
        System.out.println("The result of the multiplication is:"+multiplication(2,4));
        System.out.println("The result of the division is:"+division(4,2));
        figure();
        System.out.println("The average of three numbers is:"+average(3,6,9));
        figure1();
        System.out.println("The rest of the division of two numbers is:"+rest(7,4));
        System.out.println("The rusult of the transformation from Fahrenheit to Celsius is:"+toCelsius(100));
        System.out.println("The reuslt of the transformation from inches to meters is:"+toMeters(12));
       speed(1,60,30,10);

    }

    public static void printMyName() {
        System.out.println("Hello");
        System.out.println("Maria");

    }

    public static int rez(int x, int y){
        return x+y;
    }

    public static double rez1( double a, double b) {
        return a/b;
    }

    public static int rez2(int x, int y, int z){
        return x+y*z;
    }

    public static int rez3(int x, int y) {
    return((x+y)%y);
    }

    public static float rez4(float x, float y, float z, float t) {
        return(x+-y*z/t);
    }

    public static int rez5(int x,int y,int z,int u,int v) {
        return(x+y/z*u-v%z);
    }
    public static int addition(int firstNumber,int secondNumber) {
        return firstNumber+secondNumber;
    }

    public static int substraction(int firstNumber, int secondNumber) {
        return firstNumber-secondNumber;
    }

    public static double multiplication(double firstNumber, double secondNumber) {
        return firstNumber*secondNumber;
    }

    public static double division(double firsNumber,double secondNumber) {
        return firsNumber/secondNumber;
    }

    public static void figure() {
        System.out.println("   J   a  V    V  a");
        System.out.println("   J  a a  V   V a a");
        System.out.println("J  J aaaaa  V V aaaaa");
        System.out.println(" JJ a    a   V a     a");
    }

    public static double average(double x, double y, double z) {
        return (x+y+z)/3;
    }

    public static void figure1() {
        System.out.println(" +\"\"\"\"\"\"+");
        System.out.println("[| o  o |]");
        System.out.println(" |   ^  | ");
        System.out.println(" |  '_' | ");
        System.out.println(" +_ _ _ + ");

    }

    public static int rest(int x, int y){
        return x%y;
    }

    public static int toCelsius(int F) {
        return (F-32)*5/9;
    }

    public static double toMeters(double inch) {
        return inch/39.370;
    }

    public static void  speed(double hours,double minutes,double seconds,double meters) {
        double result=(meters/(seconds+minutes*60.0+hours*3600.0));
        System.out.println("The speed in m/s is:"+result);
        result=((meters/(seconds+minutes+60.0+hours*3600.0))*3.6);
        System.out.println("The speed in km/h is:"+result);
        result=((meters/(seconds+minutes*60.0+hours*3600.0))*2.237);
        System.out.println("The speed in mile/h is:"+result);

    }



}
