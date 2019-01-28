package tasks2;

public class Task3 {
    public static void main(String[] args) {
        System.out.println(potega(3, 7));
    }

    double a;
    double b;

    {
        a = a;
        b = b;
    }

    private void potega(double a, double b) {
        potega(Math.pow(a, b));
    }

    private void potega(double pow) {
    }

    public static int potega(int p, int w) {
        if (w == 0)
            return 1;
        if (w < 0) {
            return 1/potega(p, -w);
        }
        return p * potega(p, --w);


            }

    }







