public class CountHi {
    public static void main(String[] args) {
        System.out.println(countHi("abc hi ho")); // → 1
        System.out.println(countHi("ABChi hi")); // → 2
        System.out.println(countHi("hihi")); // → 2
        System.out.println(countHi("hiklsfj lhisdhikf;lhi")); // → 4
    }

    private static int countHi(String input) {
        int result = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'h' && input.charAt(i + 1) == 'i') {
                result++;
            }
        }
    return result;
    }
}
