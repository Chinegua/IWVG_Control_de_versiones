package aitor.bernal.falcon.SVC.miw.upm.es.c2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class C21Test {
    C21 c21;
    @Before
    public void before() {
        c21 = new C21();
    }

    @Test
    public void testM1() {
        assertEquals("m1",c21.m1());
    }

    @Test
    public void testM2() {
        assertEquals("m2",c21.m2());
    }

}
