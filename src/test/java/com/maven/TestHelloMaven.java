package com.maven;

import org.junit.Assert;
import org.junit.Test;

import utils.Log;
public class TestHelloMaven {

	@Test
    public void test() {
        Assert.assertEquals("Hello Maven", new String("Hello Maven"));
		Log.error("Unable to Open Browser");

    }
}
