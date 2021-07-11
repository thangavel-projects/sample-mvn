package com.sample;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.web.client.RestTemplate;

@RunWith(MockitoJUnitRunner.class)

 public final class HelperTest {

     @Rule
     public final TestName name = new TestName();

    @Mock
    private RestTemplate restTemplate;

    @Test
    public void test() {


        //ResponseEntity<JsonNode> resp = new ResponseEntity<JsonNode>(mockJsonNode, HttpStatus.OK);
        ///when(restTemplate.getForEntity("uri", String.class)).thenReturn(null);
    }

    @Test
    public void callA(){
        System.out.println(name.getMethodName());
    }

}
