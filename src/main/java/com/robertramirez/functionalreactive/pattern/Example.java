package com.robertramirez.functionalreactive.pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example {
    public static void main(String[] args) {
        String regex = "\\d+";
        String input = "1234";
        String quote = Pattern.quote(regex);
        quote = quote.replace("\\Q", "").replace("\\E","");
        Pattern pattern = Pattern.compile(quote);
        Matcher matcher = pattern.matcher(input);
        boolean matches = matcher.matches();
        System.out.println("actualString "
                + "contains REGEX = "
                + matches);
    }
}
