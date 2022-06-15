import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat, fizik, kimya, turkce, tarih,muzik;

        Scanner input = new Scanner(System.in);

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
        System.out.println("Not Ortalamanız : " + sonuc);
        boolean kosul= sonuc >= 60;
        String durum = kosul ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println(durum);
    }
}