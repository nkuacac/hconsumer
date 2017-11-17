package com.service.controller;
import io.servicecomb.provider.rest.common.RestSchema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import io.servicecomb.core.CseContext;
import javax.ws.rs.core.MediaType;
import com.service.model.Person;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import io.servicecomb.core.CseContext;
import io.servicecomb.provider.springmvc.reference.RestTemplateBuilder;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringCodegen", date = "2017-11-16T07:36:16.488Z")
@RestSchema(schemaId = "hconsumer")
@RequestMapping(path = "/hconsumer", produces = MediaType.APPLICATION_JSON)
public class HconsumerImpl {
    
    @RequestMapping(value = "/add",
            produces = { "application/json" },
            method = RequestMethod.GET)
    public Integer add(@RequestParam(value = "a", required = true) Integer a, @RequestParam(value = "b", required = true) Integer b){
        RestTemplate restTemplate = RestTemplateBuilder.create();
        String microserviceName = "hprovider";
        String prefix = "cse://" + microserviceName;
        CseContext.getInstance().getConsumerProviderManager().setTransport(microserviceName, "rest");
        return restTemplate.getForObject(prefix + "/hprovider/add?a={a}&b={b}", Integer.class, a, b);
    }

    public String sayHei(String name){
        RestTemplate restTemplate = RestTemplateBuilder.create();
        String microserviceName = "hprovider";
        String prefix = "cse://" + microserviceName;
        HttpHeaders headers = new HttpHeaders();
        headers.add("name", name);
        @SuppressWarnings("rawtypes")
        HttpEntity entity = new HttpEntity<>(null, headers);
        ResponseEntity<String> response = restTemplate.exchange(prefix + "/hprovider/sayhei",
                HttpMethod.GET,
                entity,
                String.class);
        return response.getBody();
    }

    public String sayHello(String name){
        RestTemplate restTemplate = RestTemplateBuilder.create();
        String microserviceName = "hprovider";
        String prefix = "cse://" + microserviceName;
        CseContext.getInstance().getConsumerProviderManager().setTransport(microserviceName, "rest");
        return restTemplate.postForObject(prefix + "/hprovider/sayhello/"+name, null, String.class);
    }

    public String sayHi(String name){
        RestTemplate restTemplate = RestTemplateBuilder.create();
        String microserviceName = "hprovider";
        String prefix = "cse://" + microserviceName;
        CseContext.getInstance().getConsumerProviderManager().setTransport(microserviceName, "rest");
        return restTemplate.getForObject(prefix + "/hprovider/sayhi?name={name}", String.class, name);
    }
    
    public String saySomething(String pre, Person user){
        RestTemplate restTemplate = RestTemplateBuilder.create();
        String microserviceName = "hprovider";
        String prefix = "cse://" + microserviceName;
        CseContext.getInstance().getConsumerProviderManager().setTransport(microserviceName, "rest");
        return restTemplate.postForObject(prefix + "/hprovider/saysomething?prefix={pre}", user, String.class, pre);
    }
}
