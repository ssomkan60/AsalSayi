import java.util.Scanner;
public class DongulerOdevAsalSayiBulma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n=0;

        for (int i=1;i <= 100; i++){
            for (int k=1; k<i; k++){
                if((i%k) == 0 ){
                    n++;
                }
            }
            if(n == 1){
                System.out.print(i+ " ");
            }
            n=0;
        }
    }
}
