package com.bridglabz;
import java.util.*;
import java.util.regex.*;

public class UserValidation {
    void firstName(){
        Pattern pattern=Pattern.compile("[A-Za-z]{3,}");
        System.out.println("Enter the firstName");
        Scanner sc=new Scanner(System.in);
        String firstName=sc.next();
        Matcher matcher=pattern.matcher(firstName);
        if(matcher.matches()){
            System.out.println("is valid");
        }else{
            System.out.println("is invalid");
        }
    }
    void lastName(){
        Pattern pattern=Pattern.compile("[A-Za-z]{3,}");
        System.out.println("Enter the lastName");
        Scanner sc=new Scanner(System.in);
        String lastName=sc.next();
        Matcher matcher=pattern.matcher(lastName);
        if(matcher.matches()){
            System.out.println("is valid");
        }else{
            System.out.println("is invalid");
        }
    }



    public static void main(String[] args) {
        UserValidation e=new UserValidation();
        e.firstName();
        e.lastName();


    }
}
