package com.example.soap.installation;

import com.example.soap.common.ObjectFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class InstallationService {

    private List<Installation> installations;
    private final ObjectFactory objectFactory = new ObjectFactory();

    public Installation getInstallationsById(long id) {
        return installations
                .stream()
                .filter(client -> client.getId() == id)
                .findFirst().get();
    }

    public void setClients(List<Installation> installations) {
        this.installations = installations;
    }

    public InstallationService() {
        installations = new ArrayList<>();
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

    public void addInstallation(long id, String address, long clientId, long price) {
        Installation installation = objectFactory.createInstallation();
        installation.setId(id);
        installation.setAddress(address);
        installation.setClientId(clientId);
        installation.setPrice(price);
        installations.add(installation);
    }

    public List<Installation> getAllInstallation() {
        return installations;
    }
}
