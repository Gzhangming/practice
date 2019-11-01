package com.gzhangming.apartment.practice.business.a_jspTest.web;//
//                            _ooOoo_
//                           o8888888o
//                           88" . "88
//                           (| -_- |)
//                           O\  =  /O
//                        ____/`---'\____
//                      .'  \\|     |//  `.
//                     /  \\|||  :  |||//  \
//                    /  _||||| -:- |||||-  \
//                    |   | \\\  -  /// |   |
//                    | \_|  ''\---/''  |   |
//                    \  .-\__  `-`  ___/-. /
//                  ___`. .'  /--.--\  `. . __
//               ."" '<  `.___\_<|>_/___.'  >'"".
//              | | :  `- \`.;`\ _ /`;.`/ - ` : | |
//              \  \ `-.   \_ __\ /__ _/   .-` /  /
//         ======`-.____`-.___\_____/___.-`____.-'======
//                            `=---='
//        ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
//                      佛祖保佑       永无BUG

import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Creator: zhang.jiaming
 * @CreationTime: 2019-11-01 13:56
 * @Description: jsp页面测试
 **/

@Controller
public class jspController {


    @RequestMapping(value = "index", method = RequestMethod.GET)
//  @ApiOperation(value = “接口说明”, httpMethod = “接口请求方式”, response = “接口返回参数类型”, notes = “接口发布说明”）；
    @ApiOperation(value = "接口说明", notes = "接口发布说明")
    public String index(){
        return "index";
    }


}
