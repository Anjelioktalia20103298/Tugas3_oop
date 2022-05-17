package konversisuhu;

import java.util.Scanner;

/**
 *
 * @author 20103298_Anjeli Oktalia
 */
public class KonversiSuhu {
    public static void main(String[] args) {
        suhu S = new suhu();
        double C =0,F=0;
        int pilih,pilihan = 0;
        
        Scanner scan = new Scanner(System.in);
        suhu konversi = new suhu();
        System.out.println("Pilih Konversi Suhu Yang Diinginkan : ");
        System.out.println("1. Celcius ke Fahrenheit"); 
        System.out.println("2. Fahrenheit ke Celcius"); 
        System.out.print("Pilih : ");
        pilih = scan.nextInt();
        
        switch(pilih){
            case 1 -> konversi.celciuskefahrenheit(C, F);
            case 2 -> konversi.fahrenheitkecelcius(F, C);
                
        }
    }
    
}
