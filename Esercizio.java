//LEGGERE LE ISTRUZIONI NEL FILE README.md

//Import di Classi Java necessarie al funzionamento del programma
import java.util.Scanner;

// Classe principale, con metodo main
class Esercizio {
    // Il programma parte con una chiamata a main().
    public static void main(String args[])
    {
       private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int n, i, c, posizione, posizione2, n1;
        String libroNuovo;

        n = 5;
        n1 = 5;
        String[] b = new String[n];
        String[] p = new String[n1];

        b[0] = "In cucina con ciccio";
        b[1] = "Anna Frank";
        b[2] = "I cant breath. Tratto da una storia vera";
        b[3] = "Come diventare forti su fortnite - ciccio";
        b[4] = "Come vendere le auto -F.ll Manna";
        for (i = 0; i <= n1 - 1; i++) {
            p[i] = "";
        }
        do {
            c = input.nextInt();
            leggiOperazione(c);
            if (c == 1) {
                System.out.println("Ins nome libro");
                libroNuovo = input.nextLine();
                n = nuovoLibro(b, n, libroNuovo);
            }
            if (c == 2) {
                System.out.println("Ins pos");
                do {
                    posizione2 = input.nextInt();
                    if (posizione2 > 0 && posizione2 < n) {
                    } else {
                        System.out.println("Libro non trovato");
                    }
                } while (posizione2 < 0 && posizione2 > n);
                n = aggiungi(b, n, posizione2);
                n1 = elimina(p, n1, posizione2);
            }
            if (c == 3) {
                System.out.println("Inserisci la posizione del libro che vuoi prendere in prestito");
                do {
                    posizione = input.nextInt();
                    if (posizione > 0 && posizione < n) {
                    } else {
                        System.out.println("La posizione inserita non è presente nella libreria. Inserisci di nuovo la posizione");
                    }
                } while (posizione < 0 && posizione > n);
                n = elimina(n, b, posizione);
                n1 = aggiungi(n1, p, posizione);
            }
            if (c == 4) {
                visualizzaLibriPrestati(p, n);
            }
            if (c == 5) {
                visualizzaLibriInLibreria(b, n);
            }
        } while (c != 6);
        System.out.println("Sei uscito dalla libreria a domani !");
    }
    
    public static int aggiungi(String[] v, int n, int ie, int w) {
        int i, n2;

        n2 = n + 1;
        int[] w = new int[n2];

        i = 0;
        while (i <= ie - 1 && i < n) {
            w[i] = v[i];
            i = i + 1;
        }
        w[ie] = ie;
        i = ie + 1;
        while (i < n2) {
            w[i] = v[i - 1];
            i = i + 1;
        }
        i = 0;
        while (i < n2) {
            v[i] = w[i];
            i = i + 1;
        }
        
        return n2;
    }
    
    public static int elimina(String[] v, String[] w, int n, int ie) {
        int i, n2;

        n2 = n - 1;
        i = ie;
        while (i <= n - 2) {
            v[i] = v[i + 1];
            i = i + 1;
        }
        
        return n2;
    }
    
    public static void leggiOperazione(int c) {
        while (c != 1 && c != 2 && c != 3 && c != 4 && c != 5 && c != 6) {
            System.out.println("Inserisci " + (char) 10 + "1 aggiungi libro " + (char) 10 + "2 Restituisci libro " + (char) 10 + "3 Prendi in prestito " + (char) 10 + "4 Visualizza libri in prestito " + (char) 10 + "5 Visualizza libri in biblioteca " + (char) 10 + "6 Esci");
            if (c == 6) {
            } else {
                System.out.println("L'operazione inserita non esiste inserisci una tra quelle elencate");
            }
        }
    }
    
    public static int nuovoLibro(String[] b, int n, String libroNuovo) {
        int n2;

        n2 = n + 1;
        b[n2] = libroNuovo;
        
        return n2;
    }
    
    public static void visualizzaLibriInLibreria(int n, String[] b) {
        int i;

        for (i = 0; i <= n; i++) {
            System.out.println(Integer.toString(i + 1) + " libro in libreria: " + b[i]);
        }
    }
    
    public static void visualizzaLibriPrestati(String[] p, int n) {
        int i;

        for (i = 0; i <= n; i++) {
            System.out.println(Integer.toString(i + 1) + " libro in prestito: " + p[i]);
        }
    }
}
    }
}

//LEGGERE LE ISTRUZIONI NEL FILE README.md