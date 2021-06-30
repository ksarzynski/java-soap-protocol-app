package com.example.soap.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "id"
})
@XmlRootElement(name = "getClient", namespace = "http://soap/custom")
public class GetClient {

    protected long id;

    public long getId() {
        return id;
    }

    public void setId(long value) {
        this.id = value;
    }
}
