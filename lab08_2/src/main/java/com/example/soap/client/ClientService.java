package com.example.soap.client;

import com.example.soap.common.ObjectFactory;
import com.example.soap.installation.Installation;
import com.example.soap.installation.InstallationService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ClientService {

    private List<Client> clients;
    private List<Installation> installations;
    private final ObjectFactory objectFactory = new ObjectFactory();

    public Client getClient(long id) {
        return clients
                .stream()
                .filter(client -> client.getId() == id)
                .findFirst().get();
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }

    public void setInstallations(List<Installation> installations) { this.installations = installations; }

    public ClientService() {
        clients = new ArrayList<>();
        installations = new ArrayList<>();
        Client client1 = new Client();
        client1.setId(1);
        client1.setName("imie 1");
        client1.setSurname("nazwisko 1");
        Client client2 = new Client();
        client2.setId(2);
        client2.setName("Imie 2");
        client2.setSurname("Nazwisko 2");
        clients.add(client1);
        clients.add(client2);
        Installation installation1 = new Installation();
        installation1.setId(1);
        installation1.setAddress("adres 1");
        installation1.setClientId(1);
        installation1.setPrice(1);
        Installation installation2 = new Installation();
        installation2.setId(2);
        installation2.setAddress("adres 2");
        installation2.setClientId(2);
        installation2.setPrice(2);
        installations.add(installation1);
        installations.add(installation2);
    }

    public void addClient(long id, String name, String surname) {
        Client client = objectFactory.createClient();
        client.setId(id);
        client.setName(name);
        client.setSurname(surname);
        clients.add(client);
    }

    public List<Client> getAllClients() {
        return clients;
    }

    public List<Installation> getClientsInstallations(long clientId, InstallationService installationService) {
        if (clients.stream().anyMatch(client -> client.getId() == clientId)) {
            List<Installation> clientsInstallations;
            clientsInstallations = installationService.getAllInstallation().stream().filter(installation -> installation.getClientId() == clientId).collect(Collectors.toList());
            return clientsInstallations;
        } else {
            return new ArrayList<>();
        }
    }
}