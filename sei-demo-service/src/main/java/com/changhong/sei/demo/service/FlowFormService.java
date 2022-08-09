package com.changhong.sei.demo.service;

import com.changhong.sei.core.dao.BaseEntityDao;
import com.changhong.sei.core.dto.ResultData;
import com.changhong.sei.core.dto.flow.Executor;
import com.changhong.sei.core.service.BaseEntityService;
import com.changhong.sei.core.service.bo.OperateResultWithData;
import com.changhong.sei.demo.dao.FlowFormDao;
import com.changhong.sei.demo.entity.FlowForm;
import com.changhong.sei.demo.flow.BaseFlowEntityService;
import com.changhong.sei.serial.sdk.SerialService;
import com.google.common.collect.Lists;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * 流程表单(FlowForm)业务逻辑实现类
 *
 * @author sei
 * @since 2022-04-12 11:02:45
 */
@Service
public class FlowFormService extends BaseFlowEntityService<FlowForm> {
    @Autowired
    private FlowFormDao dao;

    @Override
    protected BaseEntityDao<FlowForm> getDao() {
        return dao;
    }

    @Autowired(required = false)
    private SerialService serialService;

    @Override
    protected OperateResultWithData<FlowForm> preInsert(FlowForm entity) {
        entity.setCode(serialService.getNumber(entity.getClass()));
        return super.preInsert(entity);
    }

    //    public ResultData<List<Executor>> getSaleLeader(String id) {
//        ProjectBaseInfo info = this.findOne(id);
//        ResultData<List<PositionCategoryDto>> result = positionCategoryApi.findAllUnfrozen();
//        if (result.successful()) {
//            List<PositionCategoryDto> postionList = result.getData();
//            for (PositionCategoryDto positionCategoryDto : postionList) {
//                if (positionCategoryDto.getCode().equals(positionCategory)) {
//                    FindExecutorByPositionCateParam queryParam = new FindExecutorByPositionCateParam();
//                    queryParam.setOrgId(info.getOrganizationId());
//                    queryParam.setPostCatIds(Lists.newArrayList(positionCategoryDto.getId()));
//                    ResultData<List<Executor>> projectLeader = positionApi.getExecutorsByPostCatAndOrgToRoot(queryParam);
//                    ResultData<List<Executor>> saleLeader = ResultData.success(Lists.newArrayList());
//                    if (StringUtils.isNotBlank(info.getSaleOrganizationId())) {
//                        queryParam.setOrgId(info.getSaleOrganizationId());
//                        queryParam.setPostCatIds(Lists.newArrayList(positionCategoryDto.getId()));
//                        saleLeader = positionApi.getExecutorsByPostCatAndOrgToRoot(queryParam);
//                        if (!saleLeader.successful()) {
//                            return saleLeader;
//                        }
//                    }
//                    if (!projectLeader.successful()) {
//                        return projectLeader;
//                    }
//                    saleLeader.getData().addAll(projectLeader.getData());
//                    return saleLeader;
//                }
//            }
//        }
//        return ResultData.fail("未找到执行人");
//    }

}
