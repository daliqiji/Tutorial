/**
 * Copyright (C),2018, XXX有限公司
 * FileName: Rhomboid
 * Author:   WangShouLi(Jacky)
 * Date:     2018/11/16 15:50
 * Description: ${DESCRIPTION}
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
public class Rhomboid implements Shape {
    @Override
    public void draw() {
        System.out.println("This is Rhomboid");
    }

    @Override
    public void rotate(Shape s) {
        System.out.println("rotate");
    }
}
