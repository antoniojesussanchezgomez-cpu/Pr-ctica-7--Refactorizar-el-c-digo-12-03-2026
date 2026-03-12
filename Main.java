
package TareaClaseDAMLopedeVega;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class Main {
    static BufferedReader dato = new BufferedReader(new InputStreamReader(System.in));

    private Main() {
        // Private constructor para evitar instanciación (PMD UseUtilityClass)
    }

    public static void main(String[] args) {
        operativaCuenta(0.0f);
    }

    public static void operativaCuenta(float cantidad) {
        CCuenta cuenta1;
        double saldoActual;
        int opcion = 0;
        cuenta1 = new CCuenta("Juan López", "1000-2365-85-123456789", 2500, 0);
        do {
            try {
                System.out.println("MENÚ DE OPERACIONES");
                System.out.println("-------------------");
                System.out.println("1 - Ingresar");
                System.out.println("2 - Retirar");
                System.out.println("3 - Finalizar");
                opcion = Integer.parseInt(dato.readLine());
                if (opcion == 1) {
                    System.out.println("¿Cuánto desea ingresar?: ");
                    cantidad = Integer.parseInt(dato.readLine());
                    try {
                        System.out.println("Ingreso en cuenta");
                        cuenta1.ingresar(cantidad);
                    } catch (Exception e) {
                        System.out.print("Fallo al ingresar");
                    }
                } else if (opcion == 2) {
                    System.out.println("¿Cuánto desea retirar?: ");
                    cantidad = Integer.parseInt(dato.readLine());
                    try {
                        cuenta1.retirar(cantidad);
                    } catch (Exception e) {
                        System.out.print("Fallo al retirar");
                    }
                } else if (opcion == 3) {
                    System.out.println("Finalizamos la ejecución");
                } else {
                    System.err.println("Opción errónea");
                }
            } catch (IOException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        } while (opcion != 3);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es" + saldoActual);
    }
}
