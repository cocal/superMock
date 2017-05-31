package com.cocal.view.api;

import com.cocal.common.dto.MokerConstDto;
import com.cocal.model.MockEntity;
import com.cocal.service.common.MockEntityRepository;
import com.cocal.service.resolver.TempSelfResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * Created by Cocal on 2017/5/30.
 */
@RestController
@EnableAutoConfiguration
@RequestMapping("/inner/mocker")
public class InnerGetMockController {



    @Autowired
    private MockEntityRepository mockEntityRepository;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public String getMockEntity(@PathVariable("id") String id) {
        Optional<MockEntity> entityOptional = Optional.ofNullable(mockEntityRepository.findOne(id));
        return "realMock";
    }

    @RequestMapping(value = "/mock/{id}", method = RequestMethod.GET)
    public Map<String,String> doMock(@PathVariable("id") String id,HttpServletRequest req){

        //Optional<MockEntity> entityOptional = Optional.ofNullable(mockEntityRepository.findOne(id));
       // MockEntity mockEntity = entityOptional.orElse(MokerConstDto.notExist);

        Map<String,String> params = getRequestParams(req);

        //String str = new TempSelfResolver( () -> "ss" ).getCode();
        TempSelfResolver tempSelfResolver = (k,v) -> Optional.of(k);

        //new Thread( () -> System.out.println("In Java8, Lambda expression rocks !!") ).start();
        return tempSelfResolver.mergeByRequest(params,"ss").orElse(null);

    }

    private Map<String,String> getRequestParams(HttpServletRequest req){
        Map<String,String> result = new HashMap<>();
        Enumeration<String> names = req.getParameterNames();
        while(names.hasMoreElements()){
            String name = names.nextElement();
            result.put(name,req.getParameter(name));
        }
        return result;
    }
}
