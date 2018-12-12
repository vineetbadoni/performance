package com.gc.pojo;

import java.util.Date;

public class CPUInfo {

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    private String data;

    public CPUInfo(Date date, String hostname, String data){
        this.serverDate = date;
        this.hostname = hostname;
        this.data = data;
    }

    private Date serverDate;

    public Date getServerDate() {
        return serverDate;
    }

    public void setServerDate(Date serverDate) {
        this.serverDate = serverDate;
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    private String hostname;
}
