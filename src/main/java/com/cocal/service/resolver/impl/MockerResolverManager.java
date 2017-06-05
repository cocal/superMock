package com.cocal.service.resolver.impl;

import com.cocal.service.resolver.BaseResolverService;
import com.fasterxml.jackson.databind.ser.Serializers;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by cocal on 2017/5/31.
 */
public class MockerResolverManager {

    public final static Map<String,BaseResolverService> resolvers = new ConcurrentHashMap<>();

    public void putResolver(String code, BaseResolverService baseResolverService){
        resolvers.put(code,baseResolverService);
    };
}
