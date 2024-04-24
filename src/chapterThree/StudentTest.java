package chapterThree;

public class StudentTest {

    public static void main(String[] args) {
        Student student1 = new Student("Joan", 90);
        Student student2 = new Student("John Blue", 72.75);

        System.out.println(student1.getLetterGrade());
        System.out.println(student1.getAverage());
    }
}
