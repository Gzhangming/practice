package com.gzhangming.apartment.practice.commonality;//
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

import com.baomidou.mybatisplus.generator.config.rules.DbType;
import com.gzhangming.apartment.practice.business.commonality.generating.DataSourceConfig;
import com.gzhangming.apartment.practice.business.commonality.generating.config.TempConfig;
import com.gzhangming.apartment.practice.business.commonality.generating.config.TemplateEngine;
import org.junit.Test;

/**
 * @Creator: zhang.jiaming
 * @CreationTime: 2019-09-26 10:50
 * @Description: 代码生成工具
 **/

public class AppTest {
     /**
     * beetl模板引擎 代码生成
     */
     @Test
     public void BeetTemplateEngine(){
         DataSourceConfig dataSourceConfig = new DataSourceConfig();
         dataSourceConfig.setDbType(DbType.MYSQL);
         dataSourceConfig.setDriverName("com.mysql.cj.jdbc.Driver");
         dataSourceConfig.setUsername("root");
         dataSourceConfig.setPassword("Gzhangming_1");
         dataSourceConfig.setUrl("jdbc:mysql://47.106.244.254:3306/apartment_system_dev?characterEncoding=utf8&serverTimezone=UTC");

         TempConfig config = new TempConfig();// 包前缀
         //config.setModuleName("customer"); // 模块名称
         //config.setModuleName("community"); // 模块名称
         config.setProjectPath("C:\\fileCee");// 代码生成路径
         config.setModuleName("customer"); // 模块名称
         config.setModuleName("sys"); // 模块名称称
         config.setPrePackageName("com.smico.apartment.customer.business");   // 包前缀
         config.setTemplatePath("template/hans2");   // 模板路径
         config.setCover(true);  // 覆盖原有文件
         config.setAuthor("zjm"); //作者

//        生成community
         //configCommunity(config);
//       最后的配置
         configOrder(config);
//        生成customer
         //configcustomer(config);
//        house模块
         //house(config);
//        配置模板
         //configCustomer(config);

//         配置生成的模板
         configTemp(config);
// 配置导入的包
         addImport(config);

         TemplateEngine templateEngine = new TemplateEngine(dataSourceConfig, config);
         // 开始生成
         templateEngine.doHansGenerating(false);

     }






    /**
     * 配置order模块
     * @param config
     */
    public static void configOrder(TempConfig config) {
        config.setProjectPath("C:\\file");
        // 配置需要生成的表  若不配置默认生成所有
        config.getTableList().add("user_ceshi");
    }
    /**
     * 配置community模块
     * @param config
     */
    public static void configCommunity(TempConfig config) {
        config.setProjectPath("D:\\file");
        config.getTableList().add("community_building");
        config.getTableList().add("community_building_unit");
/*
        // 代码生成路径
        config.setProjectPath("D:\\下载\\代码生成");
        // 配置需要生成的表  若不配置默认生成所有
        config.getTableList().add("community_assort");
        config.getTableList().add("community_building");
        config.getTableList().add("community_building_unit");
        config.getTableList().add("community_house_type");
        config.getTableList().add("community_house_type_assort");
        config.getTableList().add("community_house_type_image");
        config.getTableList().add("community_image");
        config.getTableList().add("community_info");
        config.getTableList().add("community_price_policy_detail");
        config.getTableList().add("community_pricepolicy");
        config.getTableList().add("base_data_info");
        config.getTableList().add("store_info");
*/

    }
    /**
     * 配置customer模块
     * @param config
     */
    public static void configcustomer(TempConfig config) {
        // 代码生成路径
        config.setProjectPath("D:\\file");
        // 配置需要生成的表  若不配置默认生成所有
        //config.getTableList().add("leave_record");
        config.getTableList().add("customer_bill");
        config.getTableList().add("customer_bill_detail");
//        config.getTableList().add("customer_integral_record");
//        config.getTableList().add("customer_invoice_apply");
//        config.getTableList().add("customer_invoice_detail");
//        config.getTableList().add("customer_proposal");
        //config.getTableList().add("customer_relationship");
        //config.getTableList().add("leave_record");
        //config.getTableList().add("customer_record");
        //config.getTableList().add("customer_info");
        config.getTableList().add("customer_booking_showings");
        config.getTableList().add("customer_relationship");
        config.getTableList().add("customer_complaint");


        //config.getTableList().add("customer_house_info");
//        config.getTableList().add("community_price_policy");
    }




    /**
     * 配置生成的模板
     * @param config
     */
    public static void configTemp(TempConfig config){
        /** 配置生成的模板 */
        config.getTempMap().put("Controller.java.btl", "web");
        config.getTempMap().put("Service.java.btl", "service");
        config.getTempMap().put("ServiceImpl.java.btl", "service");
        config.getTempMap().put("Entity.java.btl", "entity");
        config.getTempMap().put("Vo.java.btl", "dto.vo");
        config.getTempMap().put("Insert.java.btl", "dto.arg");
        config.getTempMap().put("Update.java.btl", "dto.arg");
        config.getTempMap().put("Search.java.btl", "dto.arg");
        config.getTempMap().put("Dao.java.btl", "dao");
        config.getTempMap().put("Dao.xml.btl", "");
        config.getTempMap().put(".vue.btl", "");
        config.getTempMap().put(".js.btl", "");
    }

    /**
     * 添加需要导入的包
     * @param config
     */
    public static void addImport(TempConfig config) {
        // Controller import配置
        config.getControllerImports().add("hans.common.exception.ParameterMissException");
        config.getControllerImports().add("hans.common.persistence.ResponseVo");
        config.getControllerImports().add("hans.common.persistence.dto.BaseDto");
        config.getControllerImports().add("hans.common.persistence.dto.IdsDto");
        config.getControllerImports().add("hans.common.persistence.web.BaseController");
        config.getControllerImports().add("hans.common.aspect.Log");
        config.getControllerImports().add("hans.common.persistence.entity.PageInfo");

        // Service import配置
        config.getServiceImports().add("hans.common.persistence.ResponseVo");
        config.getServiceImports().add("hans.common.persistence.service.CrudService");

        // Entity import配置
        config.getEntityImports().add("hans.common.persistence.entity.DataEntity");

        // Vo import配置
        config.getVoImports().add("hans.common.persistence.dto.BaseVo");
        // insert import配置
        config.getInsertImports().add("javax.validation.constraints.NotBlank");
        config.getInsertImports().add("javax.validation.constraints.NotNull");
        config.getInsertImports().add("org.hibernate.validator.constraints.Length");

        // update import配置
        config.getUpdateImports().add("hans.common.persistence.dto.BaseDto");
        config.getUpdateImports().add("javax.validation.constraints.NotBlank");
        config.getUpdateImports().add("javax.validation.constraints.NotNull");
        config.getUpdateImports().add("org.hibernate.validator.constraints.Length");

        // Search import配置
        config.getSearchImports().add("hans.common.persistence.dto.BasePageDto");

        // Dao import配置
        config.getDaoImports().add("hans.common.persistence.dao.CrudDao");
        config.getDaoImports().add("org.springframework.format.annotation.DateTimeFormat");
    }


}
