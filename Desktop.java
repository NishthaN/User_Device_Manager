import java.util.Scanner;

public class Desktop extends Computer {

    public Desktop(){

    super();
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter processor, motherboard and RAM for the desktop:");
    String proc = sc.next();
    String board = sc.next();
    int n = Integer.parseInt(sc.next());

    super.get(n, proc,board);
    
            System.out.println("Desktop is always plugged in");
    super.print_internal();
    super.print_removable();
   



    
    }
}