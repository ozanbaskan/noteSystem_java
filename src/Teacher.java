public class Teacher {
    String name;
    String mpno;
    String branch;

    Teacher(String name, String mpno, String branch)
    {
        this.name = name;
        this.mpno = mpno;
        this.branch = branch;
    }

    void print()
    {
        System.out.println("Öğretmen adı: " + name);
        System.out.println("Telefon numarası: " + mpno);
        System.out.println("Öğretmenin branşı: " + branch);
    }
}
