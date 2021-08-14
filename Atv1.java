public class Atv1{
    public static void main(String[] args){
        int i = 1;
        int l,resultado,c;
        for(i = 1;i <= 2500;i++){
            resultado = 0;
            l = i;
            if(l / 11 == 0){
                System.out.println("É dividido por 11 o numero "+l);
            }else if((l / 5 == 0)){
                System.out.println("É dividido por 5 o numero "+l);
            }
            if(l % 2 == 0){
                System.out.println("O numero "+l+" Par");
            }else{
                System.out.println("O numero "+l+" impares");
            }

            for(c = 2;c <= l / 2;c++){
                if(l % i == 0){
                    resultado++;
                    break;
                }
            }

            if (resultado == 0){
                System.out.println(""+l+" é um número primo");
            }
        }
    }
}