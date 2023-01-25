package Ex1;

import java.lang.reflect.*;
import java.util.Arrays;

public class Application {
    private static Class[] interfaces;

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {

        Class<Person> pc = Person.class;

        //get name
        String nameOfClass = pc.getName();
        System.out.println(nameOfClass);

        String space = "------------------";
        System.out.println(space);

        String simpleName = pc.getSimpleName();
        System.out.println(simpleName);

        System.out.println(space);

        // get modifier
        int modifier = pc.getModifiers();
        String modifierText = Modifier.toString(modifier);
        System.out.println(modifierText + " = " + modifier);

        System.out.println(space);

        System.out.println("Modifier is private = " + Modifier.isPrivate(modifier));
        System.out.println("Modifier is public = " + Modifier.isPublic(modifier));
        System.out.println("Modifier is static = " + Modifier.isStatic(modifier));

        System.out.println(space);

        Package aPackage = pc.getPackage();
        System.out.println(aPackage);

        System.out.println(space);

        String packageName = pc.getPackageName();
        System.out.println(packageName);

        System.out.println(space);

        Class superclass = pc.getSuperclass();
        System.out.println(superclass);

        System.out.println(space);

        Class[] interfaces = pc.getInterfaces();
        System.out.println(interfaces);

        System.out.println(space);

        Type[] genericInterfaces = pc.getGenericInterfaces();
        System.out.println(Arrays.toString(genericInterfaces));


        System.out.println(space);

        Field[] fields = pc.getFields();
        for (int i = 0; i < fields.length; i++) {
            Field field = fields[i];
            System.out.println(field);
        }

        System.out.println(space);

        fields = pc.getDeclaredFields();
        for (int i = 0; i < fields.length; i++) {
            Field field = fields[i];
            System.out.println(field);
        }

        System.out.println(space);

        Constructor<Person> singleC = pc.getConstructor(int.class, String.class);
        Person singleInst = singleC.newInstance(44,"Mark");
        System.out.println(singleInst);

        System.out.println(space);

        Field ageF = pc.getField("age");
        ageF.set(singleInst,22);
        System.out.println(singleInst);

    }
}
