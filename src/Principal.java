import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        ConsultaMoneda consulta = new ConsultaMoneda();
        Monedas monedas = consulta.convertirMoneda();

        String busqueda = "";

        while (!busqueda.equals("7")) {
            System.out.println("************************************************");
            System.out.println("");
            System.out.println("Sea bienvenido/a al conversor de moneda.");
            System.out.println("");
            System.out.println("1) Dólar => Peso argentino");
            System.out.println("2) Peso argentino => Dólar");
            System.out.println("3) Dólar => Real brasileño");
            System.out.println("4) Real brasileño => Dólar");
            System.out.println("5) Dólar => Peso colombiano");
            System.out.println("6) Peso colombiano => Dólar");
            System.out.println("7) Salir");
            System.out.println("");
            System.out.print("Elija una opción válida: ");
            busqueda = lectura.nextLine();

            switch (busqueda) {
                case "1" -> {
                    System.out.print("Ingrese el monto en dolares: ");
                    double monto = Double.parseDouble(lectura.nextLine());
                    double convertido = monto * monedas.ARS();
                    System.out.println("Resultado: " + convertido + " Pesos argentinos");
                    System.out.println("");
                }
                case "2" -> {
                    System.out.print("Ingrese el monto en ARS: ");
                    double monto = Double.parseDouble(lectura.nextLine());
                    double convertido = monto / monedas.ARS();
                    System.out.println("Resultado: " + convertido + " Dolares");
                    System.out.println("");
                }
                case "3" -> {
                    System.out.print("Ingrese el monto en dolares: ");
                    double monto = Double.parseDouble(lectura.nextLine());
                    double convertido = monto * monedas.BRL();
                    System.out.println("Resultado: " + convertido + " Reales brasileños");
                    System.out.println("");
                }
                case "4" -> {
                    System.out.print("Ingrese el monto en reales brasileños: ");
                    double monto = Double.parseDouble(lectura.nextLine());
                    double convertido = monto / monedas.BRL();
                    System.out.println("Resultado: " + convertido + " Dolares");
                    System.out.println("");
                }
                case "5" -> {
                    System.out.print("Ingrese el monto en dolares: ");
                    double monto = Double.parseDouble(lectura.nextLine());
                    double convertido = monto * monedas.COP();
                    System.out.println("Resultado: " + convertido + " Pesos colombianos");
                    System.out.println("");
                }
                case "6" -> {
                    System.out.print("Ingrese el monto en pesos colombianos: ");
                    double monto = Double.parseDouble(lectura.nextLine());
                    double convertido = monto / monedas.COP();
                    System.out.println("Resultado: " + convertido + " Dolares");
                    System.out.println("");
                }
                case "7" -> System.out.println("Gracias por usar el conversor. ¡Hasta pronto!");
                default -> System.out.println("Opción inválida. Intente nuevamente.");
            }
        }
        lectura.close();
    }
}

