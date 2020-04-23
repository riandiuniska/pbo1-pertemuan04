package perulangan;

import java.util.Scanner;

public class TugasPerulangan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //Untuk mengimput nilai/data dari user

        System.out.println ("==========|PERKALIAN|==========");
        System.out.print ("Masukkan angka sagan dikali = ");
        int angka = input.nextInt();

        for (int i = 1; i <= 10; ++i)
            System.out.println (i+". Hasil dari Perkalian "+i+" x "+angka+" = "+(i*angka));

    }
}
