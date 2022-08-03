import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class SayiTahmini {



    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int number = rand.nextInt(100);

        int right = 0;
        int selected;
        boolean isWin = false;
        int[] wrong = new int[5];

        while(right<5){
            System.out.println("Lütfen tahmininizi giriniz : ");
            selected = input.nextInt();
            if( selected < 0 || selected > 99){
                System.out.println("Lütfen 0-100 arasında bir değer giriniz.");
                continue;
            }
            if( selected == number){
                System.out.println("Tebrikler, doğru tahmin ! Tahmin ettiğiniz sayı : " + number);
                isWin = true;
                break;
            } else{
                wrong[right] = selected;
                System.out.println("Hatalı bir sayı girdiniz !");
                if(selected > number){
                    System.out.println(selected + " sayısı, ilgili sayıdan büyüktür.");
                } else {
                    System.out.println(selected + " sayısı, ilgili sayıdan küçüktür.");
                }
                wrong[right++] = selected;
                System.out.println("Kalan hakkı : " + (5 - right));
            }
        }

        if(!isWin){
            System.out.println("Kaybettiniz ! ");
            System.out.println("Tahminleriniz : " + Arrays.toString(wrong));
        }

    }

}
