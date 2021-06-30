package com.example.soap.installation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "installation"
})
@XmlRootElement(name = "getInstallationResponse", namespace = "http://soap/custom")
public class GetInstallationResponse {

    @XmlElement(required = true)
    protected Installation installation;

    public Installation getInstallation() {
        return installation;
    }

    public void setInstallation(Installation value) {
        this.installation = value;
    }
}
