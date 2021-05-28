import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

class Student implements Comparable<Student> {
    String name;
    int ban;
    int no;
    int kor, eng, math;

    int total;
    int schoolRank;
    int classRank;

    Student(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;

        total = kor + eng + math;
    }

    int getTotal() {
        return total;
    }

    float getAverage() {
        return (int) ((getTotal() / 3f) * 10 + 0.5) / 10f;
    }

    public String toString() {
        return name + "," + ban + "," + no + "," + kor + "," + eng + "," + math + "," + getTotal() + "," + getAverage() + "," + schoolRank+","+classRank;
    }

    @Override
    public int compareTo(Student o) {
        return o.getTotal() - getTotal();
    }
}

class BanNoAscending implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        if (o1.ban == o2.ban)
            return o1.no - o2.no;
        return o1.ban - o2.ban;
    }
}

class ClassTotalComparator implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        if(o1.ban==o2.ban)
            return o2.total-o1.total;
        return o1.ban-o2.ban;
    }
}

public class Exercise11_5 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(new Student("홍길동", 1, 1, 100, 100, 100));
        list.add(new Student("남궁성", 1, 2, 90, 70, 80));
        list.add(new Student("김자바", 1, 3, 80, 80, 90));
        list.add(new Student("이자바", 2, 2, 70, 90, 70));
        list.add(new Student("안자바", 2, 1, 60, 100, 80));

        Collections.sort(list, new BanNoAscending());
        Iterator it = list.iterator();

        while (it.hasNext())
            System.out.println(it.next());
    }
}