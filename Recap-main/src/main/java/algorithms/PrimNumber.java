package algorithms;

public class PrimNumber {
    public static void main(String[] args) {
        isPrime(5);
    }
    public static boolean isPrime (int number) {

        if(number < 2) {
            return  false;
        }
        for ( int i =2; i <= number/2; i++) {
            if(number % i == 0)
                return false;
        }
        return true;
    }
}
