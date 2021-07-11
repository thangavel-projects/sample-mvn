package com.sample;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PowerMockIgnore;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.io.InputStream;
import java.security.KeyStore;
import java.security.cert.X509Certificate;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.mock;

@PrepareForTest(KeyStore.class)
@RunWith(PowerMockRunner.class)
@PowerMockIgnore({"javax.management.*", "javax.security.*"})
public class UtilityTest {
//    @InjectMocks
//    Utility utility;
    @Test
    public void uploadTSCertificate() {
//        MockMultipartFile file  = new MockMultipartFile("file","hello.txt",
//                MediaType.TEXT_PLAIN_VALUE,"Hello, World!".getBytes());

        try {
            KeyStore keyStoreMock = mock(KeyStore.class);
            PowerMockito.mockStatic(KeyStore.class, invocation -> keyStoreMock);
            PowerMockito.doReturn(keyStoreMock).when(KeyStore.getInstance("PKS4"), any(), any());
            //PowerMockito.when(KeyStore.getInstance(any(String.class))).thenReturn(keyStoreMock);
            PowerMockito.doNothing().when(keyStoreMock).load(any(InputStream.class), any(char[].class));
            X509Certificate cert = mock(X509Certificate.class);

            //PowerMockito.doReturn(cert).when(keyStoreMock.getCertificate(anyString()));


           PowerMockito.when(keyStoreMock.getCertificate(any())).thenReturn(cert);
            // utility.uploadServerCertificate(file);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
