public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;
    int verbalExam;
    int verbalPercent;

    Course(String name, String code, String prefix, Teacher teacher, int verbalPercent)
    {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.teacher = teacher;
        this.verbalPercent = verbalPercent;
        this.note = 0;
        this.verbalExam = 0;
    }

    void setTeacher(Teacher teacher)
    {
        if (teacher.branch.equals(this.prefix))
        {
            this.teacher = teacher;
        }
        else
        {
            System.out.println("Öğretmen ve branşı uyuşmuyor.");
        }

    }

    void printTeacher()
    {
        this.teacher.print();
    }


}
