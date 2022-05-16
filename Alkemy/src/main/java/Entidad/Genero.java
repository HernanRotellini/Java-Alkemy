
package Entidad;

import java.io.Serializable;
import javax.persistence.Entity;

@Entity
public class Genero implements Serializable {
    
    private String nombre;
    private Imagen imagen;
    private Pelicula peliculas;

    public Genero() {
    }

    public Genero(String nombre, Imagen imagen, Pelicula peliculas) {
        this.nombre = nombre;
        this.imagen = imagen;
        this.peliculas = peliculas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Imagen getImagen() {
        return imagen;
    }

    public void setImagen(Imagen imagen) {
        this.imagen = imagen;
    }

    public Pelicula getPeliculas() {
        return peliculas;
    }

    public void setPeliculas(Pelicula peliculas) {
        this.peliculas = peliculas;
    }
    
    
}
