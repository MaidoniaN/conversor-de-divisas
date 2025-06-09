import java.util.Map;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        ConsultaDivisa consulta = new ConsultaDivisa();
        Divisas divisa = consulta.buscaDivisa();

        int opcion = 0;
        double monto = 0.0;
        double resultado=0.0;

        Scanner teclado = new Scanner(System.in);
        while (opcion !=7){
            System.out.println("********************************");
            System.out.println("Sea Bienvenido al conversor de divisas\n");
            System.out.println("1) Dólar =>> Peso Argentino");
            System.out.println("2) Peso Argentido =>> Dólar");
            System.out.println("3) Dólar =>> Real Brasileño");
            System.out.println("4) Real Brasileño =>> Dólar");
            System.out.println("5) Dolar =>> Peso Colombiano");
            System.out.println("6) Peso Colombiano =>> Dolar");
            System.out.println("7) Salir");
            System.out.println("Elija una opción válida: ");
            System.out.println("********************************");
            opcion = Integer.valueOf(teclado.next());

            switch(opcion) {
                case 1:
                    System.out.println("Conviertiendo de Dolar a Peso Argentino");
                    System.out.println("Ingrese el valor que desea convertir: ");
                    monto = Double.valueOf(teclado.next());
                    for (Map.Entry<String, Double> entry : divisa.conversionRates().entrySet()){
                        if (entry.getKey().equals("ARS")){
                            resultado=entry.getValue()*monto;
                            System.out.printf("El valor %.1f [USD] corresponde al valor final de ==> %.2f  [ARS]\n", monto, resultado);
                        }
                    }
                    break;
                case 2:
                    System.out.println("Conviertiendo de Peso Argentino a Dólar");
                    System.out.println("Ingrese el valor que desea convertir: ");
                    monto = Double.valueOf(teclado.next());
                    for (Map.Entry<String, Double> entry : divisa.conversionRates().entrySet()){
                        if (entry.getKey().equals("ARS")){
                            resultado=monto / entry.getValue();
                            System.out.printf("El valor %.1f [ARS] corresponde al valor final de ==> %.2f [USD]\n", monto, resultado);
                        }
                    }
                    break;

                case 3:
                    System.out.println("Conviertiendo de Dolar a Real Brasileño");
                    System.out.println("Ingrese el valor que desea convertir: ");
                    monto = Double.valueOf(teclado.next());
                    for (Map.Entry<String, Double> entry : divisa.conversionRates().entrySet()){
                        if (entry.getKey().equals("BRL")){
                            resultado=entry.getValue()*monto;
                            System.out.printf("El valor %.1f [USD] corresponde al valor final de ==> %.2f  [BRL]\n", monto, resultado);
                        }
                    }
                    break;

                case 4:
                    System.out.println("Conviertiendo de Real Brasileño a Dólar");
                    System.out.println("Ingrese el valor que desea convertir: ");
                    monto = Double.valueOf(teclado.next());
                    for (Map.Entry<String, Double> entry : divisa.conversionRates().entrySet()){
                        if (entry.getKey().equals("BRL")){
                            resultado=monto / entry.getValue();
                            System.out.printf("El valor %.1f [BRL] corresponde al valor final de ==> %.2f [USD]\n", monto, resultado);
                        }
                    }
                    break;

                case 5:
                    System.out.println("Conviertiendo de Dolar a Peso Colombiano");
                    System.out.println("Ingrese el valor que desea convertir: ");
                    monto = Double.valueOf(teclado.next());
                    for (Map.Entry<String, Double> entry : divisa.conversionRates().entrySet()){
                        if (entry.getKey().equals("COP")){
                            resultado=entry.getValue()*monto;
                            System.out.printf("El valor %.1f [USD] corresponde al valor final de ==> %.2f  [COP]\n", monto, resultado);
                        }
                    }
                    break;

                case 6:
                    System.out.println("Conviertiendo de Peso Colombiano a Dólar");
                    System.out.println("Ingrese el valor que desea convertir: ");
                    monto = Double.valueOf(teclado.next());
                    for (Map.Entry<String, Double> entry : divisa.conversionRates().entrySet()){
                        if (entry.getKey().equals("COP")){
                            resultado=monto / entry.getValue();
                            System.out.printf("El valor %.1f [COP] corresponde al valor final de ==> %.2f [USD]\n", monto, resultado);
                        }
                    }
                    break;

                case 7:
                    // Código para la opción 7
                    System.out.println("Seleccionaste la opción 7");
                    break;
                default:
                    // Código para cuando no coincide con ninguna opción
                    System.out.println("Opción no válida");
                    break;
            }

        }

    }
}
