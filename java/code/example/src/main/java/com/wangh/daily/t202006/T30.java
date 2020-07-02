package com.wangh.daily.t202006;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class T30 {
    public static void main(String[] args) {
        String str = "水电费阿发违法";
        System.out.println(str);

        Matcher m = Pattern.compile("\\w+")
                .matcher("Evening is  full of the linnet's wings");
        while (m.find()) {
            System.out.print(m.group() + " ");
        }
        System.out.println();

        int i = 0;
        while (m.find(i++)) {
            System.out.print(m.group() + "|");
        }
        System.out.println();


        Matcher matcher = Pattern
                .compile(REGEX)
                .matcher(POEM);
        System.out.println(matcher.groupCount());
        while (matcher.find()) {
            for (int j = 0; j <= matcher.groupCount(); j++)
                System.out.print("[" + matcher.group(j) + "]");
            System.out.println();
        }
    }

    public static final String REGEX = "(?m)(\\S+)\\s+((\\S+)\\s+(\\S+))$";
    public static final String POEM =
            "Twas brillig, and the slithy toves\n" +
                    "Did gyre and gimble in the wabe.\n" +
                    "All mimsy were the borogoves,\n" +
                    "And the mome raths outgrabe.\n\n" +
                    "Beware the Jabberwock, my son,\n" +
                    "The jaws that bite, the claws that catch.\n" +
                    "Beware the Jubjub bird, and shun\n" +
                    "The frumious Bandersnatch.";
}
