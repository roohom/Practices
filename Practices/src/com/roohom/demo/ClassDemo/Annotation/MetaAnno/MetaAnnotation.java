package com.roohom.demo.ClassDemo.Annotation.MetaAnno;

/**
 * ClassName: MetaAnnotation
 * Author: Roohom
 * Function:元注解
 * Date: 2020/8/5 15:02
 * Software: IntelliJ IDEA
 */
@Student(name="hijack")
public class MetaAnnotation {

    @Student(name = "唐老鸭")
    public void show() {

    }

}
