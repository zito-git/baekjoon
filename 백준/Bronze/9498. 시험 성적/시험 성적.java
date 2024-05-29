import java.util.Scanner;

class Main {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int n1 = sc.nextInt();
     if(90<=n1 && n1<=100){
         System.out.println("A");
     }else if(80<=n1 && n1<=89){
         System.out.println("B");
     }else if(70<=n1 && n1<=79){
         System.out.println("C");
     }else if(60<=n1 && n1<=69){
         System.out.println("D");
     }else{
         System.out.println("F");
     }
    }
}