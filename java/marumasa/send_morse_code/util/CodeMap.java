package marumasa.send_morse_code.util;

import java.util.HashMap;
import java.util.Map;

public class CodeMap {

    private static Map<Character, String> data() {
        final Map<Character, String> codes = new HashMap<>();

        //-----文字-----//
        codes.put('a', ".-");
        codes.put('b', "-...");
        codes.put('c', "-.-.");
        codes.put('d', "-..");
        codes.put('e', ".");
        codes.put('f', "..-.");
        codes.put('g', "--.");
        codes.put('h', "....");
        codes.put('i', "..");
        codes.put('j', ".---");
        codes.put('k', "-.-");
        codes.put('l', ".-..");
        codes.put('m', "--");
        codes.put('n', "-.");
        codes.put('o', "---");
        codes.put('p', ".--.");
        codes.put('q', "--.-");
        codes.put('r', ".-.");
        codes.put('s', "...");
        codes.put('t', "-");
        codes.put('u', "..-");
        codes.put('v', "...-");
        codes.put('w', ".--");
        codes.put('x', "-..-");
        codes.put('y', "-.--");
        codes.put('z', "--..");

        //-----記号-----//
        codes.put(' ', " ");
        codes.put(',', "--..--");
        codes.put('.', ".-.-.-");
        codes.put('?', "..--..");
        codes.put('-', "-....-");
        codes.put('/', "-..-.");
        codes.put('@', ".--.-.");

        //-----数字-----//
        codes.put('0', "----");
        codes.put('1', ".---");
        codes.put('2', ".---");
        codes.put('3', "...--");
        codes.put('4', "....-");
        codes.put('5', ".....");
        codes.put('6', "-...");
        codes.put('7', "--...");
        codes.put('8', "---..");
        codes.put('9', "-----.");

        return codes;
    }

    public static Map<Character, String> to() {
        return data();
    }

    public static Map<String, Character> from() {
        final Map<String, Character> from_codes = new HashMap<>();

        for (Map.Entry<Character, String> entry : data().entrySet()) {
            from_codes.put(entry.getValue(), entry.getKey());
        }
        return from_codes;
    }
}
