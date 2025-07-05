import java.util.Scanner;
public class divisible {
    public static void main(String[] args) {
        Scanner my = new Scanner(System.in);
        int a = my.nextInt();
        for(int i = 0;i<=a;i++){
            if((i%2==0)&&(i%3==0)&&(i%5==0)){
                System.out.println(i+" ");
            }
        }
    }
    
}
