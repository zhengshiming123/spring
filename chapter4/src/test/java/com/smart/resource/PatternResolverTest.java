package com.smart.resource;

import org.junit.Test;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

import java.io.IOException;

import static org.junit.Assert.assertNotNull;

/**
 * Created by h on 2017/10/13.
 */
public class PatternResolverTest {

    @Test
    public void getResources() throws IOException {

        ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();

        Resource[] resources = resolver.getResources("classpath:com/smart/**/*.xml");
        assertNotNull(resources);
        for (Resource resource: resources){
            System.out.println(resource);
        }
        (new DefaultResourceLoader()).getResource("classpath:conf/sys.properties").getFile();
        (new DefaultResourceLoader()).getResource("classpath:conf/sys.properties").getInputStream();
    }
}
