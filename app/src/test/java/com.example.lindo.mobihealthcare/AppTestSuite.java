package com.example.lindo.mobihealthcare;

/**
 * Created by 213036223 on 4/17/2016.
 */
import com.example.lindo.mobihealthcare.factory.TestDemographicInfo;
import com.example.lindo.mobihealthcare.factory.TestPlan;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        TestDemographicInfo.class,
        TestPlan.class})
public class AppTestSuite
{
}
