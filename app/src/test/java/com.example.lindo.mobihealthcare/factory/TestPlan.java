package com.example.lindo.mobihealthcare.factory;

import com.example.lindo.mobihealthcare.domain.BenefitSet;
import com.example.lindo.mobihealthcare.domain.Deductible;
import com.example.lindo.mobihealthcare.domain.Payer;
import com.example.lindo.mobihealthcare.domain.Plan;
import com.example.lindo.mobihealthcare.domain.Service;
import com.example.lindo.mobihealthcare.factories.Impl.PlanFactoryImpl;
import com.example.lindo.mobihealthcare.factories.PlanFactory;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by LILO on 2016/04/08.
 */
public class TestPlan {
    private PlanFactory planFactory;
    private Deductible deductible;
    private BenefitSet benefitSet;
    private Payer payer;
    private Service service;
    private Plan plan;

    @Before
    public void setUpPlan() throws Exception {
        planFactory = PlanFactoryImpl.getInstance();
        deductible = new Deductible();
        benefitSet = new BenefitSet(service);
        payer = new Payer(plan);
    }

    @Test
    public void testPlan() throws Exception {
        plan = planFactory.createPlan(deductible,benefitSet,payer);
        Assert.assertEquals(plan.getDeductible(), deductible);
    }

    @Test
    public void testPlanUpdate() throws Exception {
        plan = planFactory.createPlan(deductible,benefitSet,payer);
        Plan updatePlan = new Plan.Builder().copy(plan).deductible(deductible).build();
        updatePlan.checkDeduction(deductible);
        Assert.assertEquals(updatePlan.getDeductible(),deductible);


    }
}
