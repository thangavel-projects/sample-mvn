/*
 * Copyright (c) 2020. Thangavel Loganathan, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Thangavel Loganathan, reach me out at <thangavel2code@gmail.com>
 * for further if you want to use it.
 *
 */

package com.sample;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.web.client.RestTemplate;

@RunWith(MockitoJUnitRunner.class)
public class MyClassTest {
    @InjectMocks
    private MyClass mockMyClass;

    @Mock
    private RestTemplate restTemplate;



    private static final String URI_GET = "https://myurl";

    @Before
    public void setUp() {
        //ReflectionTestUtils.setField(mockMyClass, "uri", URI_GET);
    }

    @Test
    public void test() {


        //ResponseEntity<JsonNode> resp = new ResponseEntity<JsonNode>(mockJsonNode, HttpStatus.OK);
        ///when(restTemplate.getForEntity("uri", String.class)).thenReturn(null);
    }

}
