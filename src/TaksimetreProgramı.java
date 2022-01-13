import java.util.Scanner;

public class TaksimetreProgramı {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double KmBaşıÜcret=2.20;
        int minimumTutar=20;

        System.out.println("Gidilen mesafeyi giriniz: ");
        double gidilenMesafe=input.nextDouble();

        double ÖdenecekÜcret=(gidilenMesafe*KmBaşıÜcret>10)?gidilenMesafe*KmBaşıÜcret+10:minimumTutar;
        System.out.println("Toplam Tutar: "+ÖdenecekÜcret);

    }
}
