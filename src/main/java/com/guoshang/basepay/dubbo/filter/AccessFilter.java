package com.guoshang.basepay.dubbo.filter;

import com.alibaba.dubbo.rpc.*;
import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

/**
 * @Author :zlg
 * @Description :  访问控制的过滤器
 * @Date : Create in 2017/10/12  下午3:21
 * @Modified By :
 */
@Slf4j
public class AccessFilter implements Filter {
    @Override
    public Result invoke(Invoker<?> invoker, Invocation invocation) throws RpcException {

        /**
         * start time
         */
        long startTime = System.currentTimeMillis();

        /**
         * 获取到请求的IP
         */
        String ip = RpcContext.getContext().getRemoteHost();

        /**
         * 接口的名称
         */
        String acc_interface = invoker.getInterface().toString();

        /**
         * 请求的参数
         */
        String args = Arrays.toString(invocation.getArguments());

        /**
         * 方法名称
         */
        String methodName = invocation.getMethodName();

        log.info("[ip=" + ip + "][interface=" + acc_interface + "][method=" + methodName + "][args=" + args + "]");

        Result result = invoker.invoke(invocation);


        /**
         * end time
         */
        long endTime = System.currentTimeMillis();

        log.info("[interface=" + acc_interface + "][method=" + methodName + "][args=" + args + "][ operation time=" + (endTime - startTime) + "][result=" + result + "]");

        return result;
    }
}
