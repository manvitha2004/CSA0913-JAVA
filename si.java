import java.util.*;
class Manvi {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the principal amount:");
        int p=sc.nextInt();
        sc.nextLine();
        System.out.print("Enter the no of years:");
        int t=sc.nextInt();
        sc.nextLine();
        System.out.print("Is customer senior citizen (y/n):");
        char a=sc.next().charAt(0);
        int r;
        if(a=='y'){
            r=12;
            int i=(p*t*r)/100;
            System.out.println("interest: "+i);
        }
        else if(a=='n'){
            r=10;
            int i=(p*t*r)/100;
            System.out.println("interest: "+i);
        }
        else{
            System.out.println("Invalid input");
        }
    }
}
