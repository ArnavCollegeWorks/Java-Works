import java.util.*;
public class Scanner001{
    public static void main(String[] args){//lnct jnct 2026
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your name:");
        String name=sc.nextLine();
        System.out.print("Enter your roll no.:");
        String roll=sc.next();
        System.out.print("Enter your branch:");
        String branch=sc.next();
        System.out.print("Enter your age:");
        Double age=sc.nextDouble();

        System.out.println("Name:"+ name+"\nRoll No:"+roll+"\nBranch:"+branch+"\nAge:"+age);
    }
}