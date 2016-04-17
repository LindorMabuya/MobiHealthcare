package com.example.lindo.mobihealthcare.factories;

import com.example.lindo.mobihealthcare.domain.Dependent;
import com.example.lindo.mobihealthcare.domain.Subscriber;

/**
 * Created by 213036223 on 4/17/2016.
 */
public interface SubcriberFactory {
    Subscriber createSubscriber(Dependent dependent);
}
