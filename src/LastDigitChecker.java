public class LastDigitChecker {
    public static boolean hasSameLastDigit(int arg1, int arg2, int arg3) {
        if(!(isValid(arg1) && isValid(arg2) && isValid(arg3))) {
            return false;
        }

        int lastDigit1 = arg1 % 10;
        int lastDigit2 = arg2 % 10;
        int lastDigit3 = arg3 % 10;

        return lastDigit1 == lastDigit2 || lastDigit2 == lastDigit3 || lastDigit1 == lastDigit3;
    }

    public static boolean isValid(int number) {
        return number >= 10 && number <= 1000;
    }

    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(978, 48, 64));
        System.out.println(hasSameLastDigit(9, 109, 909));
        System.out.println(hasSameLastDigit(77, -1, 27));
        System.out.println(hasSameLastDigit(11, 232, 971));
        System.out.println(hasSameLastDigit(972, 48, 62));
    }
}
