import java.util.*;
public class gradeCal {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter number of subjects");
        int n=s.nextInt();
        int a[]=new int[n];
        System.out.println("enter marks for 100");
        for(int i=0;i<n;i++){
        a[i]=s.nextInt();
        }
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=a[i];
        }
        if(sum>=85){
         System.out.println("A");
        }
        else if(sum>=75 && sum <85){
            System.out.println("B");
        }
        else if(sum>=65 && sum <75){
            System.out.println("C");
        }
        else if(sum>=45 && sum<65){
            System.out.println("D");
        }
        else{
            System.out.println("F");
        }
    }
}
