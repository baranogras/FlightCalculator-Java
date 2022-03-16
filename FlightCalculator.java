package Lesson3;
import java.util.Scanner;

public class FlightCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int km,age,type;

        System.out.print("Please Enter Distance : ");
        km = input.nextInt();

        double price = km * (0.10);

        System.out.print("Please Enter Your Age : ");
        age = input.nextInt();

        System.out.println("Please Choose a Trip Type : \n1- One-Way \n2- Round-Trip");
        type = input.nextInt();

        if(age<12){
            if(type==1){
                System.out.print("New Price : "+ (price/2));
            }
            else if(type==2){
                System.out.print("New Price : "+ price*0.8);
            }else{
                System.out.println("Please Enter a Valid Value!!");
            }
        }

        else if(age>=12 && age<=24){
            if(type==1){
                System.out.print("New Price : "+ (price*0.90));
            }
            else if(type==2){
                System.out.print("New Price : "+ (price*2)*0.72);
            }else{
                System.out.println("Please Enter a Valid Value!!");
            }
        }

        else if(age>24 && age<=65){
            if(type==1){
                System.out.print("New Price : "+price);
            }
            else if(type==2){
                System.out.print("New Price : "+(price*2)*0.8);
            }else{
                System.out.println("Please Enter a Valid Value!!");
            }
        }

        else if(age>65){
            if(type==1){
                System.out.print("New Price : "+ (price*0.7));
            }
            else if(type==2){
                System.out.print("New Price : "+ (price*2)*0.56);
            }else{
                System.out.println("Please Enter a Valid Value!!");
            }
        }
        else{
            System.out.println("Please Enter a Valid Value!!");
        }

    }
}
