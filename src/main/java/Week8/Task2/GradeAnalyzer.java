package Week8.Task2;

import java.util.List;

public class GradeAnalyzer {
    private List<Float> grades;

    public GradeAnalyzer(List<Float> grades) {
        this.grades = grades;
    }

    public float calculateAverage(){
        float sum = 0;
        for(int i = 0; i < grades.size(); i++){
            sum += grades.get(i);
        }
        return sum/grades.size();
    }
}
