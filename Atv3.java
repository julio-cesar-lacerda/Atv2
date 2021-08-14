import java.util.Scanner;

public class Atv3{
    public static void main(String[] args) {

        int numero,numer = 0,j,i,aux;
        int[] olho = new int[100];
        int[] olh = new int[100];
        boolean jogo = true;
        int[] soma = new int[1];
        while(jogo == true){
            System.out.println("infome  um numero:");
            Scanner leia = new Scanner(System.in);
            numero = leia.nextInt();
            if(numero == -1){
                jogo = false;
            }else{
                olho[numer] = numero;
                soma[1] = soma[1]
                 + olho[numer]
                numer = numer + 1;
            }
        }

        for( i=0; i<numer ; i++ ){
            for( j=i+1; j<numer ; j++ ){
                 if( olho[i] > olho[j] ){
                     aux = olho[i];
                     olho[i] = olho[j];
                     olho[j] = aux;
                 }
            }
        }


        System.out.println("o maior número digitado: "+olho[numer - 1]);
        System.out.println("o maior número digitado: "+olho[0]);
        for(i=0;i<=numer;i++){
            olh[i] = olho[i];  
        }
        
        System.out.println("a soma de todos os números"+olho[0]);
    }
}