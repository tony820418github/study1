package com.example.eurekaclient;

        import org.springframework.beans.factory.annotation.Value;
        import org.springframework.web.bind.annotation.RequestMapping;
        import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Value("${my.user}")
    private String user;

    @RequestMapping("/hello")
    public String index(){
        return "Success!"+ user ;
    }

}