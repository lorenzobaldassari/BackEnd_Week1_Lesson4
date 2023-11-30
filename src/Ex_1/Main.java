package Ex_1;

import Ex_1.enitites.Dipartimento;
import Ex_1.enitites.Dipendente;
import Ex_1.enitites.Livello;

public class Main {
    public static void main(String[] args) {
        Dipendente alfio = new Dipendente();
//        Dipendente franco = new Dipendente();
        stampaDipendente(alfio);
        alfio.promozione();
        stampaDipendente(alfio);
//        stampaDipendente(franco);
        calcolaPaga2(alfio,40);

    }




    //metodi

      public static void stampaDipendente(Dipendente dip){
        System.out.println(dip);
         }
      public static void calcolaPaga(Dipendente dip){
        System.out.println(dip.getStipendio());
      }
      public static void calcolaPaga2(Dipendente dip,int ore){
        double baseSalary= dip.getStipendio();
        double hourPayment= dip.getImportoOrarioStraordinario();
        double monthSalary=baseSalary+(ore*hourPayment);
        System.out.println("la tua paga di questo mese sara' "+monthSalary);
    }

}