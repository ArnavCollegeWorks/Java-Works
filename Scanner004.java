import java.util.*;
public class Scanner004 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=null,b=null,c=null;
        int p=0,q=0,r=0;
        
        System.out.println("Enter 3 words:");
        if(sc.hasNextInt()) p=sc.nextInt();
        else a=sc.next();
        if(sc.hasNextInt()) q=sc.nextInt();
        else  b=sc.next();
        if(sc.hasNextInt()) r=sc.nextInt();
        else c=sc.next();

        if(a==null) System.out.println("1st integer:"+p);
        else System.out.println("1st word:"+a);
        if(b==null) System.out.println("2nd integer:"+q);
        else System.out.println("2nd word:"+b);
        if(c==null) System.out.println("3rd integer:"+r);
        else System.out.println("3rd word:"+c);

        sc.close();
    }
    
}
