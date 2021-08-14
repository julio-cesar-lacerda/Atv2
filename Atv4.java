import java.util.Scanner;

public class Atv4{
    public static void main(String[] args) {

        int numero,numer,j,i,aux;

        System.out.println("infomer um numero:");
        Scanner leia = new Scanner(System.in);

        numero = leia.nextInt();
        int[] olho = new int[numero];

        for(i = 0;i < numero;i++){
            System.out.println("infomer um numero:");
            numer = leia.nextInt();
            olho[i] = numer;
        }

        for( i=0; i<numero ; i++ ){
            for( j=i+1; j<numero ; j++ ){
                 if( olho[i] > olho[j] ){
                     aux = olho[i];
                     olho[i] = olho[j];
                     olho[j] = aux;
                 }
            }
        }

        System.out.println("Ordenado com sucesso!");
        for(i=0;i<=numero;i++){
            System.out.println(" "+olho[i]);
        }     
    }
}