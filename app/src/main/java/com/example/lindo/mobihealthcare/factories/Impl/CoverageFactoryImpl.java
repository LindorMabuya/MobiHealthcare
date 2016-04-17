package com.example.lindo.mobihealthcare.factories.Impl;


import com.example.lindo.mobihealthcare.domain.Coverage;
import com.example.lindo.mobihealthcare.factories.CoverageFactory;

/**
 * Created by LILO on 2016/04/08.
 */
public class CoverageFactoryImpl implements CoverageFactory {
    private static CoverageFactoryImpl coverageFactory = null;

    public CoverageFactoryImpl() {
    }

    public static  CoverageFactoryImpl getInstance()
    {
        if(coverageFactory == null)
            coverageFactory = new CoverageFactoryImpl();
        return coverageFactory;
    }

    public Coverage createCoverage() {
        Coverage coverage = new Coverage();
        return coverage;
    }
}
