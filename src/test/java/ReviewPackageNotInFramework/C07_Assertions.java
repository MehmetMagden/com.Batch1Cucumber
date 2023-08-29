package ReviewPackageNotInFramework;

import org.junit.Assert;
import org.junit.Test;

public class C07_Assertions {

    @Test
    public void test(){



        Assert.assertEquals("asdf","asdf");  // both sides should be exactly same, PASSED

        Assert.assertTrue(5>3); // we expect true and it is true , PASSED

        Assert.assertFalse(3>5); // we expect false and it is false , PASSED

        Assert.assertNotEquals("asdfadsf","asdf"); // the values should be different, and they are, PASSED




    }

}
