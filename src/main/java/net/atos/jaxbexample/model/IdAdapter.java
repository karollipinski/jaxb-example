package net.atos.jaxbexample.model;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class IdAdapter extends XmlAdapter<String, Integer> {

    public Integer unmarshal(String v) throws Exception {
        return Integer.valueOf(v.substring(v.indexOf(":")+1));
    }

    public String marshal(Integer v) throws Exception {
        return "ID:" + v;
    }

}