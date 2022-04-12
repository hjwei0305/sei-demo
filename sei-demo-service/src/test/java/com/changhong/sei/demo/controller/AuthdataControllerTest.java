package com.changhong.sei.demo.controller;

import com.changhong.sei.core.test.BaseUnitTest;
import com.changhong.sei.demo.dto.AuthdataDto;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

public class AuthdataControllerTest extends BaseUnitTest {
    @Autowired
    private AuthdataController authdataController;

    @Test
    public void save(){
        AuthdataDto dto = new AuthdataDto();
        dto.setName("test");
        authdataController.save(dto);
    }

    @Test
    public void findByCode(){
        authdataController.findByCode("202204000014");
    }

}