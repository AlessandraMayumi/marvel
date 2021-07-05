package com.marvel.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Slf4j
@Configuration
public class LoadDatabase {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Bean
    public void initDatabase() throws IOException{
        final List<String> queries;
        queries = read();
        for (String query : queries) {
            jdbcTemplate.execute(query);
        }
        log.info("Preloading finished");
    }

    private static List<String> read() throws IOException {
        final List<String> content = new ArrayList<>();

        final File file = new File("src/main/java/com/marvel/config/data.sql");
        final FileReader fileReader = new FileReader(file);
        final BufferedReader bufferedReader = new BufferedReader(fileReader);

        String readLine;
        while((readLine=bufferedReader.readLine()) != null)
        {
            content.add(readLine);
        }
        bufferedReader.close();

        return content;
    }
}

