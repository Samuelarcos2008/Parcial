package Heredar;

import java.time.LocalDate;

public class Main {

public static void main(String[] args) {
// Carga de datos de forma directa (sin teclado)
Operario op1 = new Operario("Carlos Pérez", 30, 1800000,
LocalDate.of(2022, 3, 15),
"Calle 10 # 5-20, Cali", "carlos.perez@correo.com", "Diurno");

Operario op2 = new Operario("María Gómez", 27, 1950000,
LocalDate.of(2023, 7, 1),
"Carrera 25 # 12-45, Cali", "maria.gomez@correo.com", "Nocturno");

System.out.println("===== Operario 1 =====");
op1.visualizar();

System.out.println("===== Operario 2 =====");
op2.visualizar();
}
}