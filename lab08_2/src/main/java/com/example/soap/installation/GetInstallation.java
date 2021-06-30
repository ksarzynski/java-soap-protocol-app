package com.example.soap.installation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "id"
})
@XmlRootElement(name = "getInstallation", namespace = "http://soap/custom")
public class GetInstallation {

    protected long id;

    public long getId() {
        return id;
    }

    public void setId(long value) {
        this.id = value;
    }
}
