public class LastDigitChecker {
    public static boolean hasSameLastDigit(int arg1, int arg2, int arg3) {
        if(arg1 < 10 || arg1 > 1000 || arg2 < 10 || arg2 > 1000 || arg3 < 10 || arg3 > 1000) {
            return false;
        }

        int lastDigit1 = arg1 % 10;
        int lastDigit2 = arg2 % 10;
        int lastDigit3 = arg3 % 10;

        return lastDigit1 == lastDigit2 || lastDigit2 == lastDigit3 || lastDigit1 == lastDigit3;
    }
}
