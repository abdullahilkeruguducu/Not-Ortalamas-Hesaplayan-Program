import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Değişkenleri oluştur
        int mat, fizik, kimya, turkce, tarih,muzik;

        //Scanner sınıfımızı tanımladık
        Scanner input = new Scanner(System.in);

        // Kullanıcıdan değerleri al
        System.out.print("Matematik Notunu Giriniz :");
        mat = input.nextInt();

        System.out.print("Fizik Notunu Giriniz :");
        fizik = input.nextInt();

        System.out.print("Kimya Notunu Giriniz :");
        kimya = input.nextInt();

        System.out.print("Turkce Notunu Giriniz :");
        turkce = input.nextInt();

        System.out.print("Tarih Notunu Giriniz :");
        tarih = input.nextInt();

        System.out.print("Muzik Notunu Giriniz :");
        muzik = input.nextInt();

        int toplam = (mat + fizik + kimya + turkce + tarih + muzik);
        double sonuc = toplam / 6;
        System.out.print("Ortalama : " + sonuc);
    }
}