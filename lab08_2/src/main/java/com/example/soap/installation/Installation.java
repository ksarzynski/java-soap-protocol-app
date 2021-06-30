package com.example.soap.installation;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "installation", namespace = "http://soap/custom", propOrder = {
        "id",
        "address",
        "clientId",
        "price"
})
public class Installation {

    protected long id;
    @XmlElement(required = true)
    protected String address;
    @XmlElement(name = "clientId")
    protected long clientId;
    protected long price;

    public long getId() {
        return id;
    }

    public void setId(long value) {
        this.id = value;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String value) {
        this.address = value;
    }

    public long getClientId() {
        return clientId;
    }

    public void setClientId(long value) {
        this.clientId = value;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long value) {
        this.price = value;
    }
}