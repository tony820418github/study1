package com.example.ribboncustomer;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RibbonService {
    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "hiError")
    public String hi(String name){

     //   return restTemplate.getForObject("https://www.baidu.com/",String.class);
        return restTemplate.getForObject("http://eureka-client-zfc/hello",String.class);
    }

    public String hiError(String name){
        return "sorry, error!";
    }
}
