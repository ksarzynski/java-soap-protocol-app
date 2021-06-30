package com.example.soap.common;

import com.example.soap.client.*;
import com.example.soap.installation.AddInstallation;
import com.example.soap.installation.GetAllInstallationsResponse;
import com.example.soap.installation.GetClientsInstallations;
import com.example.soap.installation.Installation;

import javax.xml.bind.annotation.XmlRegistry;

@XmlRegistry
public class ObjectFactory {

    public ObjectFactory() {

    }

    public GetClientResponse createGetResponse() {
        return new GetClientResponse();
    }

    public Client createClient() {
        return new Client();
    }

    public GetClient createGetClient() {
        return new GetClient();
    }

    public AddClient createAddClient() {
        return new AddClient();
    }

    public GetAllClientsResponse createGetAllClientsResponse() {
        return new GetAllClientsResponse();
    }

    public Installation createInstallation() {
        return new Installation();
    }

    public GetAllInstallationsResponse createGetAllInstallationsResponse() {return new GetAllInstallationsResponse(); }

    public GetClientsInstallations createGetClientsInstallations() {return new GetClientsInstallations(); }
}
