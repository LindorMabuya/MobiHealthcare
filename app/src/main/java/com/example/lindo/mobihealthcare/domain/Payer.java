package com.example.lindo.mobihealthcare.domain;

import java.io.Serializable;

/**
 * Created by 213036223 on 4/17/2016.
 */
public class Payer implements Serializable{
    private Plan plan;

    private Payer(){}

    public Payer(Plan plan) {
        this.plan = plan;
    }


    public Plan getPlan() {
        return plan;
    }


}
