package name.liushiyao.junit;

import junit.framework.TestCase;
import org.junit.*;

/**
 * Created by 北岭山下 on 2017/5/25.
 */
public class MyMathTest {
        @Test
        public void add ( ) throws Exception {
                TestCase.assertEquals ( MyMath.add ( 1,2 ),3);
        }

        @Test
        public void dec ( ) throws Exception {

        }
        @Before
        public void testBefore(){

                System.out.println ("Before running..." );

        }
        @After
        public void testAfter(){
                System.out.println ("After running..." );
        }
        @BeforeClass
        public static void testBeforeClass(){
                System.out.println ("Before class running" );
        }
        //在所有测试结束之后运行
        @AfterClass
        public static void testAfterClass(){
                System.out.println ("After class running" );
        }

}