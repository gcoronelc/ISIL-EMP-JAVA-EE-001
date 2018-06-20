package interescompuesto;

public class Deitel_5_14 {

// Abre clase Deitel_5_14
    private double monto;
    private double principal = 1000;

    public void Interes() {      //Abre método Interes

        for (double tasa = 0.05; tasa <= 0.1; tasa += 0.01) {  // Abre primer for 

            System.out.printf("\n%s%20s", "Anio", "Monto en deposito");
            System.out.printf(" para una tasa igual a: %.2f\n", tasa);

            for (int anio = 1; anio <= 10; anio++) {  // Abre for
                monto = principal * Math.pow(1.0 + tasa, anio);
                System.out.printf("%4d%,20.2f\n", anio, monto);
            }  // Cierra for

            System.out.println("\n");
        }   // Cierra primer for 

    }      // Cierra método Interes
}
