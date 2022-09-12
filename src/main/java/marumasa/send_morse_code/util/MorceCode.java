package marumasa.send_morse_code.util;

import java.util.Map;

public class MorceCode {

    private static final Map<Character, String> toCodeMap = CodeMap.to();

    //モールス信号をアルファベットに変換
    public static String fromCode(String text) {
        return null;
    }

    //アルファベットをモールス信号に変換
    public static String toCode(String text) {

        StringBuilder data = new StringBuilder();

        int length = text.length();
        for (int loop = 0; loop < length; loop++) {
            String code = toCodeMap.get(text.charAt(loop));
            if (code == null) return null;
            data.append(code);
            data.append(" ");
            if (loop == length - 1) data.append(" ");
        }
        return data.toString();
    }
}