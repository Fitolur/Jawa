import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;

class codlab1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("\nNama : ");
        String nama = scan.nextLine();
        System.out.print("Jenis Kelamin (L/P)");
        String Kelamin = scan.nextLine();
        System.out.print("Tanggal Lahir (yyyyy-mm-dd) : ");
        String tgl = scan.nextLine();
        scan.close();

        if(Kelamin.toLowerCase().equals("p")){
            Kelamin = "Perempuan";
        }else if (Kelamin.toLowerCase().equals("1")) {
            Kelamin = "Laki-Laki";
        }
        LocalDate date = LocalDate.now();
        LocalDate tglx =LocalDate.parse(tgl);
        Period umur = Period.between(tglx, date);

        System.out.println("\n\n\nNama : " + nama);
        System.out.println("Jenis Kelamin : " + Kelamin);
        System.out.println("Umur Anda : " + umur.getYears() + " Tahun " + umur.getMonths() + " Bulan ");
    }
}