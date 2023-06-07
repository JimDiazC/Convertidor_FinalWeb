import java.util.Scanner;

public class Convertidor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número en base 8: ");
        int numeroOctal = scanner.nextInt();

        if (!validarOctal(numeroOctal)) {
            System.out.println("El numero debe ser positivo 0 - 7");
        } else {
            String numeroBinario = conversorOctal(numeroOctal);
            System.out.println("El núermo convertido a binario es: " + numeroBinario);
        }
    }

    public static boolean validarOctal(int numero) {
        while (numero != 0) {
            int number = numero % 10;
            if (number < 0 || number > 7) {
                return false;
            }
            numero /= 10;
        }
        return true;
    }

    public static String conversorOctal(int numeroOctal) {
        StringBuilder resultado = new StringBuilder();

        if (numeroOctal == 0) {
            return "0";
        }

        while (numeroOctal != 0) {
            int digito = numeroOctal % 10;
            String binario = convertirDigitoABinario(digito);
            resultado.insert(0, binario);
            numeroOctal /= 10;
        }

        return resultado.toString();
    }

    public static String convertirDigitoABinario(int digito) {
        String[] tabla = {"000", "001", "010", "011", "100", "101", "110", "111"};
        return tabla[digito];
    }

}