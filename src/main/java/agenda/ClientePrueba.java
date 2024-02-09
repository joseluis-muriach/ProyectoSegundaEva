package agenda;

import agenda.entidades.Contacto;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

public class ClientePrueba {
    private static String baseUrl = "http://localhost:8080/contactos";
    public static void main(String[] args) {
        // Crea un nuevo contacto para agregar
        Contacto nuevoContacto = new Contacto("Juan", "987654321");


        // Ejecuta el cliente de prueba
        ClientePrueba cliente = new ClientePrueba();
        cliente.realizarPruebas(nuevoContacto);
    }


    public void realizarPruebas(Contacto nuevoContacto) {
        // Agrega un nuevo contacto
        nuevoContacto = agregarContacto(nuevoContacto);
        System.out.println("Contacto agregado: " + nuevoContacto);


        // Obtiene todos los contactos
        listarContactos();


        // Obtiene un contacto por ID
        obtenerContactoPorId(nuevoContacto.getId());

        //Ejercicio parte 2
        //Modifica un contacto
        modificarContacto(nuevoContacto.getId(), nuevoContacto);

        //Volvemos a listar para que se vea antes de eliminar
        listarContactos();

        // Elimina un contacto por ID
        eliminarContacto(nuevoContacto.getId());


        // Obtiene todos los contactos después de la eliminación
        listarContactos();
    }

    private Contacto agregarContacto(Contacto contacto) {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Contacto> response = restTemplate.postForEntity(baseUrl, contacto, Contacto.class);
        return response.getBody();
    }

    private void listarContactos() {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Contacto[]> response = restTemplate.getForEntity(baseUrl, Contacto[].class);
        Contacto[] contactos = response.getBody();
        System.out.println("Lista de contactos:");
        for (Contacto contacto : contactos) {
            System.out.println(contacto);
        }
    }

    private void obtenerContactoPorId(Long id) {
        RestTemplate restTemplate = new RestTemplate();
        Contacto contacto = restTemplate.getForObject(baseUrl + "/" + id, Contacto.class);
        System.out.println("Contacto obtenido por ID: " + contacto);
    }

    private void eliminarContacto(Long id) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.delete(baseUrl + "/" + id);
        System.out.println("Contacto eliminado con ID: " + id);
    }

    private Contacto modificarContacto(Long id, Contacto contacto) {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<Contacto> requestEntity = new HttpEntity<>(contacto, headers);

        ResponseEntity<Contacto> response = restTemplate.exchange(baseUrl + "/" + id, HttpMethod.PUT, requestEntity, Contacto.class);
        //System.out.println("Contacto modificaddo" + id + " " + contacto);
        return response.getBody();
    }
}

