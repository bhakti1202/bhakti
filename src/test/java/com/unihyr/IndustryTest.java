package com.unihyr;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.unihyr.domain.Industry;
import com.unihyr.service.IndustryService;

import static org.junit.Assert.*;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"/dispatcher-servlet.xml"})
public class IndustryTest {

	//@Autowired private JobLauncherTestUtils jobLauncherTestUtils;
	@Autowired private IndustryService industryService;
	
	@Test
	public void testIndustryInsert(){
		
		Industry industry=new Industry();Date date = new Date();
		java.sql.Date dt = new java.sql.Date(date.getTime());
		industry.setCreateDate(dt);
		industry.setIndustry("Auto Mobile1");
		industry.setUserid("nirbhay@silvereye.co");
		assertEquals(true, (industryService.addIndustry(industry)>0));
	}
	
	
}
