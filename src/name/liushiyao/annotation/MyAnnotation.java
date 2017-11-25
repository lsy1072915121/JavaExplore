package name.liushiyao.annotation;

import java.lang.annotation.*;

/**
 * Created by 北岭山下 on 2017/7/18.
 */
/*
                        注解支持的类型：
                                      1.所有基本数据类型（int,float,boolean,byte,double,char,long,short)
        　　　　                2.String类型
        　　　　                3.Class类型
                                　  4.enum类型
        　　　　                5.Annotation类型
        　　　　                6.以上所有类型的数组
                        注解参数定义：
                              第一,只能用public或默认(default)这两个访问权修饰.
                                        例如,String value();这里把方法设为defaul默认类型；　 　
　　                      第二,参数成员只能用基本类型byte,short,char,int,long,float,double,boolean八种基本数据类型
                                        和 String,Enum,Class,annotations等数据类型,以及这一些类型的数组.
                                        例如,String value();这里的参数成员就为String;　　
　　                      第三,如果只有一个参数成员,最好把参数名称设为"value",后加小括号.
                                        例:下面的例子FruitName注解就只有一个参数成员。
                        注解元素的默认值：
　　                       注解元素必须有确定的值，要么在定义注解的默认值中指定，要么在使用注解时指定，
                                非基本类型的注解元素的值不可为null。因此, 使用空字符串或0作为默认值是一种常用的做法。
                                这个约束使得处理器很难表现一个元素的存在或缺失的状态，因为每个注解的声明中，
                                所有元素都存在，并且都具有相应的值，为了绕开这个约束，我们只能定义一些特殊的值，
                                例如空字符串或者负数，一次表示某个元素不存在，在定义注解时，这已经成为一个习惯用法。

 */

public @interface MyAnnotation {

        /***********注解声明***************/

        /**
         * 水果名称注解
         * @author peida
         */
        @Target ( ElementType.FIELD )                                                             //类的成员变量定义
        @Retention ( RetentionPolicy.RUNTIME )
        @Documented
        public @interface FruitName {
                String value ( ) default "";            //参数只有一个时，通常把参数设为value，并在后面添加“()”
        }



        /**
         * 水果颜色注解
         * @author peida
         *
         */
        @Target ( ElementType.FIELD )
        @Retention ( RetentionPolicy.RUNTIME )
        @Documented
        public @interface FruitColor {
                /**
                 * 颜色枚举
                 * @author peida
                 *
                 */
                enum Color {
                        BULE, RED, GREEN
                }

                ;

                /**
                 * 颜色属性
                 * @return
                 */
                Color fruitColor ( ) default Color.GREEN;
        }

        /**
         * 水果供应者注解
         * @author peida
         *
         */
        @Target ( ElementType.FIELD )
        @Retention ( RetentionPolicy.RUNTIME )
        @Documented
        public @interface FruitProvider {
                /**
                 * 供应商编号
                 * @return
                 */
                int id ( ) default - 1;

                /**
                 * 供应商名称
                 * @return
                 */
                public String name ( ) default "";

                /**
                 * 供应商地址
                 * @return
                 */
                String address ( ) default "";
        }

}
