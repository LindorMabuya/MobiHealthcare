package com.example.lindo.mobihealthcare.domain;

import java.io.Serializable;

/**
 * Created by 213036223 on 4/17/2016.
 */
public class Deductible implements Serializable {
    public boolean isDeductible(){
        System.out.print("Deductible: Validating health insurance claim.....\n");
        return true;
    }
    public static class Builder{

        public Deductible build(){return  new Deductible();}
    }
}
