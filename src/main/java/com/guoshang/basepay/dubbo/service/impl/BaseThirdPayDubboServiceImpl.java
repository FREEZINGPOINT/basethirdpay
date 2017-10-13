package com.guoshang.basepay.dubbo.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.guoshang.basepay.dto.ResponseResult;
import com.guoshang.basepay.dubbo.service.BaseThirdPayDubboService;
import com.guoshang.basepay.excetption.BasePayUniversalException;
import com.guoshang.basepay.service.TUserService;
import io.protostuff.LinkedBuffer;
import io.protostuff.ProtostuffIOUtil;
import io.protostuff.runtime.RuntimeSchema;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author :zlg
 * @Description :
 * @Date : Create in 2017/10/12  上午11:52
 * @Modified By :
 */
@Slf4j
public class BaseThirdPayDubboServiceImpl implements BaseThirdPayDubboService {

    @Resource(name = "tUserService")
    TUserService tUserService;
    @Override
    public String transferMoney() throws BasePayUniversalException {
        tUserService.findAllUser();
        System.out.println("com.guoshang.basepay.dubbo.service.impl.BaseThirdPayDubboServiceImpl");
        log.info("com.guoshang.basepay.dubbo.service.impl.BaseThirdPayDubboServiceImpl");
        Gson gson=new Gson();

        /**
         * 首先定义 schema
         */
        RuntimeSchema schema= RuntimeSchema.createFrom(ResponseResult.class);
        ResponseResult successResult = ResponseResult.createSuccessResult();
        byte[] bytes = ProtostuffIOUtil.toByteArray(successResult, schema, LinkedBuffer.allocate(LinkedBuffer.DEFAULT_BUFFER_SIZE));

        log.info(gson.toJson(bytes));

        return  gson.toJson(ResponseResult.createSuccessResult());
    }

    @Override
    public String transferMoney(String channelId, String channelOrderId, String detail) throws BasePayUniversalException {
        return null;
    }
}
