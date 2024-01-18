package OOPS.Annotation;
import java.lang.annotation.*;
import java.lang.reflect.Method;

public class AnnotationProcessor {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        Method[] methods = MyClass.class.getMethods();

        for (Method method : methods) {
            MethodInfo methodInfo = method.getAnnotation(MethodInfo.class);
            if (methodInfo != null) {
                System.out.println("Method: " + method.getName());
                System.out.println("Author: " + methodInfo.author());
                System.out.println("Date: " + methodInfo.date());
                System.out.println("Description: " + methodInfo.description());
                System.out.println("Version: " + methodInfo.version());
                System.out.println();
            }
        }
    }
}