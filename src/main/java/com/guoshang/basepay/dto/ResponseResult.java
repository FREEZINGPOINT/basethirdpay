package com.guoshang.basepay.dto;

import com.guoshang.basepay.constant.ResponseCodeForRespResu;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.Serializable;

/**
 * @Author :zlg
 * @Description : 统一的返回的结果
 * @Date : Create in 2017/10/12  上午10:47
 * @Modified By :
 */
public class ResponseResult<D> implements Serializable {


    private int respCode;
    private String message;
    private D data;

    private ResponseResult() {
    }


    private ResponseResult(int respCode, String message) {
        this.respCode = respCode;
        this.message = message;
    }


    private ResponseResult(int respCode, D data) {
        this.respCode = respCode;
        this.data = data;
    }

    private ResponseResult(int respCode, String message, D data) {
        this.respCode = respCode;
        this.message = message;
        this.data = data;
    }
    /**
     * 进行创建成功的与失败的基本操作
     */

    /**
     * 返回默认的成功对象
     *
     * @return
     */
    public static ResponseResult createSuccessResult() {
        return new ResponseResult(ResponseCodeForRespResu.SUCCESS_CODE.getResponseCode(),
                ResponseCodeForRespResu.SUCCESS_CODE.getMsg());
    }


    /**
     * 返回带有特定信息的成功对象
     *
     * @return
     */
    public static ResponseResult createSuccessResult(String message) {
        return new ResponseResult(ResponseCodeForRespResu.SUCCESS_CODE.getResponseCode(), message);
    }

    /**
     * 返回带有数据的成功对象
     *
     * @param data
     * @param <D>
     * @return
     */
    public static <D> ResponseResult createSuccessResult(D data) {
        return new ResponseResult(ResponseCodeForRespResu.SUCCESS_CODE.getResponseCode(), data);
    }

    /**
     * @param message 返回的信息
     * @param data    返回的数据
     * @param <D>
     * @return
     */
    public static <D> ResponseResult createSuccessResult(String message, D data) {
        return new ResponseResult(ResponseCodeForRespResu.SUCCESS_CODE.getResponseCode(), message, data);
    }


    /**
     * 返回默认的失败对象
     *
     * @return
     */
    public static ResponseResult createFailResult() {
        return new ResponseResult(ResponseCodeForRespResu.ERROR_CODE.getResponseCode(),
                ResponseCodeForRespResu.ERROR_CODE.getMsg());
    }


    /**
     * 返回带有特定信息的失败对象
     *
     * @return
     */
    public static ResponseResult createFailResult(String message) {
        return new ResponseResult(ResponseCodeForRespResu.ERROR_CODE.getResponseCode(), message);
    }

    /**
     * 返回带有数据的失败对象
     *
     * @param data
     * @param <D>
     * @return
     */
    public static <D> ResponseResult createFailResult(D data) {
        return new ResponseResult(ResponseCodeForRespResu.ERROR_CODE.getResponseCode(), data);
    }

    /**
     * @param message 返回的信息
     * @param data    返回的数据
     * @param <D>
     * @return
     */
    public static <D> ResponseResult createFailResult(String message, D data) {
        return new ResponseResult(ResponseCodeForRespResu.ERROR_CODE.getResponseCode(), message, data);
    }


}
