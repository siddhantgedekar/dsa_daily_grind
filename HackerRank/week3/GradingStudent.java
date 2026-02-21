import java.util.List;
import java.util.ArrayList;

public class GradingStudent {
    public static List<Integer> solution (List<Integer> grades) {
        for(int i=0; i<grades.size(); i++) {
            // if value >= 38
            if ( grades.get(i) >= 38 ){
                // find current element's next multiple of 5
                int modulus = grades.get(i)%5;
                int multiple = modulus != 0 ? ((5 - modulus) + grades.get(i)) : grades.get(i);
                if((multiple - grades.get(i)) < 3) {
                    grades.set(i, multiple);
                }
            }
        }
        return grades;
    }

    public static void main(String [] args) {
        List<Integer> q = new ArrayList<>();
        q.add(37);q.add(38);

        System.out.println(solution(q));
    }
}