
public class FizzBuzz {

    public static void main(String[] args) {
        
        // I will be creating fizzbuzz
        int buzz = 0;
        int fizz = 0;
        for (int i=1; i<=15; i++){
            if (i%3==0 && i%5==0){
                System.out.println("FizzBuzz");
            }
            else if (i%5==0){
                System.out.println("Buzz");
                buzz++;

            }
            else if (i%3==0){
                System.out.println("Fizz");
                fizz++;
            }
            else
                System.out.println(i);
        }

        System.out.println("Fizz count: "+ fizz);
        System.out.println("Buzz count: "+ buzz);
    }
}