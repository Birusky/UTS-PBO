import java.util.Scanner;

class InputNomor4 {
    protected static double phi = 3.14;
    protected static double Jari, Keliling, Luas;

    Scanner angka = new Scanner(System.in);
    public void setphi(double p) {
        this.phi = p;
    }
    public void setJari(double J) {
        this.Jari = J;
    }
    public double getphi(){
        return this.phi;
    }
    public double getJari(){
        return this.Jari;
    }

    public void inputNilai(){

     System.out.print("Masukan Jari-Jari: ");
     this.Jari = angka.nextDouble();
    
    }
}
