package midlelevel;

public class Silnia {

    public static long silnia(long n) {
        long wynik = 1;
        for (int i = 2; i <= n; i++ ) {
            wynik = wynik * i;
        }
            return wynik;
        }




    public static void main(String[] args) {
        System.out.println(silnia(4));
    }

}


