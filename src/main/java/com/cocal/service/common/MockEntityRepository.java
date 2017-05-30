package com.cocal.service.common;

import com.cocal.model.MockEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Cocal on 2017/5/30.
 */
@Repository
public interface MockEntityRepository extends MongoRepository<MockEntity, String> {
}
