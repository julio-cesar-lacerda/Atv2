import java.util.Scanner;

public class Atv2{
    public static void main(String[] args) {
        int n1,n2,n3;
        Scanner leia = new Scanner(System.in);
        System.out.println("informe três numero: ");
        n1 = leia.nextInt();
        n2 = leia.nextInt();
        n3 = leia.nextInt();

        if(n1 == n2 && n2 == n3){
            System.out.println("Triangulo equilatero");
        }else if(n1 == n2 && n2!= n3 || n1 == n3 && n3!= n2|| n2 == n3 && n1!= n3){
            System.out.println("Triangulo isosceles");
        }else{
            System.out.println("Triangulo escaleno");
        }
    }
}