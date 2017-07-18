package name.liushiyao.annotation;

import java.lang.annotation.*;

/**
 * Created by 北岭山下 on 2017/7/18.
 */


public @interface MyAnnotation {

        /***********注解声明***************/

        /**
         * 水果名称注解
         * @author peida
         */
        @Target (ElementType.FIELD)                                                             //类的成员变量定义
        @Retention (RetentionPolicy.RUNTIME)
        @Documented
        public @interface FruitName {
                String value() default "";
        }
        /**
         * 水果颜色注解
         * @author peida
         *
         */
        @Target(ElementType.FIELD)
        @Retention(RetentionPolicy.RUNTIME)
        @Documented
        public @interface FruitColor {
                /**
                 * 颜色枚举
                 * @author peida
                 *
                 */
                public enum Color{ BULE,RED,GREEN};
                /**
                 * 颜色属性
                 * @return
                 */
                Color fruitColor() default Color.GREEN;
        }

        /**
         * 水果供应者注解
         * @author peida
         *
         */
        @Target(ElementType.FIELD)
        @Retention(RetentionPolicy.RUNTIME)
        @Documented
        public @interface FruitProvider {
                /**
                 * 供应商编号
                 * @return
                 */
                public int id() default -1;

                /**
                 * 供应商名称
                 * @return
                 */
                public String name() default "";

                /**
                 * 供应商地址
                 * @return
                 */
                public String address() default "";
        }

}
