package codecatcher.snippets;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.TypeVariable;


public class ClassUtil<T> {

    public static void getClassInfo(Class<?> myClass) {

        System.out.println("Class name: \t\t" + myClass.getName());
        System.out.println("Class Superclass: \t" + myClass.getSuperclass());
        System.out.println("Class methods: ");
        Method[] methodArr = myClass.getDeclaredMethods();
        for (int i = 0; i < methodArr.length; i++) {
            System.out.println(" * " + methodArr[i]);
        }
        System.out.println("Class constructors: ");
        Constructor[] constructArr = myClass.getConstructors();
        for (int i = 0; i < constructArr.length; i++) {
            System.out.println(" * " + constructArr[i]);
        }
        System.out.println("Class typeparameters: ");
        TypeVariable<? extends Class<?>>[] typeParameterArr = myClass.getTypeParameters();
        if (typeParameterArr.length > 0) {
            for (int i = 0; i < typeParameterArr.length; i++) {
                System.out.println(" * " + typeParameterArr[i]);
            }
        } else {
            System.out.println(" * null");
        }
    }

    public static void main(String[] args) {

        // Create an object of type class from which information should be gathered
        Class<?> myClass = ClassUtil.class;
        // Call method to print out the information belonging to this class object
        getClassInfo(myClass);
    }
}
