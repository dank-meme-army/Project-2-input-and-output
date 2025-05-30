import java.util.Scanner;

public class Main {

public static void main(String[] args){
Scanner in = new Scanner(System.in);

    //input seconds worked <- convert that into h/m/s h and s is realtive to s
    //get the pay for the day. based on the rate
    System.out.print("how long have you worked in seconds: ");
    int totalSec = in.nextInt();
    System.out.print("what is your hourly pay?: ");
    double salary = in.nextInt();

    int hours = totalSec/60;
    int leftoverSec = totalSec % 3600;
    int minutes = leftoverSec/60;
    int secRemain = leftoverSec %60;


    //display section

    System.out.print("\n---Information Section----\n");
    System.out.println("total time worked is: "+ hours+ " hours  "+ minutes+" minutes  " + secRemain + " seconds \n" );
    System.out.printf("your total pay is $%.2f\n", salary);

    in.close();


    }
}


