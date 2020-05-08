
import java.util.Scanner;
import Building.Statistika;
import java.util.Arrays;


public class Hitung {
    private static Object input;
    public static void main (String [] args ){
    Statistika hitung = new Statistika();
    Scanner in = new Scanner (System.in);
   
    for(int y = 1;y< 5; y++){
        System.out.println(" ");
        System.out.println("===================================================");
        System.out.println("STATISTIKA DASAR");
        System.out.println("1. Median");
        System.out.println("2. Range");
        System.out.println("3. Modus");
        System.out.println("4. Mean");
        System.out.println("===================================================");
        System.out.print("     Masukkan pilihan anda:");
        System.out.println(" ");
        y=in.nextInt();
        //Branching
        switch(y){
            case 1 :
                System.out.println("Mencari Nilai Median dari :  ");
                hitung.median();
                break;
            case 2 :
                System.out.println("Mencari Nilai Rentang dari  :  ");
                hitung.Rentang();
                break;
            case 3 :
                System.out.println("Mencari Nilai Modus dari :  ");
                hitung.Modus();
                break;
            case 4 :
                System.out.println("Mencari Nilai Mean dari :  ");
                hitung.Mean();
                break;   
        }}
    }
        
}
