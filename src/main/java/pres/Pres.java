package pres;

import dao.DaoImpl;
import metier.MetierImpl;

public class Pres {
    public static void main(String[] args) {
        DaoImpl d = new DaoImpl();
        MetierImpl metier = new MetierImpl(d);
        //metier.setDao(dao);
        System.out.println("Resultat = " + metier.calcul());
    }
}
