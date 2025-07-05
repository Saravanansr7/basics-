import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        Scanner my = new Scanner(System.in);
        String a = my.nextLine();
        String rev = "";
        for(int i = a.length()-1;i>=0;i--){
            rev = rev+a.charAt(i);

        }
        if(a.equals(rev)){
            System.out.println("It is a paldrome"+a);
        }
        else{
            System.out.println("Not a paldrome"+a);
        }
    }
    
}
