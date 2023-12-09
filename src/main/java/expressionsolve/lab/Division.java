package expressionsolve.lab;
/**
 * Этот класс предназначен для сущьности подразделение
 * @author Алексей Стариков
 */
public class Division {
    String id;
    String name;
    /**
     * Конструктор с параметрами
     * @param id персональный идентификатор подразделения,
     * @param name  название подразделения
     */
    public Division(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Division\n{" + "\nid=" + id + "\nname=" + name + "\n}";
    }
}
