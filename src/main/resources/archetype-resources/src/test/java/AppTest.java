package $org.example;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test1 for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test1 case
     *
     * @param testName name of the test1 case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test1 :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
}
