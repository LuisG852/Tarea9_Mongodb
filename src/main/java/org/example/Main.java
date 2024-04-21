package org.example;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoCursor;
import org.bson.Document;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Conexión a la base de datos MongoDB
        try (MongoClient mongoClient = MongoClients.create("mongodb://localhost:27017")) {
            MongoDatabase database = mongoClient.getDatabase("test");
            MongoCollection<Document> collection = database.getCollection("telefonos");

            // Crear la lista enlazada
            ListaEnlazada<Document> listaEnlazada = new ListaEnlazada<>();

            // Insertar los documentos existentes en la base de datos en la lista enlazada
            MongoCursor<Document> cursor = collection.find().iterator();
            while (cursor.hasNext()) {
                Document documento = cursor.next();
                listaEnlazada.insertar(documento);
            }

            // Imprimir la lista enlazada
            listaEnlazada.imprimir();

            // Insertar nuevos documentos en la base de datos
            Document nuevoDocumento1 = new Document("marca", "Nokia")
                    .append("modelo", "3310")
                    .append("sistemaOperativo", "Symbian")
                    .append("tamanoPantalla", 2.4)
                    .append("memoriaRAM", 0.5)
                    .append("almacenamientoInterno", 16)
                    .append("tieneCamara", true)
                    .append("resolucionCamara", 2)
                    .append("esSmartphone", false)
                    .append("imei", "000000000000000");

            Document nuevoDocumento2 = new Document("marca", "Motorola")
                    .append("modelo", "Moto G")
                    .append("sistemaOperativo", "Android")
                    .append("tamanoPantalla", 6.4)
                    .append("memoriaRAM", 4)
                    .append("almacenamientoInterno", 64)
                    .append("tieneCamara", true)
                    .append("resolucionCamara", 48)
                    .append("esSmartphone", true)
                    .append("imei", "111111111111111");

            Document nuevoDocumento3 = new Document("marca", "Sony")
                    .append("modelo", "Xperia XZ")
                    .append("sistemaOperativo", "Android")
                    .append("tamanoPantalla", 5.2)
                    .append("memoriaRAM", 3)
                    .append("almacenamientoInterno", 32)
                    .append("tieneCamara", true)
                    .append("resolucionCamara", 23)
                    .append("esSmartphone", true)
                    .append("imei", "222222222222222");

            // Agregar los nuevos documentos a la colección
            collection.insertMany(Arrays.asList(nuevoDocumento1, nuevoDocumento2, nuevoDocumento3));

            // Insertar los documentos anteriores en la colección
            Document documento1 = new Document("marca", "Samsung")
                    .append("modelo", "Galaxy S21")
                    .append("sistemaOperativo", "Android")
                    .append("tamanoPantalla", 6.2)
                    .append("memoriaRAM", 8)
                    .append("almacenamientoInterno", 128)
                    .append("tieneCamara", true)
                    .append("resolucionCamara", 64)
                    .append("esSmartphone", true)
                    .append("imei", "123456789");

            Document documento2 = new Document("marca", "Apple")
                    .append("modelo", "iPhone 12")
                    .append("sistemaOperativo", "iOS")
                    .append("tamanoPantalla", 6.1)
                    .append("memoriaRAM", 4)
                    .append("almacenamientoInterno", 256)
                    .append("tieneCamara", true)
                    .append("resolucionCamara", 12)
                    .append("esSmartphone", true)
                    .append("imei", "987654321");

            Document documento3 = new Document("marca", "Xiaomi")
                    .append("modelo", "Redmi Note 10")
                    .append("sistemaOperativo", "Android")
                    .append("tamanoPantalla", 6.43)
                    .append("memoriaRAM", 6)
                    .append("almacenamientoInterno", 128)
                    .append("tieneCamara", true)
                    .append("resolucionCamara", 48)
                    .append("esSmartphone", true)
                    .append("imei", "135792468");

            Document documento4 = new Document("marca", "Google")
                    .append("modelo", "Pixel 5")
                    .append("sistemaOperativo", "Android")
                    .append("tamanoPantalla", 6.0)
                    .append("memoriaRAM", 8)
                    .append("almacenamientoInterno", 128)
                    .append("tieneCamara", true)
                    .append("resolucionCamara", 12.2)
                    .append("esSmartphone", true)
                    .append("imei", "246813579");

            Document documento5 = new Document("marca", "OnePlus")
                    .append("modelo", "8T")
                    .append("sistemaOperativo", "Android")
                    .append("tamanoPantalla", 6.55)
                    .append("memoriaRAM", 12)
                    .append("almacenamientoInterno", 256)
                    .append("tieneCamara", true)
                    .append("resolucionCamara", 48)
                    .append("esSmartphone", true)
                    .append("imei", "987654321");

            collection.insertMany(Arrays.asList(documento1, documento2, documento3, documento4, documento5));

        } catch (Exception e) {
            System.err.println("Error al conectar a la base de datos MongoDB: " + e.getMessage());
        }
    }
}

