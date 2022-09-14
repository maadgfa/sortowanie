import java.util.Scanner;

public class Sortowanie {

    public int[] tablica = new int[10];

    public void wypelnijZklawiatury() {
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Wprowadz elementy tablicy");
        for (int i = 0; i < tablica.length; i++) {
            System.out.println("Element" + i + ":");
            tablica[i] = klawiatura.nextInt();
        }
    }

    public void wypiszTablice() {
        System.out.println("Tablica:");
        for (int element : tablica) {
            System.out.println(element + " ");
        }
    }

    private int szukajMaks(int k) {
        int szukanyIndeks = k;
        int maskymalnawartosc = tablica[k];
        for (int i = k + 1; i < tablica.length; i++) {
            if (maskymalnawartosc < tablica[i]) {
                maskymalnawartosc = tablica[i];
                szukanyIndeks = i;
            }
        }
        return szukanyIndeks;
    }

    public void sortuj() {
        for (int i = 0; i < tablica.length - 1; i++) {
            int indeks = szukajMaks(i);
            //zamieniam wartosc i z wartoscia pod indeksem
            int pomoc = tablica[i];
            tablica[i] = tablica[indeks];
            tablica[indeks] = pomoc;
        }
    }
}
