package com.example.soap.installation;

import com.example.soap.client.Client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "allInstallations"
})
@XmlRootElement(name = "getAllClientsResponse", namespace = "http://soap/custom")
public class GetAllInstallationsResponse {

    public List<Installation> allInstallations;

    public List<Installation> getAllInstallations() {
        if (this.allInstallations == null) {
            this.allInstallations = new ArrayList<>();
        }
        return this.allInstallations;
    }

    public List<Installation> getClientsInstallations(long clientId) {
        if (this.allInstallations == null) {
            this.allInstallations = new ArrayList<>();
        }
        ArrayList<Installation> clientsInstallations = new ArrayList<>();
        for(Installation installation : this.allInstallations){
            if(installation.getClientId() == clientId){
                clientsInstallations.add(installation);
            }
        }
        return clientsInstallations;
    }
}
