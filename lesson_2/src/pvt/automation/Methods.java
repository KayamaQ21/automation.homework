package pvt.automation;

public class Methods {

    // Найти минимальное число из двух чисел и вернуть минимальное
    public static int returnMin(int a, int b) {
        if (a < b) {
            return a;
        } else {
            return b;
        }
    }

    // Проверить четное или нечетное число и вернуть boolean
    public static boolean isEven(int a) {
        if (a % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    // Возвести число в квадрат и вернуть результат
    public static int makePow(int a) {
        return a * a;
    }

    // Возвести число в куб и вернуть результат
    public static int makeCoub(int a) {
        return a * a * a;
    }
}
