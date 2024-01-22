package yebin.students;

import lombok.Data;

@Data
public class Students {
    private String name;
    private Long id;
    private Integer grade;
    private String major;

    public Students(String name, Long id, Integer grade, String major){
        this.name = name;
        this.id = id;
        this.grade = grade;
        this.major = major;
    }
}
