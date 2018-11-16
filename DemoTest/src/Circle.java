/**
 * Copyright (C),2018, XXX有限公司
 * FileName: Circle
 * Author:   WangShouLi(Jacky)
 * Date:     2018/11/16 15:49
 * Description: ${DESCRIPTION}
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
public class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("this is Circle");
    }

    @Override
    public void rotate(Shape s) {
        if(s instanceof Circle){
            System.out.println("不旋转");
        }
    }
}
