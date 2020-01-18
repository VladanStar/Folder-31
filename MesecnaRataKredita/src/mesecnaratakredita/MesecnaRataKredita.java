package mesecnaratakredita;

import java.util.Scanner;

public class MesecnaRataKredita {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // unos godisnje kamate u procentima
        System.out.println("Unesite godisnju kamatnu stou u procentima: ");
        
        double godisnjaKamata = input.nextDouble();
        // odredjivanje mesecne kamatne stope
        double mesecnaKamata = godisnjaKamata/1200;
        
        // unos vremena otplate kredita u godinama
        System.out.println("Rok otplate kredita u godinama: ");
        int godineOtplate = input.nextInt();
        
        // unos visine kredita
        System.out.println("Unesite visinu kredita: ");
        double pozajmljeniIznos = input.nextDouble();
        
        //Proracun mesecne rate kredita i ukupnog iznosa otplate
        double mesecnaRata = pozajmljeniIznos* mesecnaKamata/(1-1/Math.pow(1+ mesecnaKamata,godineOtplate*12));
        double ukupnaVracenaSuma = mesecnaRata * godineOtplate *12;
        
        // Prikaz rezultata
        System.out.println("Mesecne otplate u $ je: " + (int)(mesecnaRata*100)/100.0);
        System.out.println("Ukupna suma za isplatu  u $ je: "+ (int)(ukupnaVracenaSuma*100)/100.0);
        
    }

}
