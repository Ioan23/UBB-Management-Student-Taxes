public class Student {
    private int id;
    private String name;
    private int yearStudy;

    public Student (int id, String name, int yearStudy){
        this.id=id;
        this.name=name;
        this.yearStudy=yearStudy;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearStudy() {
        return yearStudy;
    }

    public void setYearStudy(int yearStudy) {
        this.yearStudy = yearStudy;
    }

}
