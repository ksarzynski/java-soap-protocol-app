package com.example.soap.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "allClients"
})
@XmlRootElement(name = "getAllClientsResponse", namespace = "http://soap/custom")
public class GetAllClientsResponse {

    protected List<Client> allClients;

    public List<Client> getAllClients() {
        if (this.allClients == null) {
            this.allClients = new ArrayList<>();
        }
        return this.allClients;
    }
}
