package com.java.assignments.assignment8;

import java.io.IOException;
import java.lang.Exception;
import java.util.Scanner;

class ExceptionGen{
    public ExceptionGen(){
        System.out.println("Exception Throw Class");
    }
    public void divNums(int a,int b) throws ArithmeticException {
        if(b==0){
            throw new ArithmeticException("Denominator can not be zero");
        }
        else{
            System.out.println(a/b);
        }
    }
    public void balanceCheck(int amount) throws IOException {
        if(amount<=1000){
            throw new IOException("Insufficient Balance");
        }
        else{
            System.out.println("Sufficient Balance");
        }
    }
    public void checkAge(int age) throws Exception {
        if(age<=18){
            throw new Exception("You are not an adult");
        }
        else{
            System.out.println("You are eligible");
        }
    }
}

public class ExceptionHandlingDemo {
    public static void main(String args[]){
        ExceptionGen ob = new ExceptionGen();
        Scanner sc=new Scanner(System.in);
        //System.out.println("Enter your age: ");
        //int age=sc.nextInt();
        try{
            //ob.divNums(3,0);
            ob.balanceCheck(900);
            //ob.checkAge(12);
        }
        catch (ArithmeticException ex){
            System.out.println(ex.getMessage());
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        finally {
            System.out.println("Age Check Completed");
        }


    }
}
