package com.example.mismascotas;

public class Mascota {
    private String nombre;
    private int imagen;
    private String calificacion;

    public Mascota(String nombre, int imagen, String calificacion) {
        this.nombre = nombre;
        this.imagen = imagen;
        this.calificacion = calificacion;
    }

    @Override
    public String toString() {
        return "Mascota{" +
                "nombre='" + nombre + '\'' +
                ", imagen=" + imagen +
                ", calificacion=" + calificacion +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public String getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(String calificacion) {
        this.calificacion = calificacion;
    }
}
