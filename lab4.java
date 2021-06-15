package flightsystem;
import java.util.Scanner;
class flights {
    static class Node{
        String data;
        Node next;
        Node(String d){
            data=d;
            next=null;
        }
    }
    Node head;
    String name;
    flights(String n){
        name=n;
    }
    flights(){
        
    }
    static flights insert(flights f,String d) {
        Node new_node=new Node(d);
        if(f.head==null) {
            f.head=new_node;
        }
        else {
            Node last=f.head;
            while(last.next!=null) {
                last=last.next;
            }
            last.next=new_node;
        }
        return f;
    }
    static void printdata(flights f) {
        Node current=f.head;
        if(current==null) {
            System.out.println("No passenger");
        }
        while(current!=null) {
            System.out.println(current.data+" ");
            current=current.next;
        }
        System.out.println();
    }
    static flights delete(flights f, String d) {
        Node prev=f.head;
        Node current=prev.next;
        if(prev.data.equals(d)) {
            f.head=current;
        }
        else {
            while(current.next!=null) {
                if(current.data.equals(d)) {
                    prev.next=current.next;
                }
                prev=current;
                current=current.next;
            }
        }
        return f;
    }
    static void lengthoflist(flights f) {
        Node current=f.head;
        int sum=0;
        if(current==null) {
            System.out.println(0);
        }
        else {
            while(current!=null) {
                current=current.next;
                sum++;
            }
            System.out.println(sum);
        }
    }
}

public class booking_UI{
    public static void main(String[]args) {
        System.out.println("Enter the number of flights:");
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        in.hasNextLine();
        flights f[]=new flights[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter flight "+(i+1)+" number:");
            String name=in.next();
            flights ob=new flights(name);
            f[i]=ob;
        }
        int option;
        do{
            System.out.println("Choose an option:");
            System.out.println("1-->Booking a reservation");
            System.out.println("2-->Cancelling a reservation");
            System.out.println("3-->Printing names");
            System.out.println("4-->Print number of passengers:");
            System.out.println("5-->Exit");
            option=in.nextInt();
            String name;
            flights ob=new flights();
            switch(option){
            case 1:
                System.out.println("Enter flight number:");
                name=in.next();
                for(int i=0;i<f.length;i++){
                    if(f[i].name.equals(name))
                        ob=f[i];
                }
                System.out.print("Enter the number of passengers:");
                int no=in.nextInt();
                in.nextLine();
                for(int i=0;i<no;i++){
                    System.out.print("Enter the name of passenger "+(i+1)+":");
                    name=in.nextLine();
                    flights.insert(ob,name);
                }
                System.out.println("Your booking is confirmed!");
                break;
            case 2:
                System.out.println("Enter the flight number:");
                name=in.next();
                for(int i=0;i<f.length;i++){
                    if(f[i].name.equals(name))
                    {
                        ob=f[i];
                        break;
                    }
                }
                System.out.println("Enter no. of bookings to be cancelled:");
                no=in.nextInt();
                in.nextLine();
                for(int i=0;i<no;i++){
                    System.out.print("Enter the name of passenger "+(i+1)+":");
                    name=in.nextLine();
                    flights.delete(ob,name);
                }
                break;
            case 3:
                System.out.print("Enter the flight number:");
                name=in.next();
                for(int i=0;i<f.length;i++){
                    if(f[i].name.equals(name)) {
                        ob=f[i];
                        break;
                    }
                }
                System.out.println("List of passengers travelling in the flight "+name+" are:");
                flights.printdata(ob);
                break;
            case 4:
                System.out.print("Enter the flight number:");
                name=in.next();
                for(int i=0;i<f.length;i++){
                    if(f[i].name.equals(name)){
                        ob=f[i];
                        break;
                    }
                }
                flights.lengthoflist(ob);
                break;
            case 5:
                break;
            }
        }while(option!=5);
    in.close();
    }
}
