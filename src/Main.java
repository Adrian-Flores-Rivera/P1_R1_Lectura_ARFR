import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lec = new Scanner(System.in);

        int dato1,dato2;
        System.out.println("Captura Operacion: ");
        String operacion = lec.next();

        switch (operacion) {
            case "SUMA" -> {
                System.out.println("Operando 1: ");
                dato1 = lec.nextInt();
                System.out.println("Operando 2: ");
                dato2 = lec.nextInt();
                System.out.println(dato1 + " + " + dato2 + " = " + (dato1 + dato2));
            }
            case "RESTA" -> {
                System.out.println("Operando 1: ");
                dato1 = lec.nextInt();
                System.out.println("Operando 2: ");
                dato2 = lec.nextInt();
                System.out.println(dato1 + " - " + dato2 + " = " + (dato1 - dato2));
            }
            case "MULTIPLICACION" -> {
                System.out.println("Operando 1: ");
                dato1 = lec.nextInt();
                System.out.println("Operando 2: ");
                dato2 = lec.nextInt();
                System.out.println(dato1 + " * " + dato2 + " = " + (dato1 * dato2));
            }
            case "DIVISION" -> {
                System.out.println("Operando 1: ");
                dato1 = lec.nextInt();
                System.out.println("Operando 2: ");
                dato2 = lec.nextInt();
                System.out.println(dato1 + " / " + dato2 + " = " + (dato1 / dato2));
            }
            default -> System.out.println("Operación no soportada");
        }
    }
}