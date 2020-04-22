package array;

import java.util.Scanner;

public class TugasArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //Untuk mengimput nilai/data dari user

        System.out.println("============|KOPERASI UNISKA|============");
        System.out.print("Masukkan jumlah item nang ditukar = ");
        int barang    = input.nextInt();
        String nama[] = new String[barang];
        int harga[]   = new int[barang];
        int jumlah[]  = new int[barang];
        int total[]   = new int[barang];
        int tot=0;

        for (int i=0; i < barang; i++){
            System.out.print("1. Nama Barang ke-"+(i+1)+" = ");
            nama[i] = input.next();
            System.out.print("2. Harga "+nama[i]+" = ");
            harga[i] = input.nextInt();
            System.out.print("3. Jumlah "+nama[i]+" = ");
            jumlah[i] = input.nextInt();
            total[i] = harga[i]*jumlah[i];
            System.out.println("4. Total Harga Barang ke-"+(i+1)+" = "+total[i]);
            System.out.println(" ");
            tot=tot+total[i];
        }
        System.out.println("===========|RINCIAN BELANJA|===========");
        for (int z=0; z < barang; z++){
            System.out.println("Barang ke-"+(z+1));
            System.out.println("1. Nama Barang   = "+nama[z]);
            System.out.println("2. Harga Barang  = "+harga[z]);
            System.out.println("3. Jumlah Barang = "+jumlah[z]);
            System.out.println(" ");
        }
        System.out.println("Total Harga Belanja Keseluruhan = "+tot);
        System.out.println("=============|TARIMA KASIH|=============");
        System.out.println("Dijual seadanya lah:)");
    }
}

