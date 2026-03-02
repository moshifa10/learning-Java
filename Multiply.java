

class Calculator {

    public int add(int n1, int n2){
        return n1+n2;
    }

    // // Multiply 
    // public int multiply(int n1, int n2){
    //     return n1*n2;
    // }

    // // Subract
    // public int subract(int n1, int n2){
    //     return n1-n2;
    // }

    // // Division
    // public double devide(double n1, double n2){
    //     return n1/n2;
    // }
}


public class Multiply {

    public static void main(String[] args) {
        

        Calculator calc = new Calculator();
        int num1 = 200;
        int num2 = 100;


        int additon = calc.add(num1, num2);
        System.out.println(additon);
    }
}