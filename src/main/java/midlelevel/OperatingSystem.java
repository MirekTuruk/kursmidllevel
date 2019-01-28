package midlelevel;

import java.util.Scanner;

class OperatingSystem
{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        char[] alphabet="abcdefghijklmnoprstuwxyz".toCharArray();
        System.out.println("Podaj zdanie do zaszyfrowania.");
        String input=in.nextLine();
        System.out.println("Podaj wartość przesunięcia.");
        int przesunięcie=in.nextInt();
        for (int i=0; i<input.length(); i++){
            for (int l=0; l<alphabet.length; l++){
                if (input.charAt(l)==alphabet[23]){ //Ten if wcześniej był niżej, jednakże przeniosłem go dla testu.
                    alphabet[l]/=alphabet.length;
                }

                if (input.charAt(i)==alphabet[l]){
                    System.out.print(alphabet[l+przesunięcie]);

                }

            }

        }

    }

}
