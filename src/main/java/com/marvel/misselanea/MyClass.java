package com.marvel.misselanea;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MyClass {

    private int grade = 0;

    public int processGrade() {
        grade = 7;
        int grade1 = passGrade();
        int grade2 = passGrade();
        log.info("processGrade => grade1 = '{}", grade1);
        log.info("processGrade => grade2 = '{}", grade2);
        return grade2;
    }

    private int passGrade() {
        grade += 2;
        log.info("passGrade => passGrade = '{}", grade);
        return grade;
    }
}
