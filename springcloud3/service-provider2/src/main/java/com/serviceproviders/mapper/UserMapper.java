package com.serviceproviders.mapper;


import com.serviceproviders.pojo.User;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

@org.apache.ibatis.annotations.Mapper
public interface UserMapper extends Mapper<User> {
    @Select("select * from xf_user where id<#{id}")
    public List<User> selectTwoPeople(Long id);
}
