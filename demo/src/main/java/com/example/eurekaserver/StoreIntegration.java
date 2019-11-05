//package com.example.demo;
//
//import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
//import org.springframework.stereotype.Component;
//
//import java.util.Map;
//
///**
// * @author lai
// * @project eurekaserver-spingcloud
// * @des
// * @create 2019-11-03 21:29
// **/
//
//@Component
//public class StoreIntegration {
//
//    @HystrixCommand(fallbackMethod = "defaultStores")
//    public Object getStores(Map<String, Object> parameters) {
//        //do stuff that might fail
//    }
//
//    public Object defaultStores(Map<String, Object> parameters) {
//        return /* something useful */;
//    }
//}
