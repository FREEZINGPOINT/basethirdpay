package com.guoshang.basepay.util;

import com.google.gson.Gson;
import com.guoshang.basepay.dto.ResponseResult;
import com.mchange.v1.util.ArrayUtils;
import io.protostuff.LinkedBuffer;
import io.protostuff.ProtostuffIOUtil;
import io.protostuff.runtime.RuntimeSchema;
import org.apache.ibatis.annotations.Case;

import java.util.List;

/**
 * @Author :zlg
 * @Description :序列化的基本操作
 * @Date : Create in 2017/10/12  下午5:05
 * @Modified By :
 */
public class ObjectSerializableByProtostuff {


    /**
     * @param object
     * @param T
     * @return
     */
    public static byte[] objectSerializable(Object object, Class T) {
        RuntimeSchema schema = RuntimeSchema.createFrom(T);
        return ProtostuffIOUtil.toByteArray(object, schema, LinkedBuffer.allocate(LinkedBuffer.DEFAULT_BUFFER_SIZE));
    }


    /**
     * @param bytes
     * @param t
     * @param <T>
     * @return
     */
    public static <T> T deObjectSerializable(byte[] bytes, Class<T> t) {
        RuntimeSchema schema = RuntimeSchema.createFrom(t);
        Object object = schema.newMessage();
        ProtostuffIOUtil.mergeFrom(bytes, object, schema);

        return (T) object;

    }


    public static void main(String[] args) {

        ResponseResult successResult = ResponseResult.createSuccessResult();
        byte[] bytes = objectSerializable(successResult, ResponseResult.class);
        System.out.println(ArrayUtils.toString(bytes));

        ResponseResult responseResult = deObjectSerializable(bytes, ResponseResult.class);
        Gson gson = new Gson();

        System.out.println(gson.toJson(responseResult));
    }
}
