package com.Behavioral.Interpreter;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InterpreterDemo {

    public static void main(String arg[]){

        String input="Lions, and tigers, and bears! oh,my!";

        Pattern pattern= Pattern.compile("(Lions|cat|dog|wolf|human|tiger|liger)");

        Matcher matcher=pattern.matcher(input);

        while (matcher.find()){
            System.out.println("Found a "+ matcher.group()+" .");
        }

    }

}
