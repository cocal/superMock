package com.cocal.service.resolver;

import com.cocal.model.MockEntity;

import java.util.Optional;

/**
 * Created by cocal on 2017/6/6.
 */
public interface BaseResolverService<T> {

    public String getCode();


    public Optional<T> getMockResponse(T t, MockEntity mockEntity);

}
