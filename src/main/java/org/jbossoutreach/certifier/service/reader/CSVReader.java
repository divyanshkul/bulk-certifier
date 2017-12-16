package org.jbossoutreach.certifier.service.reader;

import com.opencsv.bean.ColumnPositionMappingStrategy;
import com.opencsv.bean.CsvToBeanBuilder;
import org.jbossoutreach.certifier.model.Student;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

public class CSVReader {

    public  static  void read() throws FileNotFoundException {
        File file = new File("/Users/anuj/jboss/certifier/src/main/resources/report.csv");

        FileReader reader =  new FileReader(file);
        List<Student> beans = new CsvToBeanBuilder(reader)
                .withSkipLines(2)
                .withType(Student.class).withMappingStrategy(setColumMapping()).build().parse();

        System.out.println(beans.size());

        for (Student student : beans) {
            System.out.println(student.getEmail());
        }

    }

    private static ColumnPositionMappingStrategy setColumMapping()
    {
        ColumnPositionMappingStrategy strategy = new ColumnPositionMappingStrategy();
        strategy.setType(Student.class);
        String[] columns = new String[] {"Sno", "name", "roll", "email"};
        strategy.setColumnMapping(columns);
        return strategy;
    }

}
