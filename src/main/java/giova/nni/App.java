package giova.nni;

import java.util.Random;
import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
    
    int caseObjectif = 20;
    int caseCourant = 0;
    int nbLancers = 5;
    Random generateur = new Random();

    Scanner clavier = new Scanner(System.in);

    System.out.println("Bienvenue ! Commencons");
    
    for (int i = 1; i <= nbLancers; i++) {
        int lancer = generateur.nextInt(6) + 1;
        caseCourant = caseCourant + lancer;
        System.out.println("Lancer dés : vous avez fait " +caseCourant);

    }
    if (caseCourant == caseObjectif) {
        System.out.println("Vous avez gagné !");
        } else if (caseCourant > caseObjectif) {
        System.out.print("Vous dépassez, vous avez perdu !");
        } else {
        System.out.println("Il vous en manque pour arriver à " + caseObjectif + " !");
    }

    clavier.close();
        
}

}
