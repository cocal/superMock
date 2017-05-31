package com.cocal.service.resolver;

import java.util.Map;
import java.util.Optional;

/**
 * Created by cocal on 2017/5/31.
 */
@FunctionalInterface
public interface TempSelfResolver {

    default String getCode(){
        return "tempResover";
    };

    Optional<Map<String,String>> mergeByRequest(Map<String,String> srcMap,String temp);
}
