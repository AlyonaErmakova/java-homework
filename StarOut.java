public class StarOut {
    public static void main(String[] args) {
        System.out.println(starOut("ab*cd")); //→"ad"
        System.out.println(starOut("ab*cd")); //→"ad"
        System.out.println(starOut("sm*eilly")); //→"silly"
        System.out.println(starOut("sm******eilly")); //→"silly"
    }

    //Return a version of the given string, where for every star ()
    // in the string the star and the chars immediately to its left and right
    //are gone. So "abcd" yields "ad" and "ab**cd" also yields "ad".

    private static String starOut(String input) {
        String output = "";
        int number = 0;
        for (int i = 1; i < input.length() - 1; i++) {
            if (input.charAt(i) == '*') {
                number++;
                output = input.replace("*", "");
                output = input.substring(0, (i - number)) + input.substring(i + 2);
            }
        }
        return output;
    }
}
