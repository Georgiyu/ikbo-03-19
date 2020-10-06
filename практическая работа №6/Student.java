package prac6;

public class Student {
    private int id,kolvo_ballov;
    private String name,group;

    public Student(){}

    public Student(int id, int math,int rus, int inf, String name, String group){
        this.id = id;
        this.kolvo_ballov = math + rus + inf;
        this.name = name;
        this.group = group;
    }

    public int getId() {
        return id;
    }

    public int getKolvo_ballov() {
        return kolvo_ballov;
    }

    public String getGroup() {
        return group;
    }

    public String getName() {
        return name;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setKolvo_ballov(int kolvo_ballov) {
        this.kolvo_ballov = kolvo_ballov;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", kolvo_ballov=" + kolvo_ballov +
                ", name='" + name + '\'' +
                ", group='" + group + '\'' +
                '}';
    }
}
