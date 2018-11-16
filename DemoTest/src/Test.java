/**
 * Copyright (C),2018, XXX有限公司
 * FileName: Test
 * Author:   WangShouLi(Jacky)
 * Date:     2018/11/16 15:49
 * Description: ${DESCRIPTION}
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
public class Test {
    public static void main(String[] args) {
       Shape ro= new Rhomboid();
       ro.rotate(ro);
       if(ro instanceof Circle) {
           Circle draw = (Circle) ro;
           draw.draw();
       }else{
           ro.draw();
       }
    }
    public static void rotate(Shape c){
       if(!(c instanceof  Circle)){
           System.out.println("不是圆形");
           c.draw();
       }
    }
}
