package com.changhong.sei.demo.controller;

import com.changhong.sei.core.test.BaseUnitTest;
import com.changhong.sei.demo.dto.FlowFormDto;
import com.changhong.sei.demo.entity.FlowForm;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

public class FlowFormControllerTest extends BaseUnitTest {

    @Autowired
    private FlowFormController controller;

    @Test
    public void save() {
        FlowFormDto flowForm = new FlowFormDto();
        flowForm.setProjectName("测试项目");
        flowForm.setShortName("测试");
        flowForm.setOrganizationCode("1231") ;
        flowForm.setOrganizationId("877035BF-A40C-11E7-A8B9-02420B99179E");
        flowForm.setOrganizationName("name");
        controller.save(flowForm);
    }

}