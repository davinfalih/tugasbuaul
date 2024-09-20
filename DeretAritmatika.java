import java.util.Scanner;
public class DeretAritmatika {
    public static void main(String[] args) {
        int batasAtas, batasBawah, beda, hasil = 0;
        
        Scanner s = new Scanner(System.in);

        System.out.println("Masukkan batas bawah: ");
        batasBawah = s.nextInt();
        System.out.println("Masukkan batas atas: ");
        batasAtas = s.nextInt();
        System.out.println("Masukkan beda: ");
        beda = s.nextInt();

        System.out.println("Deret Aritmatika: ");
        for (int i = batasBawah; i <= batasAtas; i += beda) {
            System.out.print(i + " .");
        }
        System.out.println();
    }

}
