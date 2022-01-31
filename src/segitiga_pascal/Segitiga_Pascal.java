package segitiga_pascal;

import java.util.Scanner;

public class Segitiga_Pascal 
{
    public static int Faktorial (int bilangan){
        int angka, count, faktor, hitung;
        angka = bilangan;
        for (count = 1,faktor = 1; count <= angka; faktor = faktor * count,count++) {
        }
        
        return faktor;
    }
    
    public static int segitigaPascal(int n, int r)
    {
        int kurang, combinasi;
        kurang = n - r;
        combinasi = Faktorial(n) / (Faktorial(r) * Faktorial(kurang) );
        
        return combinasi;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        int masuk, kolom, baris;
        do
        {
            System.out.printf  ("Masukkan Angka Faktoria = ");
            masuk = sc.nextInt();
        }while(masuk <= 2 );
        
        for (baris = 0; baris <= masuk; baris++) 
        {
            for (kolom = 0; kolom <= baris; kolom++)
            {
                for (kolom = 0; kolom <= baris; kolom++) {
                    System.out.printf("%5d",(int)segitigaPascal(baris, kolom));
                }
                System.out.println("");
            }
        }
        
        System.out.println("");
        System.out.println(" 2020 Java 205314020 ");
        
    }
    
}
