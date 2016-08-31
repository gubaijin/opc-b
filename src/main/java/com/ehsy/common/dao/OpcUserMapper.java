package com.ehsy.common.dao;

import com.ehsy.common.model.OpcUser;
import com.ehsy.common.model.OpcUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OpcUserMapper {
    int countByExample(OpcUserExample example);

    int deleteByExample(OpcUserExample example);

    int deleteByPrimaryKey(String id);

    int insert(OpcUser record);

    int insertSelective(OpcUser record);

    List<OpcUser> selectByExample(OpcUserExample example);

    OpcUser selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") OpcUser record, @Param("example") OpcUserExample example);

    int updateByExample(@Param("record") OpcUser record, @Param("example") OpcUserExample example);

    int updateByPrimaryKeySelective(OpcUser record);

    int updateByPrimaryKey(OpcUser record);
}