package com.example.lindo.mobihealthcare.factories;

import com.example.lindo.mobihealthcare.domain.DemographicInfo;
import com.example.lindo.mobihealthcare.domain.Insured;
import com.example.lindo.mobihealthcare.domain.Physician;
import com.example.lindo.mobihealthcare.domain.Plan;

import java.util.List;

/**
 * Created by 213036223 on 4/17/2016.
 */
public interface InsuredFactory {
    Insured createInsured(List<Plan> plans,List<DemographicInfo> demographicInfos,List<Physician> physicians);
}
