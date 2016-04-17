package com.example.lindo.mobihealthcare.factories.Impl;


import com.example.lindo.mobihealthcare.domain.Address;
import com.example.lindo.mobihealthcare.domain.DemographicInfo;
import com.example.lindo.mobihealthcare.factories.DemographicInfoFactory;

/**
 * Created by LILO on 2016/04/07.
 */
public class DemographicInfoFactoryImpl implements DemographicInfoFactory
{
    private static DemographicInfoFactoryImpl demographicInfoFactory = null;

    private DemographicInfoFactoryImpl(){}

    public static  DemographicInfoFactoryImpl getInstance()
    {
        if(demographicInfoFactory == null)
            demographicInfoFactory = new DemographicInfoFactoryImpl();
        return demographicInfoFactory;
    }


    public DemographicInfo createDemograhicInfo(int age, String sex, String maritalStatus,
                                                String occupation, double salary, Address address)
    {
        DemographicInfo demographicInfo = new DemographicInfo.Builder().age(age).sex(sex)
                                                .maritalStatus(maritalStatus).occupation(occupation)
                                                .salary(salary).address(address).build();
        return demographicInfo;
    }
}
