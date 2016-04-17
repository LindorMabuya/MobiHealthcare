package com.example.lindo.mobihealthcare.factories;

import com.example.lindo.mobihealthcare.domain.DemographicInfo;
import com.example.lindo.mobihealthcare.domain.Payer;
import com.example.lindo.mobihealthcare.domain.Provider;

import java.util.List;

/**
 * Created by 213036223 on 4/17/2016.
 */
public interface ProviderFactory {
    Provider createProvider(List<DemographicInfo> demographicInfos,Payer payer);
}
