import java.util.Scanner;
class ParImpar {
    public static void main (String args[]){
        Scanner ler = new Scanner (System.in);
        System.out.println("Insira um número inteiro: ");
        int n1 = ler.nextInt();
        if (n1 % 2 == 0) {
            System.out.println("Par.");
        }
        else{
            System.out.println("Impar.");
        }
        ler.close();
    }
}