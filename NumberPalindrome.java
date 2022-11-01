public class NumberPalindrome {

    public static boolean isPalindrome (int number) {

        int reverse = 0;
        int palindrome = number;

        if(number == 0) {
            return false;
        }

        do {
            int lastDigit = number % 10;
            reverse = (reverse * 10) + lastDigit;
            number/=10; // number = number/10
        } while (number != 0);

        if(palindrome == reverse) {
            System.out.println("Yes!");
            return true;
        }
        return false;



    }


}
