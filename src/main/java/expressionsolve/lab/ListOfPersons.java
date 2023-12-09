package expressionsolve.lab;

import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.exceptions.CsvException;
import com.opencsv.exceptions.CsvValidationException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.io.*;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;
/**
 * Этот класс предназначен для списка людей
 * @author Алексей Стариков
 */
public class ListOfPersons {
    ArrayList<Person> persons;

    /**
     * Конструктор с параметрами
     * @param persons список людей
     */
    public ListOfPersons(ArrayList<Person> persons) {
        this.persons = persons;
    }
    /**
     * Конструктор без параметров
     */
    public ListOfPersons() {
        this.persons = new ArrayList<>();
    }

    public ArrayList<Person> getPersons() {
        return persons;
    }

    public void setPersons(ArrayList<Person> persons) {
        this.persons = persons;
    }

    /**
     * Метод для перевода в строку списка людей
     */
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("PersonsList{");
        for (Person person: persons) {
            stringBuilder.append(person + "\n");
        }
        stringBuilder.append("}\n");
        return String.valueOf(stringBuilder);
    }
    /**
     * Метод для чтения из csv файла
     * @param filepath  путь файла
     */
    public void reader(String filepath) {
        try {
            FileReader filereader = new FileReader(filepath);

            CSVParser parser = new CSVParserBuilder().withSeparator(';').build();


            CSVReader csvReader = new CSVReaderBuilder(filereader).withCSVParser(parser).build();

            //List<List<String>> result = new ArrayList<>();
            String[] nextline= csvReader.readNext();
            nextline[0]=" ";
            while ((nextline = csvReader.readNext()) != null) {
                SimpleDateFormat formatter =new SimpleDateFormat("dd.MM.yyyy");
                Date date = formatter.parse(nextline[3]);
                persons.add(new Person(Integer.parseInt(nextline[0]),
                        nextline[1],
                        nextline[2],
                        formatter.format(date),
                        new Division((ThreadLocalRandom.current().nextInt(100, 10000)+nextline[4]), nextline[4]),
                        Integer.parseInt(nextline[5])));;
            }

        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (CsvValidationException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (CsvException e) {
            throw new RuntimeException(e);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

}
