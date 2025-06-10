import java.util.Scanner;

//Desarrollar un Programa con un menú interactivo que permita calcular el área de 4
//figuras, el usuario selecciona la figura mediante opciones del 1 al 4, ingresará los valores (base, altura, radio, etc.). El programa mostrará el resultado del cálculo.
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean a = true;
        while (a) {
            System.out.println("Bienvenido al sistema ");
            System.out.println("Ingrese el numero deseado:\n1.Calcular el area del cuadrado \n2. Calcular el area del triangulo \n3.Calcular el area del Rectangulo \n4.Calcular el area del circulo \n5.salir ");
            int opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("ingrese base: ");
                    int base = sc.nextInt();
                    System.out.println("Ingrese la altura: ");
                    int altura= sc.nextInt();
                    System.out.println("El area del cuadrado es: " + base*altura);
                    System.out.println("*********************************");
                    break;
                case 2:
                    System.out.println("ingrese base: ");
                    int base2 = sc.nextInt();
                    System.out.println("ingrese la altura: ");
                    int altura2= sc.nextInt();
                    System.out.println("el area del triangulo es: " + base2 * altura2 /2);
                    System.out.println("**********************************");
                    break;
                case 3:
                    System.out.println("ingrese base: ");
                    int base3 = sc.nextInt();
                    System.out.println("ingrese la altura: ");
                    int altura3= sc.nextInt();
                    System.out.println("el area del rectangulo es: " + base3*altura3);
                    System.out.println("**********************************");
                    break;
                case 4:
                    System.out.println("ingrese el radio: ");
                    int radio = sc.nextInt();
                    System.out.println("el area del circulo es: " + 3.1416 * radio * radio );
                    System.out.println("**********************************");
                    break;
                case 5:
                    System.out.println("Hasta luego, vuelva pronto, besitos ");
                    a = false;
            }
        }
    }
}