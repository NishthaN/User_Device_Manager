import java.util.Scanner;
import java.io.*;
public class Removable extends Storage{

    public Data persistent_save(char ch){
        Data d= new Data();
        return d;
    }

    public int capacity(char ch){
        return 0;
    }

    public Data calculate(){

        System.out.println("Enter if USB or HDD or Memory Card");
        Scanner sc= new Scanner(System.in);
        char ch = sc.next().charAt(0);
        External ex = new External();
        int cap = ex.capacity(ch);
        System.out.println("The capacity of the removable device is" + cap + " GB");
        return  ex.persistent_save(ch);


    }
}
