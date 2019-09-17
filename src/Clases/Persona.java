package Clases;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Persona {

    private static String nombre;
    private static String apellido;
    private static String fecha_nacimienta;
    private static String identidad;
    private static String genero;
    private static String direccion;
    private static String email;
    private static String telefono;
    private static String celular;

    public Persona() {

    }

    public Persona(String nombre, String apellido, String fecha_nacimienta, String identidad, String genero, String direccion, String email, String telefono, String celular) {
        Persona.nombre = nombre;
        Persona.apellido = apellido;
        Persona.fecha_nacimienta = fecha_nacimienta;
        Persona.identidad = identidad;
        Persona.genero = genero;
        Persona.direccion = direccion;
        Persona.email = email;
        Persona.telefono = telefono;
        Persona.celular = celular;
    }

    public static String getNombre() {
        return nombre;
    }

    public static void setNombre(String nombre) {
        Persona.nombre = nombre;
    }

    public static String getApellido() {
        return apellido;
    }

    public static void setApellido(String apellido) {
        Persona.apellido = apellido;
    }

    public static String getFecha_nacimienta() {
        return fecha_nacimienta;
    }

    public static void setFecha_nacimienta(String fecha_nacimienta) {
        Persona.fecha_nacimienta = fecha_nacimienta;
    }

    public static String getIdentidad() {
        return identidad;
    }

    public static void setIdentidad(String identidad) {
        Persona.identidad = identidad;
    }

    public static String getGenero() {
        return genero;
    }

    public static void setGenero(String genero) {
        Persona.genero = genero;
    }

    public static String getDireccion() {
        return direccion;
    }

    public static void setDireccion(String direccion) {
        Persona.direccion = direccion;
    }

    public static String getEmail() {
        return email;
    }

    public static void setEmail(String email) {
        Persona.email = email;
        Validacion.email = email;
    }

    public static String getTelefono() {
        return telefono;
    }

    public static void setTelefono(String telefono) {
        Persona.telefono = telefono;
    }

    public static String getCelular() {
        return celular;
    }

    public static void setCelular(String celular) {
        Persona.celular = celular;
    }

    public static int getedad() {

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate fechaNacimiento = LocalDate.parse(Persona.fecha_nacimienta, fmt);
        LocalDate hoy = LocalDate.now();

        Period periodo = Period.between(fechaNacimiento, hoy);

        return periodo.getYears();

    }

    public static String getFullNombre() {

        return Persona.nombre.toUpperCase() + " " + Persona.apellido.toUpperCase();

    }
}
