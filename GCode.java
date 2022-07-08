package ryan.gcodegenerator;

import java.util.Map;
import java.util.HashMap;

public class GCode {

    private static final Map<String, Integer> code = new HashMap<String, Integer>(){
        {
            put("A", 1); put("a", 1);
            put("B", 2); put("b", 2);
            put("C", 3); put("c", 3);
            put("D", 4); put("d", 4);
            put("E", 5); put("e", 5);
            put("F", 6); put("f", 6);
            put("G", 7); put("g", 7);
            put("H", 8); put("h", 8);
            put("I", 9); put("i", 9);
            put("J", 10); put("j", 10);
            put("K", 11); put("k", 11);
            put("L", 12); put("l", 12);
            put("M", 13); put("m", 13);
            put("N", 14); put("n", 14);
            put("O", 15); put("o", 15);
            put("P", 16); put("p", 16);
            put("Q", 17); put("q", 17);
            put("R", 18); put("r", 18);
            put("S", 19); put("s", 19);
            put("T", 20); put("t", 20);
            put("U", 21); put("u", 21);
            put("V", 22); put("v", 22);
            put("W", 23); put("w", 23);
            put("X", 24); put("x", 24);
            put("Y", 25); put("y", 25);
            put("Z", 26); put("z", 26);
        }
    };

    public boolean validChar(char ch) {
        return (code.get(Character.toString(ch)) != null);
    }

    public int getValue(char ch) {
        if (ch == 0) return 0;
        if (!validChar(ch)) return 0;
        return code.get(Character.toString(ch));
    }

    public int printValue(String string) {
        System.out.println(string + ":");
        int value = 0;
        int numValid = 0;
        for (int i = 0; i < string.length(); i++) {
            if (validChar(string.charAt(i))) {
                numValid++;
                System.out.println(numValid + ") " + string.charAt(i) + " = " + getValue(string.charAt(i)));
                value += getValue(string.charAt(i));
            }
        }
        System.out.println(string + " = " + value + "\n");
        return value;
    }

    public static void main(String[] arguments) {
        GCode mycode = new GCode();
        String string1 = "You forgot something";
        mycode.printValue(string1);

    }
}