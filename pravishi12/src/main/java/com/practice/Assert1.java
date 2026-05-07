package com.practice;
import org.testng.annotations.Test;
import org.testng.Assert;
public class Assert1 {
	@Test
	public void SampleMethod() {
		String str1="Pravishi";
		String str2="Srivastava";
		Assert.assertEquals(str1, str2);
	}

}
