package com.example.lindo.mobihealthcare.domain;

/**
 * Created by 213036223 on 4/17/2016.
 */
public class Service {
    private List<Coverage> coverageList;
    private String serviceType;

    private Service(){

    }

    public Service(List<Coverage> coverageList, String serviceType) {
        this.coverageList = coverageList;
        this.serviceType = serviceType;
    }

    public List<Coverage> getCoverageList() {
        return coverageList;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void processCover(Coverage coverage){
        if(coverage.isCovered()){
            System.out.print("Service: Valid claim. Currently processing claim for approval...");
        }
    }

    private class List<T> {
    }


}
