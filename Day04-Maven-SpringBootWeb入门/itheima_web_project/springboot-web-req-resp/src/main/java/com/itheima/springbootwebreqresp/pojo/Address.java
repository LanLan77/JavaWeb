package com.itheima.springbootwebreqresp.pojo;

public class Address  {
    private String privance;
    private String city;

    public String getPrivance() {
        return privance;
    }

    public void setPrivance(String privance) {
        this.privance = privance;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Address{" +
                "privance='" + privance + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
