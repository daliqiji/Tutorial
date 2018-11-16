/**
 * Copyright (C),2018, XXX有限公司
 * FileName: RecognizeObjectOrArrayMe
 * Author:   WangShouLi(Jacky)
 * Date:     2018/11/16 16:04
 * Description: ${DESCRIPTION}
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
public class RecognizeObjectOrArrayMe {
    public static void main(String[] args) {
        Integer in=new Integer(1);
        char[]cha={'a','b'};
        if(isArray(cha)){
            System.out.println("是数组");
        }else if (isObject(cha)){
            System.out.println("是对象");
        }else{
            System.out.println("既不是数组也不是对象");
        }
    }
    public static boolean isArray(char[]c){
        try {
            c.getClass().newInstance();
            return false;
        } catch (InstantiationException e) {
            return true;
        } catch (IllegalAccessException e) {
            return true;
        }
    }
    public static boolean isObject(char[]chars){
        try {
            chars.getClass().newInstance();
            return true;
        } catch (InstantiationException e) {
            return false;
        } catch (IllegalAccessException e) {
            return false;
        }
    }
}
