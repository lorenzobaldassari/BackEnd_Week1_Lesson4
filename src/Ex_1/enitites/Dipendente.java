package Ex_1.enitites;

import java.util.Random;

public class Dipendente {
    private static double  stipendioBase=1000;
    private int matricola;
    private double stipendio;
    private double importoOrarioStraordinario;
    private Livello livello;
    private Dipartimento dipartimento;





    //costruttori

    public Dipendente() {
        this.stipendio = stipendioBase;
        this.importoOrarioStraordinario = 30;
        this.livello = Livello.OPERAIO;
    }

    public Dipendente(double importoOrarioStraordinario, Livello livello, Dipartimento dipartimento) {
        Random rand= new Random();
        int random= rand.nextInt(1000,9999);
        this.matricola = random ;
        this.stipendio = stipendioBase;
        this.importoOrarioStraordinario = importoOrarioStraordinario;
        this.livello = livello;
        this.dipartimento = dipartimento;
    }

    //metodi


    public Livello promozione(){
//        if (this.livello==Livello.OPERAIO)
        switch (this.livello) {
            case OPERAIO:{
                setLivello(Livello.IMPIEGATO);
                this.stipendio=stipendioBase*1.2;
                System.err.println(this.matricola+ " sei stato promosso a IMPIEGATO");
                break;
            }
            case IMPIEGATO:{
                setLivello(Livello.QUADRO);
                this.stipendio=stipendioBase*1.5;
                System.err.println(this.matricola+" sei stato promosso a QUADRO");
                break;
            }
            case QUADRO:{
                setLivello(Livello.DIRIGENTE);
                this.stipendio=stipendioBase*2;
                System.err.println(this.matricola+" sei stato promosso a DIRIGENTE");
                break;
            }
            case DIRIGENTE:{
                System.out.println("Ezechiele 25,17. Il cammino dell'uomo timorato è minacciato da ogni parte dalle iniquità degli esseri egoisti e dalla tirannia degli uomini malvagi. Benedetto sia colui che nel nome della carità e della buona volontà conduce i deboli attraverso la valle delle tenebre; perché egli è in verità il pastore di suo fratello e il ricercatore dei figli smarriti. E la mia giustizia calerà sopra di loro con grandissima vendetta e furiosissimo sdegno su coloro che si proveranno ad ammorbare e infine a distruggere i miei fratelli. E tu saprai che il mio nome è quello del Signore quando farò calare la mia vendetta sopra di te");
                break;
            }
            default:{
                System.err.println("errore la tua posizione non esiste nella nostra azienda");
                break;
            }

        }
        return this.livello;
    }

    public static double getStipendioBase() {
        return stipendioBase;
    }

    public int getMatricola() {
        return matricola;
    }

    public double getStipendio() {
        return stipendio;
    }

    public double getImportoOrarioStraordinario() {
        return importoOrarioStraordinario;
    }

    public Livello getLivello() {
        return livello;
    }

    public void setImportoOrarioStraordinario(double importoOrarioStraordinario) {
        this.importoOrarioStraordinario = importoOrarioStraordinario;
    }

    public Dipartimento getDipartimento() {
        return dipartimento;
    }

    public void setLivello(Livello livello) {
        this.livello = livello;
    }

    public void setDipartimento(Dipartimento dipartimento) {
        this.dipartimento = dipartimento;
    }




    @Override
    public String toString() {
        return "Dipendente{" +
                "matricola=" + matricola +
                ", stipendio=" + stipendio +
                ", importoOrarioStraordinario=" + importoOrarioStraordinario +
                ", livello=" + livello +
                ", dipartimento=" + dipartimento +
                '}';
    }
}
