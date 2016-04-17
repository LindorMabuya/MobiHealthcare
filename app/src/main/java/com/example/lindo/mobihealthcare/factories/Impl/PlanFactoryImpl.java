package com.example.lindo.mobihealthcare.factories.Impl;


import com.example.lindo.mobihealthcare.domain.BenefitSet;
import com.example.lindo.mobihealthcare.domain.Deductible;
import com.example.lindo.mobihealthcare.domain.Payer;
import com.example.lindo.mobihealthcare.domain.Plan;
import com.example.lindo.mobihealthcare.factories.PlanFactory;

/**
 * Created by LILO on 2016/04/08.
 */
public class PlanFactoryImpl  implements PlanFactory {

    private static PlanFactoryImpl planFactory = null;

    private PlanFactoryImpl(){}

    public static PlanFactoryImpl getInstance(){
        if(planFactory == null)
            planFactory = new PlanFactoryImpl();
            return planFactory;
    }

    public Plan createPlan(Deductible deductible, BenefitSet benefitSet, Payer payer) {
        Plan plan = new Plan.Builder().deductible(deductible).benefitSets(benefitSet).payer(payer).build();
        return plan;
    }
}
