package oblig1;

import java.text.DecimalFormat;

class sirkel {
    // Diameter metode
    public static double beregnDiameter (double radius) {
        double diameter = 2 * radius;
        return diameter;
    }
    // Omkrets metode
    public static double beregnOmkrets (double radius) {
        double omkrets = 2 * Math.PI * radius;
        return omkrets;
    }
    // Areal metode
    public static double beregnAreal (double radius) {
        double areal = Math.PI * Math.pow(radius, 2);
        return areal;
    }
}

public class obligOppgave1 {
    public static void main(String[] args) {
        sirkel nySirkel = new sirkel();
        double radius = 23.5;

        double diameter = nySirkel.beregnDiameter(radius);
        double omkrets = nySirkel.beregnOmkrets(radius);
        double areal = nySirkel.beregnAreal(radius);

        // Utskrift
        DecimalFormat df2 = new DecimalFormat(".##");
        System.out.println("Gitt radiusen: " + radius + ". Blir diameteren: " + df2.format(diameter));
        System.out.println("Gitt radiusen: " + radius + ". Blir omrkretsen: " + df2.format(omkrets));
        System.out.println("Gitt radiusen: " + radius + ". Blir arealet: " + df2.format(areal));
        
    }
}
