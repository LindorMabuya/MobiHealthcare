package com.example.lindo.mobihealthcare.domain;

import java.io.Serializable;

/**
 * Created by 213036223 on 4/17/2016.
 */
public class Coverage implements Serializable {
    public boolean isCovered(){
        System.out.print("Coverage: Validating health insurance claim.....\n");
        return true;

    }
    public static class Builder{

        public Coverage build(){return  new Coverage();}
    }

}
