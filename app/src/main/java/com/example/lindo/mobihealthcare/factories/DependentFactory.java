package com.example.lindo.mobihealthcare.factories;

import com.example.lindo.mobihealthcare.domain.Dependent;

/**
 * Created by 213036223 on 4/17/2016.
 */
public interface DependentFactory {
    Dependent createDependent(String relationToSubscriber);
}
