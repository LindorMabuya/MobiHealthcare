package com.example.lindo.mobihealthcare.factory;


import com.example.lindo.mobihealthcare.domain.Address;
import com.example.lindo.mobihealthcare.domain.DemographicInfo;
import com.example.lindo.mobihealthcare.factories.AddressFactory;
import com.example.lindo.mobihealthcare.factories.DemographicInfoFactory;
import com.example.lindo.mobihealthcare.factories.Impl.AddressFactoryImpl;
import com.example.lindo.mobihealthcare.factories.Impl.DemographicInfoFactoryImpl;

import junit.framework.Assert;
import org.junit.Test;
/**
 * Created by LILO on 2016/04/07.
 */
public class TestDemographicInfo
{
    private DemographicInfoFactory demographicInfoFactory;
    private AddressFactory addressFactory;
    private Address address;

    @Before
    public void setUpDemographicInfo() throws Exception {
        demographicInfoFactory = DemographicInfoFactoryImpl.getInstance();
        addressFactory = AddressFactoryImpl.getInstance();
        address = addressFactory.createAddress(3,"Kotze Street","Gardens","Cape Town",8001);
    }
    @Test
    public void testDemographicInfo() throws Exception {
        DemographicInfo demo = demographicInfoFactory.createDemograhicInfo(21,"Female","Single","Doctor",10000.00,address);
        Assert.assertEquals(demo.getAge(), 21);
    }

    @Test
    public void testUpdateDemographicInfo() throws Exception {
        DemographicInfo demo = demographicInfoFactory.createDemograhicInfo(21,"Female","Single","Doctor",10000.00,address);
        DemographicInfo updateDemo = new DemographicInfo.Builder().copy(demo).age(22).build();
        Assert.assertEquals(updateDemo.getAge(),22);

    }
}
