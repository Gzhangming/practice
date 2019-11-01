package com.gzhangming.apartment.practice.business.commonality.generating.util;
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

/**
 * @Creator: zhang.jiaming
 * @CreationTime: 2019-10-08 14:52
 * @Description: 我自己的工具类  希望能逐步成长到比较完整的工具类
 **/

public class MyUtil {


    public static int findKeyWords(String arrayStrs,String arrayStr){
        int arrayCount=0;
        int index=-1;
        index=arrayStrs.indexOf(arrayStr);//查找指定字符或字符串在字符串中第一次出现地方的索引，未找到的情况返回 -1.
        while (index>=0){
            ++arrayCount;
            index+=arrayStr.length();
            index=arrayStrs.indexOf(arrayStr,index);
        }
        return arrayCount;
    }
}
