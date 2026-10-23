package mx.edu.utez.prestamosLibros.models;


import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Prestamo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne(optional = false)
    private Lector lector;

    @ManyToOne(optional = false)
    private Libro libro;

    private LocalDate fechaPrestamo;
    private LocalDate fechaDevolucionMaxima;

    @Enumerated(EnumType.STRING)
    private EstadoPrestamo estado;

    public Prestamo() {}

    public long getId() {
        return id;
    }

    public Lector getLector() {
       return lector ;
    }
    public void setLector(Lector lector) {
        this.lector = lector;
    }
    public Libro getLibro(){
        return libro;
    }

    public void setLibro(Libro libro){
        this.libro = libro;
    }

    public LocalDate getFechaPrestamo(){
        return fechaPrestamo;
    }

    public void setFechaPrestamo(LocalDate fecha) {
        this.fechaPrestamo = fecha;
    }
    

}


