/*
 * Unit Test class should be at the same class under test's package.
 *  - ex.lib.v01.Example
 *  - ex.lib.v01.ExampleTest
 *
 * Unit Test class should match one of the fellowing convertion:
 *  - end with 'Test'. ex: ExampleTest
 *  - start with Test. ex: TestExample
 *
 * Unit Test has a carnalidade of 1x1 one UT per class.
 *
 */
package ex.lib.v01;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ExampleTest {

    private Example example;

    /*
     * Uses @Before to unsure the initial state, it will be executed before each @Test method.
     */
    @Before
    public void setup() {
        System.out.println("$ - executing @Before");
        example = new Example();
    }

    /*
     * Uses @After to unsure the initial state, it will be executed after each @Test method.
     */
    @After
    public void cleanUp() {
        System.out.println("$ - executing @After");
    }

    /*
     * Uses @Test to annotate the method to be run.
     */
    @Test
    public void example() {
        System.out.println("$ - executing the test");

        /*
         * USE AAA to write test:
         *  - [A]rrange
         *  - [A]ct
         *  - [A]ssert
         */
        // Arrange - prepare all data to be executeed
        String input = "ok";

        // Act - execute the test
        String result = example.example(input);

        // Asset - execute the assertations
        /**
         * TIPS:
         *  TIP 01 : Don't do too much assertation
         *  TIP 02 : Avoid logic, any conditional in test.
         *  TIP 03 : UT should always easy to write
         *
         */
        Assert.assertEquals("example+ok", result);
    }
}
