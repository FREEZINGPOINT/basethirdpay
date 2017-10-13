package com.guoshang.basepay.service.impl;

import com.guoshang.basepay.entity.TUser;
import com.guoshang.basepay.mapper.TUserMapper;
import com.guoshang.basepay.service.TUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author :zlg
 * @Description :
 * @Date : Create in 2017/10/12  下午1:54
 * @Modified By :
 */
@Service("tUserService")
public class TUserServiceImpl implements TUserService {

    @Resource
    TUserMapper tUserMapper;
    @Override
    public List<TUser> findAllUser() {
        System.out.println("is can run");
        return tUserMapper.findAllTUser();
    }
}
