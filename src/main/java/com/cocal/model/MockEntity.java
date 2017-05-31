package com.cocal.model;

/**
 * Created by Cocal on 2017/5/30.
 * Mock实体
 */
public final class MockEntity {


    public String id;

    public String name;

    public String describe;

    public String oriUrl;

    public String oriReq;

    public String oriResponse;

    //public String routerCode;


    //TargetEntity targetEntity;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public String getOriUrl() {
        return oriUrl;
    }

    public void setOriUrl(String oriUrl) {
        this.oriUrl = oriUrl;
    }

    public String getOriReq() {
        return oriReq;
    }

    public void setOriReq(String oriReq) {
        this.oriReq = oriReq;
    }

    public String getOriResponse() {
        return oriResponse;
    }

    public void setOriResponse(String oriResponse) {
        this.oriResponse = oriResponse;
    }
}
