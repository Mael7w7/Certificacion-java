package org.example.modelo;

import java.time.LocalDateTime;
import java.util.List;

public class Tarea {
    private  static long contadorIds = 1;
    private Long id;
    private String titulo;
    private  String descripcion;
    private Prioridad prioridad;
    private Estado estado;
    private List<String> etiquetas;
    private LocalDateTime fechaCreacion;
    private LocalDateTime fechaLimite;

    public Tarea() {
        this.id = contadorIds++;
        this.fechaCreacion = LocalDateTime.now();
    }

    public static long getContadorIds() {
        return contadorIds;
    }

    public static void setContadorIds(long contadorIds) {
        Tarea.contadorIds = contadorIds;
    }

    public LocalDateTime getFechaLimite() {
        return fechaLimite;
    }

    public void setFechaLimite(LocalDateTime fechaLimite) {
        this.fechaLimite = fechaLimite;
    }

    public LocalDateTime getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDateTime fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public List<String> getEtiquetas() {
        return etiquetas;
    }

    public void setEtiquetas(List<String> etiquetas) {
        this.etiquetas = etiquetas;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Prioridad getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(Prioridad prioridad) {
        this.prioridad = prioridad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Tarea{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", prioridad=" + prioridad +
                ", estado=" + estado +
                ", etiquetas=" + etiquetas +
                ", fechaCreacion=" + fechaCreacion +
                ", fechaLimite=" + fechaLimite +
                '}';
    }
}
