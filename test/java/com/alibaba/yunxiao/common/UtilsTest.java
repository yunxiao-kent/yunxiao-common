package com.alibaba.yunxiao.common;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class UtilsTest {

    @Test
    public void concat() {
        String first ="Yunxiao";
        String second = "@Alibaba";

        Utils utils = new Utils();
        String concat = utils.concat(first, second);

        assertThat(concat, is("Yunxiao@Alibaba"));
    }

}