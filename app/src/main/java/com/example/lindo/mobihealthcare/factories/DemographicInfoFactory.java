package com.example.lindo.mobihealthcare.factories;


import com.example.lindo.mobihealthcare.domain.Address;
import com.example.lindo.mobihealthcare.domain.DemographicInfo;

/**
 * Created by LILO on 2016/04/07.
 */
public interface DemographicInfoFactory
{
     DemographicInfo createDemograhicInfo(int age, String sex, String maritalStatus,
                                          String occupation, double salary, Address address);
}
