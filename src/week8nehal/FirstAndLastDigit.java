package week8nehal;

public class FirstAndLastDigit {
    public static int sumFirstAndLastDigit(int number){
        if (number<0){
            return-1;
        }
        int lastDigit =number%10;
        int firstDigit =number;
        while (firstDigit>=10)
        {
            firstDigit/=10;
        }
        return firstDigit+lastDigit;

    }

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(252));
        System.out.println(sumFirstAndLastDigit(257));
        System.out.println(sumFirstAndLastDigit(0));
        System.out.println(sumFirstAndLastDigit(5));
        System.out.println(sumFirstAndLastDigit(-10));
    }
}
