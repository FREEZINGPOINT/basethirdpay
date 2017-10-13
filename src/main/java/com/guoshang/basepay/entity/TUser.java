package com.guoshang.basepay.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author :zlg
 * @Description :
 * @Date : Create in 2017/10/12  下午1:43
 * @Modified By :
 */
@Data
public class TUser implements Serializable {

    private int id;
    private String name;
    private int age;

}
