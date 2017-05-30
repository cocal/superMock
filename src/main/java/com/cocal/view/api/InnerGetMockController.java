package com.cocal.view.api;

import com.cocal.model.MockEntity;
import com.cocal.service.common.MockEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

/**
 * Created by Cocal on 2017/5/30.
 */
@RestController
@EnableAutoConfiguration
@RequestMapping("/inner/getMock")
public class InnerGetMockController {

    @Autowired
    private MockEntityRepository mockEntityRepository;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    String getMockEntity(@PathVariable("id") String id) {
        Optional<MockEntity> entityOptional = Optional.ofNullable(mockEntityRepository.findOne(id));
        return "realMock";
    }
}
