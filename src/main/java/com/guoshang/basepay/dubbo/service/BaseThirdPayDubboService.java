package com.guoshang.basepay.dubbo.service;

import com.guoshang.basepay.excetption.BasePayUniversalException;

/**
 * @Author :zlg
 * @Description :第三方的服务接口  统一进行处理   主要就是针对进行转账的基本的操作   实名认证  结果查询 查询限额 等操作
 * @Date : Create in 2017/10/12  上午10:45
 * @Modified By :
 */
public interface BaseThirdPayDubboService {

    /**
     * 转账的操作
     * @return 返回的是 ResponseResult(@See ResponseResult)进行json化的String
     * @throws BasePayUniversalException
     */
    String transferMoney() throws BasePayUniversalException;



    /**
     *
     * 单笔转账
     *
     * @param channelId
     *            调用方标识
     * @param channelOrderId
     *            调用方订单号
     * @param detail
     *            json字符串包括以下字段
     *            actName：收款人姓名(Y)，bankCode：卡银行(Y),actNo：卡号(Y),cardType：
     *            卡类型1借记卡2贷记卡3对公 ，amount：金额(Y),businessType 业务类型(Y),
     *            purpose:描述(Y)
     * @return
     * @throws BasePayUniversalException
     */
    String transferMoney(String channelId,String channelOrderId,String detail) throws BasePayUniversalException;









}
