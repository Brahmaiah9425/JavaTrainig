import java.util.Scanner;
public class DayDisplay
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 to 7 number to get the day name:");
        int day = sc.nextInt();
        switch(day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("ThursDay");
                break;
            case 5:
                System.out.println("FriDay");
                break;
            case 6:
                System.out.println("SaturDay");
                break;
            case 7:
                System.out.println("SunDay");
                break;
            default:
                System.out.println("Invalid input! Please enter a number between 1 and 7.");
            }


    }
}