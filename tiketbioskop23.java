import java.util.Scanner;

public class tiketbioskop23 {
    public static void main(String[] args) {
        Scanner input23 = new Scanner(System.in);
        int totalTiket = 0, totalHarga = 0, jumlahTiket;
        double diskon;

        while (true) {
            System.out.print("Masukkan jumlah tiket yang terjual (0 untuk keluar): ");
            jumlahTiket = input23.nextInt();

            if (jumlahTiket == 0) {
                break;
            }

            if (jumlahTiket < 0) {
                System.out.println("Jumlah tiket tidak valid. Masukkan angka positif.");
                continue;
            }

            totalTiket += jumlahTiket;

            if (jumlahTiket > 10) {
                diskon = 0.15;
            } else if (jumlahTiket > 4) {
                diskon = 0.1;
            } else {
                diskon = 0;
            }

            int hargaPerTiket = 50000;
            int hargaSetelahDiskon = (int) (hargaPerTiket * (1 - diskon));
            int totalHargaTiket = jumlahTiket * hargaSetelahDiskon;
            totalHarga += totalHargaTiket;

            System.out.println("Total harga untuk " + jumlahTiket + " tiket: Rp " + totalHargaTiket);
        }

        System.out.println("\nTotal tiket yang terjual: " + totalTiket + " tiket");
        System.out.println("Total pendapatan: Rp " + totalHarga);
    }
}