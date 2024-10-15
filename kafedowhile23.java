import java.util.Scanner;

public class kafedowhile23 {
    public static void main(String[] args) {
        Scanner input23 = new Scanner(System.in);
        int kopi, teh, roti, totalHarga;
        String namaPelanggan;
        int hargaKopi = 12000, hargaTeh = 7000, hargaRoti = 20000;

        do {
            System.out.println("Masukkan nama pelanggan (ketik 'batal' untuk keluar): ");
            namaPelanggan = input23.nextLine();
            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi dibatalkan.");
                break;
            }
            System.out.println("Jumlah kopi: ");
            kopi = input23.nextInt();
            System.out.println("Jumlah teh: ");
            teh = input23.nextInt();
            System.out.println("Jumlah roti: ");
            roti = input23.nextInt();
            
            totalHarga = (kopi * hargaKopi) + (teh * hargaTeh) + (roti * hargaRoti);
            
            System.out.println("Total yang harus dibayar: Rp " + totalHarga);
            input23.nextLine();
        } while (true);

        System.out.println("Semua transaksi selesai.");
}

}
