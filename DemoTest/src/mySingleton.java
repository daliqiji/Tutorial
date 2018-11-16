/**
 * Copyright (C),2018, XXX有限公司
 * FileName: mySingleton
 * Author:   WangShouLi(Jacky)
 * Date:     2018/11/16 16:26
 * Description: ${DESCRIPTION}
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
public class mySingleton {
    private static mySingleton ourInstance = new mySingleton();

    public static mySingleton getInstance() {
        return ourInstance;
    }

    private mySingleton() {
    }
}
