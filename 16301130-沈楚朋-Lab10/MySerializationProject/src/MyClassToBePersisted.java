import java.io.Serializable;

/**
 * @author BJTU16301130
 * @version 20171018
 */
public class MyClassToBePersisted implements Serializable{
    private String name = null;
    private int age = 0;
    private String hobby = null;

    private String nameOfSchool = null;
    transient private int yearStarted = 0;

    public MyClassToBePersisted(){ };

    public MyClassToBePersisted(String name, int age, String hobby,
                                String nameOfSchool, int yearStarted){

        this.name = name;
        this.age = age;
        this.hobby = hobby;
        this.nameOfSchool = nameOfSchool;
        this.yearStarted = yearStarted;
    }

    @Override
    public String toString() {
        return name +" "+ age +" "+ hobby +" "+ nameOfSchool +" "+ yearStarted;
    }
}
