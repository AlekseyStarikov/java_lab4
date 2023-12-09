package expressionsolve.lab;


public class Main {
    public static void main(String[] args) {

        String filepath = "src/main/resources/foreign_names.csv";
        ListOfPersons persons=new ListOfPersons();
        persons.reader(filepath);
        System.out.println(persons);
    }
}