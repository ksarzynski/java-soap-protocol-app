package com.example.soap.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "client"
})
@XmlRootElement(name = "getClientResponse", namespace = "http://soap/custom")
public class GetClientResponse {

    @XmlElement(required = true)
    protected Client client;

    public Client getClient() {
        return client;
    }

    public void setClient(Client value) {
        this.client = value;
    }
}