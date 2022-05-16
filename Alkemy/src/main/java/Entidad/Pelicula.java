
package Entidad;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Pelicula implements Serializable {
      
    private Imagen imagen;
    @Id
    private String titulo;
    @Temporal(TemporalType.DATE)
    private Date creacion;
    private Integer calificacion;
    private Personaje personajes;

    public Pelicula() {
    }

    public Pelicula(Imagen imagen, String titulo, Date creacion, Integer calificacion, Personaje personajes) {
        this.imagen = imagen;
        this.titulo = titulo;
        this.creacion = creacion;
        this.calificacion = calificacion;
        this.personajes = personajes;
    }

    public Imagen getImagen() {
        return imagen;
    }

    public void setImagen(Imagen imagen) {
        this.imagen = imagen;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Date getCreacion() {
        return creacion;
    }

    public void setCreacion(Date creacion) {
        this.creacion = creacion;
    }

    public Integer getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(Integer calificacion) {
        this.calificacion = calificacion;
    }

    public Personaje getPersonajes() {
        return personajes;
    }

    public void setPersonajes(Personaje personajes) {
        this.personajes = personajes;
    }
    
    
}
