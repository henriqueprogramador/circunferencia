
package circunferencia;

import java.util.Scanner;


public class Circunferencia {

    
    public static void main(String[] args) {
          Scanner input = new Scanner(System.in);
    
int Raio;
double Circ;
double area;
double pi = 3.14;

System.out.println("Digite o valor do Raio: ");
Raio = input.nextInt();

Circ = 2*pi*Raio;
System.out.printf("Comprimento da Circunferência:%.2f ", Circ);

area = pi*Raio*Raio;
System.out.printf("Área da Circunferencia:%.2f ",area);


    }
    
}
