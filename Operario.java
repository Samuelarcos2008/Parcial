package Heredar;

import java.time.LocalDate;

public class Operario extends Empresa {

    private String direccion;
    private String correo;
    private String jornadaLaboral; // "Diurno" o "Nocturno"

    public Operario(String nombre, int edad, double sueldo, LocalDate fechaContrato,
     String direccion, String correo, String jornadaLaboral) {
        super(nombre, edad, sueldo, fechaContrato);
        setDireccion(direccion);
        setCorreo(correo);
        setJornadaLaboral(jornadaLaboral);
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        if (direccion == null || direccion.trim().isEmpty()) {
            throw new IllegalArgumentException("La dirección no puede estar vacía.");
        }
        this.direccion = direccion.trim();
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        if (correo == null || !correo.matches("^[\\w.+-]+@[\\w-]+(\\.[\\w-]+)+$")) {
            throw new IllegalArgumentException("El correo electrónico no es válido.");
        }
        this.correo = correo.trim();
    }

    public String getJornadaLaboral() {
        return jornadaLaboral;
    }

    public void setJornadaLaboral(String jornadaLaboral) {
        if (jornadaLaboral == null
                || !(jornadaLaboral.equalsIgnoreCase("Diurno") || jornadaLaboral.equalsIgnoreCase("Nocturno"))) {
            throw new IllegalArgumentException("La jornada debe ser Diurno o Nocturno.");
        }
        this.jornadaLaboral = jornadaLaboral;
    }

    @Override
    public void visualizar() {
        super.visualizar();
        System.out.println("Dirección: " + direccion);
        System.out.println("Correo: " + correo);
        System.out.println("Jornada laboral: " + jornadaLaboral);
    }
}