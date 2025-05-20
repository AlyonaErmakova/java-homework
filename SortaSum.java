public class SortaSum {
    public static void main(String[] args) {
        System.out.println(sortaSum(3, 4)); // → 7
        System.out.println(sortaSum(9, 4)); // → 20
        System.out.println(sortaSum(10, 11)); // → 21
    }

    /*Given 2 ints, a and b, return their sum. However, sums in the range 10..19 inclusive,
    are forbidden, so in that case just return */
    private static int sortaSum(int a, int b) {
        if ((a + b) > 20 || (a + b) < 10) return a + b;
        else return 20;
    }
}
