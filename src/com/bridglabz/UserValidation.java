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
    void Email(){
        Pattern pattern=Pattern.compile("^[A-Za-z0-9+_.-]+@(.+)$");
        System.out.println("Enter the EmailId");
        Scanner sc=new Scanner(System.in);
        String EmailIdName=sc.next();
        Matcher matcher=pattern.matcher(EmailIdName);
        if(matcher.matches()){
            System.out.println("is valid");
        }else{
            System.out.println("is invalid");
        }
    }

    void MobileNo(){
        Pattern pattern = Pattern.compile("(0/91)?[7-9][0-9]{9}");
        System.out.println("Enter the MobileNo");
        Scanner sc=new Scanner(System.in);
        String MobileNo=sc.next();
        Matcher matcher=pattern.matcher(MobileNo);
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
        e.Email();
        e.MobileNo();


    }
}
