package org.example;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class Main {
    public static void main(String[] args) {
        Student student = new Student.StudentBuilder("Иванов Иван Иванович", "1234567890")
                .setAvgExamScore(4.7f)
                .setCurrentCourseNumber(1)
                .build();
        System.out.println(student);
        System.out.println(ToStringBuilder.reflectionToString(student));

        System.out.println();

        University university = new University.UniversityBuilder("1234567890", "Московский Государственный Университет")
                .setShortName("МГУ")
                .setYearOfFoundation(1899)
                .setMainProfile(StudyProfile.NEURAL_NETWORKS)
                .build();
        System.out.println(university);
    }
}