package Week8.Task2;

import java.lang.reflect.Method;
import java.util.*;


public class Start {
    public static void main(String[] args) throws Exception{
        List<Float> numbers = new ArrayList<>();
        numbers.add(1.5f);
        numbers.add(2.8f);
        numbers.add(3.14f);
        numbers.add(4.2f);
        numbers.add(5.9f);
        numbers.add(6.7f);

        Student ahmed = new Student("Ahmed", 12486, numbers);
        GradeAnalyzer analyzer = new GradeAnalyzer(ahmed.getGrades());

        Method[] methods = analyzer.getClass().getDeclaredMethods();

        for(Method method: methods){
            if(method.getName().startsWith("calculate")||method.getName().startsWith("print")){
                System.out.println("The name of Method is: " + method.getName() + ", the result: "+ method.invoke(analyzer));
            }
        }
    }
}
