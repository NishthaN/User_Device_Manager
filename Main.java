import java.util.*;
import java.io.*;
import java.util.ArrayList;

public class Main {
static ArrayList<User> users = new ArrayList<User>();
static ArrayList<Integer> user_ids = new ArrayList<Integer>();
static ArrayList<Computer> comp = new ArrayList<Computer>();


    public static void main(String args[]) {

        System.out.println("Type any number to add new user, -999 to exit");
        int n=0;
        while(n!= -999){
        User u1 = new User();
        Computer  c1 = new Computer();
        System.out.println("Enter user ID: ");
        Scanner sc1 = new Scanner(System.in);
        int m = sc1.nextInt();
        u1.create();
        users.add(u1);
        comp.add(c1);
        user_ids.add(m);
        System.out.println("Type any number to add new user, -999 to exit");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        
        }
        
        System.out.println("Enter your user ID to display the devices:");
        Scanner sc2 = new Scanner(System.in);
        int m1= sc2.nextInt();
        int i = user_ids.indexOf(m1);
        System.out.println("Your devices are:");

        for(int j=0; j<users.get(i).devices.size(); j++){

            System.out.println(users.get(i).devices.get(j)+ "\n");
        }

        
        System.out.println("The data in internal storage is: " + comp.get(i).internal_data.get(i));
        System.out.println("The data in external storage is: " + comp.get(i).removable_data.get(i));

    }
}