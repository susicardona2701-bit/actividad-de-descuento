import java.util.Scanner;

public class Descuento {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el valor de la compra:");
        double compra = teclado.nextDouble();

        double descuento;

        if (compra >= 500000) {
            descuento = 20;
        } else if (compra >= 300000) {
            descuento = 15;
        } else if (compra >= 100000) {
            descuento = 10;
        } else {
            descuento = 0;
        }

        double valorDescuento = compra * descuento / 100;
        double total = compra - valorDescuento;

        System.out.println("Descuento:" + descuento + "%");
        System.out.println("Valor desconectado: $ " + valorDescuento);
        System.out.println("Total a pagar: $" + total);
    }
}