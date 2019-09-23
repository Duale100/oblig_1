package oblig1;

import static javax.swing.JOptionPane.*;

class Vare {
    public String navn;
    public int antall;
    public double pris;

    // Konstruktør
    public Vare (String navn, int antall, double pris) {
        this.navn = navn;
        if (antall > 0) {
            this.antall = antall;
        }
        if (pris > 0) {
            this.pris = pris;
        }
    }

    //  GET/SET for navn
    public String getNavn() {
        return navn;
    }
    public void setNavn(String navn) {
        this.navn = navn;
    }
    // GET/SET for antall
    public int getAntall() {
        return antall;
    }
    public void setAntall(int antall) {
        if (antall > 0) {
            this.antall = antall;
        }
    }
    // GET/SET for pris
    public double getPris() {
        return pris;
    }
    public void setPris(double pris) {
        if (pris > 0) {
            this.pris = pris;
        }
    }
    // totalpris beregnings metode
    public double totalPris () {
        double totalPris = pris * antall;
        return totalPris;
    }
}

public class obligOppgave2 {
    public static void main(String [] args) {
        // Vare 1

    }
}
