package com.example.lindo.mobihealthcare.factories;


import com.example.lindo.mobihealthcare.domain.BenefitSet;
import com.example.lindo.mobihealthcare.domain.Deductible;
import com.example.lindo.mobihealthcare.domain.Payer;
import com.example.lindo.mobihealthcare.domain.Plan;

/**
 * Created by LILO on 2016/04/08.
 */
public interface PlanFactory {
    Plan createPlan(Deductible deductible, BenefitSet benefitSet, Payer payer);
}
