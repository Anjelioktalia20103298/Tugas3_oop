package konversisuhu;

import java.util.Scanner;

/**
 *
 * @author 20103298 Anjeli Oktalia
 */
public class suhu extends KonversiSuhu{
    Scanner scan = new Scanner(System.in);
    public void celciuskefahrenheit (double C, double F){
       System.out.print("Masukan Nilai Celcius : " );
       C = scan.nextDouble();
       F =  (C * 1.8 + 32);
       System.out.println("Hasil : " + F);
   }
    public void fahrenheitkecelcius (double F, double C){
       System.out.print("Masukan Nilai Fahrenheit : " );
       F = scan.nextDouble();
       C = ((F - 32) / 1.8);
       System.out.println("Hasil : " + C);
   }
}
