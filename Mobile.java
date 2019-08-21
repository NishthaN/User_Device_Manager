import java.util.Scanner;

public class Mobile extends Computer  implements Charger{

    public Mobile(){

    super();
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter processor, motherboard and RAM for the mobile:");
    String proc = sc.next();
    String board = sc.next();
    int n = Integer.parseInt(sc.next());

    super.get(n, proc,board);
    super.print_internal();
    super.print_removable();
    charger();
    }

    
   

    public void charger(){

        System.out.println("Enter battery percentage");
        Scanner sc1 = new Scanner(System.in);
        int charge = Integer.parseInt(sc1.next());
        if(charge<=15)
        System.out.println("Laptop needs to be plugged in");
        if(charge==100)
        System.out.println("Laptop is charged");
        
    }    
    
    
    
}