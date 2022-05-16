
package Servicio;

import Entidad.Imagen;
import Entidad.Pelicula;
import Entidad.Personaje;
import Repositorio.PersonajeRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonajeServicio{
    @Autowired
    private PersonajeRepositorio personajeRepositorio;
    
    public Personaje crearPersonaje(Imagen imagen, String nombre, Integer edad, Integer peso, String historia, List<Pelicula> peliculas){
        Personaje p = new Personaje();
        
      if (imagen != null){
            p.setImagen(imagen);
      }
        p.setNombre(nombre);
        p.setEdad(edad);
        p.setHistoria(historia);
        p.setPeso(peso);
        p.setPeliculas(peliculas);
        
        return personajeRepositorio.save(p);
       
        
    }
    
    public void modificarPersonaje(Imagen imagen, String nombre, Integer edad, Integer peso, String historia, List<Pelicula> peliculas){
       Personaje p =personajeRepositorio.getById(nombre);
        if (imagen != null){
            p.setImagen(imagen);
      } else{
            p.getImagen();
        }
        p.setNombre(nombre);
        p.setEdad(edad);
        p.setHistoria(historia);
        p.setPeso(peso);
        p.setPeliculas(peliculas);
        
        personajeRepositorio.save(p);
    }
}
