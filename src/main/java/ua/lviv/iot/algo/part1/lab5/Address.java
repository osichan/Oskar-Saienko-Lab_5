package ua.lviv.iot.algo.part1.lab5;

import java.nio.charset.StandardCharsets;
import java.util.Objects;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Address {
    private static final String pattern = "[A-Z][a-z][a-zA-Z -]+,? ?(str)\\.? ?[A-Z][a-z][a-zA-Z -]+,? ?[0-9]+[a-zA-Z]?+";

    public String replaceToAddress(String text) {
        if (text == null || text.isEmpty()) {
            return null;
        }
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(text);
        while (m.find()) {
            text = m.replaceAll("ADDRESS");
        }
        return text;
    }

    public static void main(String[] args) {
        System.out.print("Write your text or write 'stop' to stop program: \n\n");
        while(true){
            Address address = new Address();
            Scanner scanner = new Scanner(System.in, StandardCharsets.UTF_8);
            String text = scanner.nextLine();
            if(Objects.equals(text, "stop")) {
                break;
            }
            System.out.println(address.replaceToAddress(text+"\n-------------------------------------------------------------------"));
        }
    }
}