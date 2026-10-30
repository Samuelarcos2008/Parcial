package Heredar;

import java.time.LocalDate;

public class Empresa {

    // Atributos privados (encapsulamiento)
    private String nombre;
    private int edad;
    private double sueldo;
    private LocalDate fechaContrato;

    public Empresa(String nombre, int edad, double sueldo, LocalDate fechaContrato) {
    setNombre(nombre);
    setEdad(edad);
    setSueldo(sueldo);
    setFechaContrato(fechaContrato);
    }

    public String getNombre() {
    return nombre;
    }

    public void setNombre(String nombre) {
    if (nombre == null || nombre.trim().isEmpty()) {
    throw new IllegalArgumentException("El nombre no puede estar vacío.");
}
 this.nombre = nombre.trim();
}

public int getEdad() {
return edad;
}

public void setEdad(int edad) {
if (edad < 18 || edad > 100) {
throw new IllegalArgumentException("La edad debe estar entre 18 y 100 años.");
}
this.edad = edad;
}

public double getSueldo() {
 return sueldo;
}

public void setSueldo(double sueldo) {
 if (sueldo < 0) {
throw new IllegalArgumentException("El sueldo no puede ser negativo.");
 }
 this.sueldo = sueldo;
 }

 public LocalDate getFechaContrato() {
 return fechaContrato;
}

 public void setFechaContrato(LocalDate fechaContrato) {
 if (fechaContrato == null || fechaContrato.isAfter(LocalDate.now())) {
throw new IllegalArgumentException("La fecha de contrato no es válida.");
    }
this.fechaContrato = fechaContrato;
}

public void visualizar() {
System.out.println("Nombre: " + nombre);
System.out.println("Edad: " + edad);
System.out.println("Sueldo: $" + String.format("%,.2f", sueldo));
System.out.println("Fecha de contrato: " + fechaContrato);
    }
}