/**
 * Copyright (C),2018, XXX有限公司
 * FileName: ToyTest
 * Author:   WangShouLi(Jacky)
 * Date:     2018/11/16 14:48
 * Description: ${DESCRIPTION}
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
interface HasBatteries{}
interface Waterproof{}
interface Shoots{}
class Toy{
    Toy(){}
    Toy(int i){}
}
class FancyToy extends Toy implements HasBatteries,Waterproof,Shoots{
    FancyToy(){super(1);}
}
public class ToyTest {
    public static void printInfo(Class cc){
        System.out.println("Class name:" + cc.getName() + "is interface？["+cc.isInterface()+ "]");
        System.out.println("Simple name:"+cc.getSimpleName());
        System.out.println("Campmocal name:"+cc.getCanonicalName());
    }

    public static void main(String[] args) {
        Class c = null;
        try{
            c=Class.forName("FancyToy");
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("cant't find Fancytoy");
            System.exit(1);
        }
        printInfo(c);
        for(Class face:c.getInterfaces()){
            printInfo(face);
        }
        Class up=c.getSuperclass();
        Object obj=null;
        try {
            obj=up.newInstance();
        } catch (InstantiationException e) {
            System.out.println("can't create Instance");
            System.exit(1);
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            System.out.println("can't create Instance");
            System.exit(1);
            e.printStackTrace();
        }
        printInfo(obj.getClass());
    }
}
