package com.gzhangming.apartment.practice.business.a_dataTest.web;

import com.gzhangming.apartment.practice.business.a_dataTest.dto.arg.UserCeshiInsert;
import com.gzhangming.apartment.practice.business.a_dataTest.dto.arg.UserCeshiSearch;
import com.gzhangming.apartment.practice.business.a_dataTest.dto.arg.UserCeshiUpdate;
import com.gzhangming.apartment.practice.business.a_dataTest.dto.vo.UserCeshiVo;
import com.gzhangming.apartment.practice.business.a_dataTest.entity.UserCeshi;
import com.gzhangming.apartment.practice.business.a_dataTest.service.UserCeshiService;
import com.qiyuesuo.pdf.text.pdf.T;
import hans.common.aspect.Log;
import hans.common.exception.ParameterMissException;
import hans.common.persistence.ResponseVo;
import hans.common.persistence.dto.BaseDto;
import hans.common.persistence.dto.IdsDto;
import hans.common.persistence.entity.PageInfo;
import hans.common.persistence.web.BaseController;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.MediaType;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.List;

/**
 * Controller
 * @author zjm
 * @Date 2019-09-27 15:17:49
 */
@RestController
@RequestMapping("/userCeshi")
@Api(tags = "", description = "", produces= MediaType.APPLICATION_JSON_VALUE)
public class UserCeshiController extends BaseController {

    private final String PREFIX = "/userCeshi/";
    private final String CN_PREFIX = "";

    @Resource
    private UserCeshiService userCeshiService;

    /**
    * @Description: 单条查询 (重写)
    * @url:
    * @Param:
    * @return:
    * @Author: zhang.jiaming
    * @Date: 2019/9/27
    */
    @GetMapping(value = "getList")
    @ApiOperation(value = "单条查询（重写） -- 张家明", httpMethod = GET, notes = auth_yes)
    @Log(description = "单条查询（重写） -- 张家明", logType = log_select, url = PREFIX + "userButton")
    public ResponseVo<T> getList(@Valid BaseDto baseDto, BindingResult bindingResult)throws ParameterMissException{
        checkBinding(bindingResult);
        return userCeshiService.getList(baseDto.getId());
    }




    /**
     * 分页查询
     * @param userCeshiSearch
     * @url /userCeshi/page
     * @return
     */
    @GetMapping(value = page)
    @ApiOperation(value = page_Ch, httpMethod = GET, notes = auth_yes)
    @Log(description = CN_PREFIX + page_Ch, logType = log_select, url = PREFIX + page)
    public ResponseVo<PageInfo<UserCeshiVo>> page(@Valid UserCeshiSearch userCeshiSearch) {

        return userCeshiService.page(userCeshiSearch.getPageNo(), userCeshiSearch.getPageSize(), userCeshiSearch.toUserCeshi());
    }

    /**
     * 列表查询
     * @param userCeshiSearch
     * @url /userCeshi/list
     * @return
     */
    @GetMapping(value = list)
    @ApiOperation(value = list_Ch, httpMethod = GET, notes = auth_yes)
    @Log(description = CN_PREFIX + list_Ch, logType = log_select, url = PREFIX + list)
    public ResponseVo<List<UserCeshiVo>> list(@Valid UserCeshiSearch userCeshiSearch) {

        return userCeshiService.list(userCeshiSearch.toUserCeshi());
    }

    /**
     * 单条查询
     * @param baseDto
     * @param bindingResult
     * @url /userCeshi/single
     * @return
     * @throws ParameterMissException
     */
    @GetMapping(value = single)
    @ApiOperation(value = single_Ch, httpMethod = GET, notes = auth_yes)
    @Log(description = CN_PREFIX + single_Ch, logType = log_select, url = PREFIX + single)
    public ResponseVo<UserCeshiVo> single(@Valid BaseDto baseDto, BindingResult bindingResult) throws ParameterMissException{
        checkBinding(bindingResult);
        return userCeshiService.single(baseDto.getId());
    }

    /**
     * 新增
     * @param userCeshiInsert
     * @param bindingResult
     * @url /userCeshi/add
     * @return
     * @throws ParameterMissException
     */
    @PostMapping(value = add)
    @ApiOperation(value = add_Ch, httpMethod = POST, notes = auth_yes)
    @Log(description = CN_PREFIX + add_Ch, logType = log_insert, url = PREFIX + add)
    public ResponseVo<Integer> add(@RequestBody @Valid UserCeshiInsert userCeshiInsert, BindingResult bindingResult) throws ParameterMissException{
        checkBinding(bindingResult);
        return userCeshiService.add(userCeshiInsert.toUserCeshi());
    }

    /**
     * 修改
     * @param userCeshiUpdate
     * @param bindingResult
     * @url /userCeshi/update
     * @return
     * @throws ParameterMissException
     */
    @PostMapping(value = update)
    @ApiOperation(value = update_Ch, httpMethod = POST, notes = auth_yes)
    @Log(description = CN_PREFIX + update_Ch, logType = log_update, url = PREFIX + update)
    public ResponseVo<Integer> update(@RequestBody @Valid UserCeshiUpdate userCeshiUpdate, BindingResult bindingResult) throws ParameterMissException{
        checkBinding(bindingResult);
        return userCeshiService.update(userCeshiUpdate.toUserCeshi());
    }

    /**
     * 删除
     * @param idsDto
     * @param bindingResult
     * @url /userCeshi/delete
     * @return
     * @throws ParameterMissException
     */
    @PostMapping(value = delete)
    @ApiOperation(value = delete_Ch, httpMethod = POST, notes = auth_yes)
    @Log(description = CN_PREFIX + delete_Ch, logType = log_delete, url = PREFIX + delete)
    public ResponseVo<Integer> delete(@RequestBody @Valid IdsDto idsDto, BindingResult bindingResult) throws ParameterMissException{
        checkBinding(bindingResult);
        return userCeshiService.delete(idsDto.getIds());
    }



}
