package test;

import org.jsmart.zerocode.core.domain.TargetEnv;
import org.jsmart.zerocode.core.runner.ZeroCodeUnitRunner;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

@RunWith(ZeroCodeUnitRunner.class)
@TargetEnv("config.properties")
public class GetGoogleTest {

    private RestTemplate restTemplate = new RestTemplate();

    @Test
    public void getGoogleTest() {

        String uri = "http://google.com/";
        ResponseEntity<String> responseDtoResponse = restTemplate.getForEntity(uri, String.class);
        assertThat(responseDtoResponse.getStatusCode().value(), is(200));
    }
}
