package com.ehsy.common.service.impl;

import com.ehsy.common.dao.OpcUserMapper;
import com.ehsy.common.model.OpcUser;
import com.ehsy.common.service.OpcUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by ehsy_it on 2016/8/29.
 */
@Service
public class OpcUserServiceImpl implements OpcUserService {

    @Autowired
    private OpcUserMapper opcUserMapper;

    @Override
    public OpcUser getUserInfoById(String id) {
        return opcUserMapper.selectByPrimaryKey(id);
    }
}
