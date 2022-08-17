import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        int n;
        double sonuc = 0;

        System.out.println("n Sayısını giriniz: ");
        n = giris.nextInt();

        for (double i = 1 ; i <= n ; i++){
            sonuc = sonuc + (1/i);
        }
        System.out.println(sonuc);


    }
}