package Ex_2;

import Ex_1.enitites.Dipartimento;
import Ex_1.enitites.Dipendente;
import Ex_1.enitites.Livello;

public class Main {
    public static void main(String[] args) {
        Dipendente mario= new Dipendente(11, Livello.IMPIEGATO, Dipartimento.AMMINISTRAZIONE);
        Dipendente luigi= new Dipendente(20, Livello.DIRIGENTE, Dipartimento.VENIDTE);
        Dipendente toad= new Dipendente(9, Livello.OPERAIO, Dipartimento.PRODUZIONE);
        Dipendente bowser= new Dipendente(9, Livello.OPERAIO, Dipartimento.PRODUZIONE);

        Ex_1.Main.stampaDipendente(luigi);
        Ex_1.Main.stampaDipendente(bowser);
        Ex_1.Main.stampaDipendente(mario);
        bowser.promozione();
        luigi.promozione();
        mario.promozione();
        Ex_1.Main.stampaDipendente(luigi);
        Ex_1.Main.stampaDipendente(bowser);
        Ex_1.Main.stampaDipendente(mario);
        sommaStipendi(mario,luigi,toad,bowser);
    }

    public  static void sommaStipendi(Dipendente d1,Dipendente d2,Dipendente d3,Dipendente d4){
        double somma =   (d1.getStipendio()+(d1.getImportoOrarioStraordinario()*5))
                        +(d2.getStipendio()+(d2.getImportoOrarioStraordinario()*5))
                        +(d3.getStipendio()+(d3.getImportoOrarioStraordinario()*5))
                        +(d4.getStipendio()+(d4.getImportoOrarioStraordinario()*5));
        System.out.println("la somma degli stipendi compresi di straordinari e' "+somma+"$");

    }

}
