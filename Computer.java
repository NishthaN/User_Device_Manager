import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;


public class Computer extends User{

    // create internal object

    Data data1;
    private int ram;
    private String processor;
    private String mother_board;
    public char id;
    ArrayList<String> removable_data = new ArrayList<String>();
    ArrayList<String> internal_data = new ArrayList<String>();

    void get(int ram, String processor, String mother_board){

        this.ram = ram;
        this.processor = processor;
        this.mother_board = mother_board;
    }

    protected void print_internal(){

        Internal i1 = new Internal();
        System.out.println("The capacity of the device is:" + i1.capacity(this.id) + "GB");
        this.data1 = i1.persistent_save(this.id);
        for (int i=0; i< super.devices.size(); i++){

            System.out.println("This device has " + super.devices.get(i).mother_board +" mother board, "+ super.devices.get(i).processor + " processor and "+ super.devices.get(i).ram + " GB RAM.");
            System.out.println("Document Storage:" + super.devices.get(i).data1.documents_storage + " GB");
            System.out.println("Music Stoage:" + super.devices.get(i).data1.music_storage + " GB");
            System.out.println("Media Storage:" + super.devices.get(i).data1.media_storage + " GB");
            System.out.println("Application Storage:" + super.devices.get(i).data1.applications_storage + " GB");
            
            
            int a = 0;
            System.out.println("Enter data to store in device:");
            while(a!=-999){
            Scanner sc1 = new Scanner(System.in);
            String s = sc1.next();
            internal_data.add(s);
            System.out.println("Enter data to store in device, enter -999 to stop storing ");
            a = Integer.parseInt(sc1.next());

            }

        }
    }
    protected void print_removable() {
        Removable r1 = new Removable();
        Data result = r1.calculate();
        System.out.println("Document Storage:" + result.documents_storage + " GB");
            System.out.println("Music Stoage:" + result.music_storage + " GB");
            System.out.println("Media Storage:" + result.media_storage + " GB");
            int a = 0;
            System.out.println("Enter data to store in device:");
            while(a!=-999){
            Scanner sc1 = new Scanner(System.in);
            String s = sc1.next();
            removable_data.add(s);
            System.out.println("Enter data to store in device, enter -999 to stop storing ");
            a = Integer.parseInt(sc1.next());

            }
    }

    }
    
