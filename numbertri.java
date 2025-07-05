import java.util.Scanner;
public class numbertri {
    public static void main(String[] args) {
        Scanner my = new Scanner(System.in);
        int a = my.nextInt();
        int b = my.nextInt();
        int n = 1;
        for(int i = 1;i<=a;i++){
            for(int j=1;j<=i;j++){
                System.out.print(n+" ");
                n++;
            }
            System.out.println(" ");
        }
    }
    
}
