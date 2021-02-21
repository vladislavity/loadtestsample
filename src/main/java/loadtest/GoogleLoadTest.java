package loadtest;

import org.jsmart.zerocode.core.domain.LoadWith;
import org.jsmart.zerocode.core.domain.TestMapping;
import org.jsmart.zerocode.core.runner.parallel.ZeroCodeLoadRunner;
import org.junit.runner.RunWith;
import test.GetGoogleTest;

@TestMapping(testClass = GetGoogleTest.class, testMethod = "getGoogleTest")
@LoadWith("config.properties")
@RunWith(ZeroCodeLoadRunner.class)
public class GoogleLoadTest {

}