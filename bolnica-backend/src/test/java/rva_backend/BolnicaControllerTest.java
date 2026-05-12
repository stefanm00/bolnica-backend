package rva_backend;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import rva_backend.models.Bolnica;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class BolnicaControllerTest {

    @LocalServerPort
    int port;

    RestTemplate template = new RestTemplate();

    String apiUrl() {
        return "http://localhost:" + port + "/bolnica";
    }

    static int newId;

    @Test
    @Order(1)
    void createBolnica() {
        Bolnica a = new Bolnica();
        a.setNaziv("TEST");

        HttpEntity<Bolnica> entity = new HttpEntity<>(a);

        ResponseEntity<Bolnica> response =
                template.exchange(apiUrl(), HttpMethod.POST, entity, Bolnica.class);

        assertEquals(201, response.getStatusCode().value());
        assertNotNull(response.getBody());

        newId = response.getBody().getId();
    }

    @Test
    @Order(2)
    void getAll() {
        ResponseEntity<List<Bolnica>> response =
                template.exchange(apiUrl(), HttpMethod.GET, null,
                        new ParameterizedTypeReference<List<Bolnica>>() {});

        assertEquals(200, response.getStatusCode().value());
        assertNotNull(response.getBody());
    }

    @Test
    @Order(3)
    
    void getOne() {
        ResponseEntity<Bolnica> response =
                template.getForEntity(apiUrl() + "/" + newId, Bolnica.class);

        assertEquals(200, response.getStatusCode().value());
        assertNotNull(response.getBody());
    }
    
    @Test
    @Order(4) 
    
    void getByNaziv() {
        ResponseEntity<List<Bolnica>> response =
                template.exchange(apiUrl() + "/naziv/TEST",
                        HttpMethod.GET,
                        null,
                        new ParameterizedTypeReference<List<Bolnica>>() {});

        assertEquals(200, response.getStatusCode().value());
        assertNotNull(response.getBody());
    }

    
    @Test
    @Order(5)
    void updateBolnica() {
        Bolnica a = new Bolnica();
        a.setNaziv("UPDATED");

        HttpEntity<Bolnica> entity = new HttpEntity<>(a);

        ResponseEntity<Bolnica> response =
                template.exchange(apiUrl() + "/" + newId,
                        HttpMethod.PUT,
                        entity,
                        Bolnica.class);

        assertEquals(200, response.getStatusCode().value());
        assertEquals("UPDATED", response.getBody().getNaziv());
    }

    @Test
    @Order(6)
    void deleteBolnica() {
        ResponseEntity<?> response =
                template.exchange(apiUrl() + "/" + newId,
                        HttpMethod.DELETE,
                        null,
                        Object.class);

        assertEquals(200, response.getStatusCode().value());
    }
}