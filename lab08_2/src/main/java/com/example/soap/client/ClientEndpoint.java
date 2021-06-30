package com.example.soap.client;

import com.example.soap.common.ObjectFactory;
import com.example.soap.installation.GetAllInstallationsResponse;
import com.example.soap.installation.Installation;
import com.example.soap.installation.InstallationService;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class ClientEndpoint {

    private final ClientService clientService;
    private final InstallationService installationService;

    public ClientEndpoint(ClientService clientService, InstallationService installationService) {
        this.clientService = clientService;
        this.installationService = installationService;
    }

    @PayloadRoot(namespace = "http://soap/custom", localPart = "getClient")
    @ResponsePayload
    public GetClientResponse getClient(@RequestPayload GetClient getClient) {
        Client clientsById = clientService.getClient(getClient.getId());;
        GetClientResponse getClientResponse = new GetClientResponse();
        getClientResponse.setClient(clientsById);
        return getClientResponse;
    }

    @PayloadRoot(namespace = "http://soap/custom", localPart = "addClient")
    @ResponsePayload
    public void addClient(@RequestPayload AddClient addClient) {
        long id = addClient.getId();
        String name = addClient.getName();
        String surname = addClient.getSurname();
        clientService.addClient(id, name, surname);
    }

    @PayloadRoot(namespace = "http://soap/custom", localPart = "getAllClients")
    @ResponsePayload
    public GetAllClientsResponse getAllClients() {
        ObjectFactory objectFactory = new ObjectFactory();
        GetAllClientsResponse getAllClientsResponse = objectFactory.createGetAllClientsResponse();
        getAllClientsResponse.allClients = clientService.getAllClients();
        return getAllClientsResponse;
    }

    @PayloadRoot(namespace = "http://soap/custom", localPart = "getClientsInstallations")
    @ResponsePayload
    public GetAllInstallationsResponse getClientsInstallations() {
        ObjectFactory objectFactory = new ObjectFactory();
        GetAllInstallationsResponse getAllInstallationsResponse = objectFactory.createGetAllInstallationsResponse();
        getAllInstallationsResponse.allInstallations = clientService.getClientsInstallations(1, installationService);
        return getAllInstallationsResponse;
    }
}