package com.guoshang.basepay.constant;

import org.apache.commons.lang.StringUtils;

/**
 * @Author :zlg
 * @Description : 对返回的code进行统一
 * @Date : Create in 2017/10/12  上午10:54
 * @Modified By :
 */
public enum ResponseCodeForRespResu {
    SUCCESS_CODE(200, "操作成功"), ERROR_CODE(500, "操作失败");

    private int responseCode;
    private String msg;

    ResponseCodeForRespResu(int responseCode, String msg) {
        this.responseCode = responseCode;
        this.msg = msg;
    }

    public int getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(int responseCode) {
        this.responseCode = responseCode;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    /**
     * @param responseCode 响应码
     * @return
     */
    public static ResponseCodeForRespResu getResponseCodeForRespResuByCode(int responseCode) {
        for (ResponseCodeForRespResu r : values()) {
            if (responseCode == r.getResponseCode()) {
                return r;
            }
        }
        return null;
    }


}


