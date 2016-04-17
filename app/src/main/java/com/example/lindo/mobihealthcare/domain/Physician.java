package com.example.lindo.mobihealthcare.domain;

import java.util.List;

/**
 * Created by 213036223 on 4/17/2016.
 */
public class Physician extends  Provider{
    public Physician(Builder builder) {
        super(builder);
    }

    @Override
    public List<DemographicInfo> getDemographicInfoList() {
        return super.getDemographicInfoList();
    }

    @Override
    public Payer getPayer() {
        return super.getPayer();
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
