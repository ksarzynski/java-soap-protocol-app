package com.example.soap.installation;

import com.example.soap.client.*;
import com.example.soap.common.ObjectFactory;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class InstallationEndpoint {

    private final InstallationService installationService;

    public InstallationEndpoint(InstallationService installationService) {
        this.installationService = installationService;
    }

    @PayloadRoot(namespace = "http://soap/custom", localPart = "getInstallation")
    @ResponsePayload
    public GetInstallationResponse getInstallation(@RequestPayload GetInstallation getInstallation) {
        Installation installationsById = installationService.getInstallationsById(getInstallation.getId());
        GetInstallationResponse getInstallationResponse = new GetInstallationResponse();
        getInstallationResponse.setInstallation(installationsById);
        return getInstallationResponse;
    }

    @PayloadRoot(namespace = "http://soap/custom", localPart = "addInstallation")
    @ResponsePayload
    public void addInstallation(@RequestPayload AddInstallation addInstallation) {
        long id = addInstallation.getId();
        String address = addInstallation.getAddress();
        long clientId = addInstallation.getIdCustomer();
        long price = addInstallation.getPrice();
        installationService.addInstallation(id, address, clientId, price);
    }

    @PayloadRoot(namespace = "http://soap/custom", localPart = "getAllInstallations")
    @ResponsePayload
    public GetAllInstallationsResponse getAllInstallations() {
        ObjectFactory objectFactory = new ObjectFactory();
        GetAllInstallationsResponse getAllInstallationsResponse = objectFactory.createGetAllInstallationsResponse();
        getAllInstallationsResponse.allInstallations = installationService.getAllInstallation();
        return getAllInstallationsResponse;
    }
}
