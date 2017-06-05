package com.cocal.view.back.admin;

import com.cocal.model.MockEntity;
import com.cocal.service.common.MockEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by cocal on 2017/6/5.
 */
@RestController
@EnableAutoConfiguration
@RequestMapping("/manager/mocker")
public class MockerManagerController {


    @Autowired
    private MockEntityRepository mockEntityRepository;

    //@RequestMapping(value = "/{id}", method = RequestMethod.POST)
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public MockEntity addMoker(@PathVariable("id") String id){

        MockEntity mockEntity = mockEntityRepository.findOne(id);
        if (null == mockEntity){
            mockEntity = new MockEntity();
            mockEntity.setId(id);
            mockEntity.setDescribe("test");
            mockEntity.setOriResponse("Mock " + id + " test!");
        }
        mockEntityRepository.save(mockEntity);
        return mockEntity;
    }
}
