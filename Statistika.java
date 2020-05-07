/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Building;

import java.util.Scanner;
/**
 *
 * @author Windows 10
 */
public class Statistika {
     Scanner input = new Scanner (System.in);
     
    public void median(){
        //Variabel Array
        double angka[] = new double[10];
        //Input Data
        for (int i = 0; i < 10; i= i+1){
            System.out.print("Data Ke-  "+(i+1) +" : ");
        }
        //Mengrurutkan input data
        for (int i = 0; i<9; i++){
            for (int j = 0; j < 9 - 1; j++){
                if (angka[j]> angka[j + 1]){
                    double n = angka[j];
                    angka[j] = angka[j + 1];
                    angka[j + 1]= n;
                }
            }  
        }
        double median = (angka[4]+ angka[2])/2;
        //Cetak Hasil Median
        System.out.println("Median : "+median);
        System.out.print("\n");
    }
    
    
    public void Rentang(){
        //Variabel Array
        double angka[]= new double[10];
        //Input Data
        for (int i = 0; i < 10; i = i + 1){
            System.out.print("Data Ke-  "+(i + 1)+ ":  ");   
        }
        //Mengurutkan Inputan Data
         for(int i = 0; i < 9; i++){
            for (int j = 0; j < 9 - 1; j++){
                double n = angka[j];
                 angka[j] = angka[j + 1];
                    angka[j + 1]= n;
                }
            }
         double Rentang = (angka[9]-angka[0]);
         //Cetak Hasil Rentang
         System.out.println("Rentag :  "+Rentang);
         System.out.print("\n");
    }
    
    
    public void Modus(){
        //Variabel Array
        double angka[] = new double[10];
        //Input Data
        for (int i = 0; i < 10; i = i + 1){
            System.out.print("Data Ke-  "+(i + 1)+ ":  ");   
        }
        //Mengurutkan inputan data
        for(int i = 0; i < 9; i++){
            for (int j = 0; j < 9 - 1; j++){
                double n = angka[j];
                 angka[j] = angka[j + 1];
                    angka[j + 1]= n;
                }
            }
        double jumlahAngka = 0;
        double jumlahModus = 0;
        double modus = 0;
        for(int i = 0; i < 10; i++){
            for (int j = 0; j < 10; j++){
                if (angka[j]== angka[i]&& j !=i){
                    jumlahAngka++;
                }
                if(jumlahAngka >= jumlahModus){
                    jumlahModus = jumlahAngka;
                    modus = angka[1];
                    jumlahAngka = 0;
                }
            }
        //Cetak Hasil Modus
        System.out.println("Modus  :  "+modus);
        System.out.print("\n");
        }
    }
    
    
    public void Mean(){
        //Variabel Array
        double angka[] = new double [10];
         //Input Data
        for (int i = 0; i < 10; i = i + 1){
            System.out.print("Data Ke-  "+(i + 1)+ ":  ");   
        }
        //Mengurutkan inputan data
        for(int i = 0; i < 9; i++){
            for (int j = 0; j < 9 - 1; j++){
                double n = angka[j];
                 angka[j] = angka[j + 1];
                    angka[j + 1]= n;
                }
            }
        double mean = 0;
        for (int i = 0; i < 10; i++){
            mean = mean + angka[i];
            }
        mean = mean/10;
        //Cetak hasil Mean
        System.out.println("Mean : "+mean);
        System.out.print("\n");
    }

}
    