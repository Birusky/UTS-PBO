import java.util.Scanner;
/* Buatlah sebuah program dengan OOP menghitung biaya percakapan si Smartphone Anda.
Inputan ke program adalah waktu awal dan waktu selsai  percakapan(jam, menit, detik).
Keluarnya adalah lama dan biaya percakapan. Satu pulsa = 5 detik dan  ongkos per pulsa adalah Rp. 150.-
 */

class Soal1
{
    public static void main(String args[])
    {
        Scanner angka = new Scanner(System.in);

        int Jam1,Menit1,Detik1, Jam2,Menit2,Detik2;
        int waktuAwal, waktuSelesai,selisih,ongkos;

        System.out.println("Waktu Awal");
        System.out.print("Masukkan Jam Awal: ");
        Jam1= angka.nextInt();
        System.out.print("Masukkan Menit Awal: ");
        Menit1= angka.nextInt();
        System.out.print("Masukkan Detik Awal: ");
        Detik1= angka.nextInt();
        System.out.println("Waktu Selesai Percakapan");
        System.out.print("Masukkan Jam: ");
        Jam2= angka.nextInt();
        System.out.print("Masukkan Menit: ");
        Menit2= angka.nextInt();
        System.out.print("Masukkan Detik: ");
        Detik2= angka.nextInt();

        //Mencari Perhitungan Selisih Lama Telpon
        waktuAwal=3600*Jam1+(60*Menit1)+Detik1;
        waktuSelesai=3600*Jam2+(60*Menit2)+Detik2;
        selisih=waktuSelesai-waktuAwal;

        //Perhitungan Biaya
        ongkos = (selisih / 5) * 150;

        System.out.println("Waktu Awal Telp  : " +Jam1 + " Jam " + Menit1 + " Menit " + Jam1 + " Detik");
        System.out.println("Waktu Akhir Telp : " + Jam2 + " Jam " + Menit2 +" Menit " +Jam2 + " Detik");
        System.out.println("Lama Telepon     : "+selisih+" detik");
        System.out.println("Ongkos Yang Digunakan : "+ongkos+" rupiah");
    }
}