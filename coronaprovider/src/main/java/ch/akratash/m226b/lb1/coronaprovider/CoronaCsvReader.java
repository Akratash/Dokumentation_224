package ch.akratash.m226b.lb1.coronaprovider;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CoronaCsvReader {
    // adapted from https://attacomsian.com/blog/spring-boot-upload-parse-csv-file
    static Logger logger = LoggerFactory.getLogger(CoronaCsvReader.class);

    public static List<CoronaRow> loadCsv() {
        List<CoronaRow> rows = new ArrayList<>();
        File file = new File("src/main/resources/static/COVID19_Fallzahlen_Kanton_TG_total.csv");

        // parse CSV file to create a list of `User` objects
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {

            // create csv bean reader
            CsvToBean<CoronaRow> csvToBean = new CsvToBeanBuilder(reader)
                    .withType(CoronaRow.class)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();

            // convert `CsvToBean` object to list of users
            rows = csvToBean.parse();


        } catch (Exception ex) {
            logger.error("An error occurred while processing the CSV file.");
        }

        return rows;
    }
}