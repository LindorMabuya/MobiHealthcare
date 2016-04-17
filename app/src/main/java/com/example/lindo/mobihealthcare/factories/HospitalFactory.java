package com.example.lindo.mobihealthcare.factories;

import com.example.lindo.mobihealthcare.domain.Hospital;

/**
 * Created by 213036223 on 4/17/2016.
 */
public interface HospitalFactory {
    Hospital createHospital(String hospitalName);
}
