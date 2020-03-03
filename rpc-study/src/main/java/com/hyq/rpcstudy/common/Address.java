package com.hyq.rpcstudy.common;

import java.io.Serializable;

/**
 * @author nanke
 * @date 2020/3/3 下午3:20
 */
public class Address implements Serializable {

    private String hostName;

    private Integer port;

    public Address(String hostName, Integer port) {
        this.hostName = hostName;
        this.port = port;
    }

    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }
}
