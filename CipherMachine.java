package HW22;

public class CipherMachine {
    public static void main(String[] args) {
        enigmaCaesar("Съешь же ещё этих мягких французских булок, да выпей чаю.");
        //enigmaCaesar("абвгдеёжзийклмонпрстуфхцчшщъыьэюя");
        // enigmaCaesar("АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ");
    }

    private static void enigmaCaesar(String phrase) {

        for (int i = 0; i < phrase.length(); i++) {
            int index = phrase.charAt(i);
            int newIndex;
            //для строчных букв
            if ((index >= 1072 && index <= 1074) || (index >= 1078 && index <= 1100)) {
                newIndex = index + 3;
            } else if (index == 1075) {
                newIndex = 1105;
            } else if (index == 1105) {
                newIndex = 1080;
            } else if (index == 1076 || index == 1077) {
                newIndex = index + 2;
            } else if (index >= 1101 && index <= 1103) {
                newIndex = index - 29;
            } //для заглавных букв букв
            else if ((index >= 1040 && index <= 1042) || (index >= 1046 && index <= 1068)) {
                newIndex = index + 3;
            } else if (index == 1043) {
                newIndex = 1025;
            } else if (index == 1025) {
                newIndex = 1048;
            } else if (index == 1044 || index == 1045) {
                newIndex = index + 2;
            } else if (index >= 1069 && index <= 1071) {
                newIndex = index - 29;
            } //для всего остального
            else newIndex = index;
            char symbol = (char) index;
            char result = (char) newIndex;
            System.out.print(result);
           /* System.out.print(symbol + " ");
            System.out.print(index + " ");
            System.out.print(result + " ");
            System.out.println(newIndex + " ");*/
        }
    }
}
