/*
* Copyright 2017 SAIC General Motors Corporation Ltd. All Rights Reserved.
*
* This software is published under the terms of the SGM Software
* License version 1.0, a copy of which has been included with this
* distribution in the LICENSE.txt file.
*
* @Project Name : design-pattern
*
* @File name : ChineseCenter.java
*
* @Author : s8xriw
*
* @Date : 2017年12月4日
*
----------------------------------------------------------------------------------
*     Date       Who       Version     Comments
* 1. 2017年12月4日    s8xriw    1.0
*
*
*
*
----------------------------------------------------------------------------------
*/

package com.troytan.structure.adapter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * TODO description
 * 
 * @author s8xriw
 * @date 2017年12月4日
 */

public class ChineseCenter {

    private String name;

    public void jingong() {
        System.out.println(String.format("中国中锋%s进攻", name));
        List<String> list = new ArrayList<>();
        Iterator<String> iterator = list.iterator();
    }

    public void fangshou() {
        System.out.println(String.format("中国中锋%s防守", name));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
