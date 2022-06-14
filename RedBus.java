package org.sample1;

import org.base.BaseClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RedBus extends BaseClass {
	@Before
	public void startBrowser() {
		toConfigurebrowser();
		toMaximize();
		toLoadurl("https://www.redbus.in/");
		toImplicitWait(2000);
	}

	@Test
	public void tc1() {
		Pojo p = new Pojo();
		toClick(p.getCli());
		toClick(p.getCli1());
		toFrameByIndex(1);
		toFillTxtBox(p.getSen(), "8098519483");
		String att = toGetAttribute(p.getSen(), "value");
		Assert.assertEquals("To Verify Number", "8098519483", att);
	}

}
