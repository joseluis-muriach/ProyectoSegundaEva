package agenda.servicios;

import agenda.entidades.Contacto;

import java.util.List;

public interface ContactoService {
    List<Contacto> obtenerTodos();
    Contacto obtenerPorId(Long id);
    Contacto guardar(Contacto contacto);
    void eliminar(Long id);
    void modificar(Long id, Contacto contacto); //Ejercicio parte 2
}
