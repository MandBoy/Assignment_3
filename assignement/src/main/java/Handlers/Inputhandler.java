package Handlers;

import java.util.Scanner;

public class Inputhandler{
    private static Scanner scanner = new Scanner(System.in);

    public String getStr(){
        String str = scanner.next();
        return str;
    }
    public int getInt(){
        while(!scanner.hasNextInt()){
            scanner.next();
        }
        return scanner.nextInt();
    }
    public double getDouble(){
        while(!scanner.hasNextDouble()){
            scanner.next();
        }
        return scanner.nextDouble();
    }
}
