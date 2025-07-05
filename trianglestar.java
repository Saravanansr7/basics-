import java.util.Scanner;
public class trianglestar {
    public static void main(String[] args) {
       Scanner my = new Scanner(System.in);  
       int n = my.nextInt();
       int px = my.nextInt();
       int py = my.nextInt();
       for(int i =1;i<=n;i++){
        for(int j = 1;j<n*2;j++){
           if(j>=px&&j<=py){
            System.out.print("*");}
            else{
                System.out.print(" ");
            }
        }
        px--;
        py++;

        System.out.println();

       }
    }
    
}
