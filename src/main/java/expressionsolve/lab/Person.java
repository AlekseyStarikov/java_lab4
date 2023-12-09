package expressionsolve.lab;
/**
 * Этот класс предназначен для сущьности человек
 * @author Алексей Стариков
 */
public class Person {
    int id;
    String name;
    String sex;
    String birthday;
    Division division;
    int salary;
    /**
     * Конструктор с параметрами
     * @param id персональный идентификатор человека,
     * @param name  имя,
     * @param sex пол,
     * @param birthday дата рождения,
     * @param division информация о подразделении,
     * @param salary заработная плата.
     */
    public Person(int id, String name, String sex, String birthday, Division division, int salary) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.division = division;
        this.salary = salary;
        this.birthday = birthday;
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Division getDivision() {
        return division;
    }

    public void setDivision(Division division) {
        this.division = division;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Person\n{" + "\nid=" + id + "\nname=" + name +  "\nsex=" + sex + "\nbirthday=" + birthday + '\n' + division + "\nsalary=" + salary + "\n}";
    }

}
