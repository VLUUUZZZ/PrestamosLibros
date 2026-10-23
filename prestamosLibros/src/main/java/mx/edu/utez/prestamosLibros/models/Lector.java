package mx.edu.utez.prestamosLibros.models;
import jakarta.persistence.*;
@Entity
public class Lector {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nombre;
    private boolean activo = true;
    private boolean membresiaPremium;

    public Lector(){}

    public long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isMembresiaPremium() {
        return membresiaPremium;
    }

    public void setMembresiaPremium(boolean membresiaPremium){
        this.membresiaPremium = membresiaPremium;
    }
}
