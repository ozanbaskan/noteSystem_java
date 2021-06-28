public class Student {
    Course c1;
    Course c2;
    Course c3;

    String name;
    String stuNo;
    String classes;
    double average;
    boolean passed;

    Student(String name, String stuNo, String classes, Course c1, Course c2, Course c3)
    {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.average = 0.0;
        this.passed = false;
    }

    void addExamNotes(int n1, int n2, int n3)
    {
        if (n1 >= 0 && n1 <= 100)
        {
            this.c1.note = n1;
        }
        if (n2 >= 0 && n2 <= 100)
        {
            this.c2.note = n2;
        }
        if (n3 >= 0 && n3 <= 100)
        {
            this.c3.note = n3;
        }
    }
    void addVerbalExam(int n1, int n2, int n3)
    {
        if (n1 >= 0 && n1 <= 100)
        {
            this.c1.verbalExam = n1;
        }
        if (n2 >= 0 && n2 <= 100)
        {
            this.c2.verbalExam = n2;
        }
        if (n3 >= 0 && n3 <= 100)
        {
            this.c3.verbalExam = n3;
        }
    }

    void printNote()
    {
        System.out.println("=============================");
        System.out.println(c1.name + " Notu: " + c1.note);
        System.out.println(c2.name + " Notu: " + c2.note);
        System.out.println(c3.name + " Notu: " + c3.note);
    }

    double getAverage()
    {
        return ((this.c1.note * ((100 - this.c1.verbalPercent) / 100.0) + this.c2.note * ((100 - this.c2.verbalPercent) / 100.0) + this.c3.note * ((100 - this.c3.verbalPercent) / 100.0)) + (this.c1.verbalExam * (this.c1.verbalPercent / 100.0) + this.c2.verbalExam * (this.c2.verbalPercent / 100.0) + this.c3.verbalExam * (this.c3.verbalPercent / 100.0))) / 3.0;
    }

    void isPassed()
    {
        System.out.println("=============================");
        if (this.getAverage() > 55)
        {
            System.out.println("Sınıfı geçti! :D");
            this.passed = true;
        }
        else
        {
            System.out.println("Sınıfta kaldı! D:");
            this.passed = false;
        }
        this.printNote();
    }

}
