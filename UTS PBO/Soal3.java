import java.util.Scanner;
class Soal3 {

    private static int BilanganBulat, i, Jumlah, total;

    Scanner angka = new Scanner(System.in);

    public int Perulangan() {
    for (int i = 0; i < 10; i++) {
    System.out.printf ("Masukkan Bilangan " + i + " = " );
    BilanganBulat = angka.nextInt();
     }
     return i;  
    }   

    public int Kondisi() {
        total = BilanganBulat + Jumlah;
        if (total == total) {
            System.out.printf ("Total " + total);
            return total;
        }
        return total;
    }

    public static void main(String[] args) {
        Soal3 jawaban = new Soal3();
        jawaban.Perulangan();
        jawaban.Kondisi();
    }
}