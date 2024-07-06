package org.example.webapp.hello;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController {
    //"say-hello" - when somebody hits this url we want to print "Hello World Whata r you doing"
    //http://localhost8080/say-hello
    @RequestMapping("say-hello")
    @ResponseBody
    public String sayHello(){
        return "Hello World!,  what are you doing today";
    }

    @RequestMapping("say-hello-html")
    @ResponseBody
    public String sayHelloHtml(){
        StringBuffer sb = new StringBuffer();
        sb.append("<html>" +
                "<head>" +
                "<title>First Html page!</title>" +
                "</head>" +
                "<body>" +
                "<h1>Hello World!,  what are you doing today!</h1>" +
                "</body>" +
                "</html>"
        );
        return sb.toString();
    }

    //we are going to make views here it is one of the earliest and popular technology to make views is JSP(Java server pager)
    //"say-hello-jsp" => sayHello.jsp

    //typically all jsp deifned in folder /src/main/resources/META-INF/resources/WEB-INF/jsp/
    //sayHello.jsp
    //We remove response body here it will redirect ot view instead of returning as it is stirng

    @RequestMapping("say-hello-jsp")
    public String sayHelloJsp(){
        return "sayHello";
    }
}
