package org.java8.lambda.demo4;

/**
 * Created by Mayank on 4/3/2016.
 */
public class Demo4 {

    public static void main(String[] args) {

        String user = "mgupta";

        // 1.
        Email emailLambdaExpression = (String name) -> name + "@gmail.com";
        System.out.println(emailLambdaExpression.constructEmail(user));

        // 2. Input argument type invoked from target
        Email emailLambdaExpression2 = name -> name + "@gmail.com";
        System.out.println(getEmail(user, emailLambdaExpression2));

        // 3.
        System.out.println(getEmail("rohan", name -> name + "@gmail.com"));

    }

    public static String getEmail(String userName, Email email) {
        return email.constructEmail(userName);
    }

    public interface Email {
        String constructEmail(String name);
    }
}
