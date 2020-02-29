package com.example.servicefeign;

import org.springframework.stereotype.Component;

/**
 * @author lai
 * @project eurekaserver-spingcloud
 * @des
 * @create 2019-10-30 21:48
 **/

@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
