import java.io.*;
import java.util.*;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.io.BufferedReader;

public class User {
 ArrayList<Computer> devices = new ArrayList<Computer>(); 
 Computer device1;

    public void create() {

        System.out.println("Select devices you have: 1)Desktop 2)Laptop 3)Tab 4)Mobile");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringTokenizer st = new StringTokenizer(s);
        while(st.hasMoreTokens()){

            int choice = Integer.parseInt(st.nextToken());

            switch(choice) {

                case 1:
                    device1 = new Desktop();
                    device1.id = 'D';
                    devices.add(device1);
                    break;
                
                case 2:
                    device1 = new Laptop();
                    device1.id = 'L';
                    devices.add(device1);
                    break;

                case 3:
                    device1 = new Tablet();
                    device1.id = 'T';
                    devices.add(device1);
                    break;

                case 4:
                    device1 = new Mobile();
                    device1.id = 'M';
                    devices.add(device1);
                    break;

                default:
                break; 
                
            }
        }

    

    }
}