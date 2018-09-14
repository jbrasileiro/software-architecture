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
    public void cleanup() {
        System.out.println("$ - executing @After");
    }

    /*
     * Uses @Test to annotate the method to be run.
     */
    @Test
    public void example() {
        System.out.println("$ - executing the test");
        System.out.println(example.example());
    }
}
