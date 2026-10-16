import java.util.*;
public class Scanner002{
    public static void main(String[] args){//lnct jnct 2026
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name, roll no., branch, age:");
        String name=sc.nextLine();
        String roll=sc.next();
        String branch=sc.next();
        Double age=sc.nextDouble();

        System.out.println("Name:"+ name+"\nRoll No:"+roll+"\nBranch:"+branch+"\nAge:"+age);
    }
}