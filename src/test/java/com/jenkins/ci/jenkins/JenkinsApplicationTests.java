package com.jenkins.ci.jenkins;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JenkinsApplicationTests {

	@Test
	public void contextLoads() {
		Assert.assertEquals(true, true);
	}

}
