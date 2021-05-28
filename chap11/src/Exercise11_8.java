import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Exercise11_8 {
    public static void calculateClassRank(List list) {
        Collections.sort(list, new ClassTotalComparator());
        int prevBan = -1;
        int prevRank = -1;
        int prevTotal = -1;
        int length = list.size();
        int ban_idx = -1;

        for (int i = 0; i < length; i++) {
            Student student = (Student) list.get(i);
            if (student.ban != prevBan) {
                ban_idx = i;
                student.classRank = 1;
            } else if (student.total == prevTotal)
                student.classRank = prevRank;
            else
                student.classRank = (i + 1) - ban_idx;
            prevBan = student.ban;
            prevTotal = student.total;
            prevRank = student.classRank;
        }
    }

    public static void calculateSchoolRank(List list) {
        Collections.sort(list);
        int prevRank = -1;
        int prevTotal = -1;
        int length = list.size();

        for (int i = 0; i < length; i++) {
            Student student = (Student) list.get(i);
            if (student.getTotal() == prevTotal)
                student.schoolRank = prevRank;
            else
                student.schoolRank = i + 1;
            prevTotal = student.getTotal();
            prevRank = student.schoolRank;
        }
    }

    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(new Student("이자바", 2, 1, 70, 90, 70));
        list.add(new Student("안자바", 2, 2, 60, 100, 80));
        list.add(new Student("홍길동", 1, 3, 100, 100, 100));
        list.add(new Student("남궁성", 1, 1, 90, 70, 80));
        list.add(new Student("김자바", 1, 2, 80, 80, 90));

        calculateSchoolRank(list);
        calculateClassRank(list);

        Iterator it = list.iterator();

        while (it.hasNext())
            System.out.println(it.next());
    }
}
