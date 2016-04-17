package com.example.lindo.mobihealthcare.domain;

import java.util.List;

/**
 * Created by 213036223 on 4/17/2016.
 */
public class Subscriber extends Insured{
    private Dependent dependent;

    public Subscriber(Builder builder, Dependent dependent) {
        super(builder);
        this.dependent = dependent;
    }

    public Dependent getDependent() {

        return dependent;
    }

    @Override
    public List<Plan> getPlan() {
        return super.getPlan();
    }

    @Override
    public List<DemographicInfo> getDemographicInfos() {
        return super.getDemographicInfos();
    }

    @Override
    public List<Physician> getPhysicianLst() {
        return super.getPhysicianLst();
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
