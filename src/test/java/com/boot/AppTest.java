package com.boot;

import com.boot.controller.HomeController;
import static junit.framework.TestCase.assertEquals;
import org.junit.Test;




public class AppTest {

    @Test
    public void testApp() {
        HomeController hc = new HomeController();
        String result = hc.home();
        assertEquals(result, "Das Boot, reporting for duty!");
    }
}
