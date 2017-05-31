package com.cocal.common.dto;

import com.cocal.model.MockEntity;

/**
 * Created by cocal on 2017/5/31.
 */
public class MokerConstDto {

    public final static MockEntity notExist;

    static {
        notExist = new MockEntity();
        notExist.setOriUrl("/err");
    }
}
