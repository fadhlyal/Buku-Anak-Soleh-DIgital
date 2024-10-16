package com.abdimas.bukasol.dto.prayerGrade;

import java.time.LocalDate;
import java.util.UUID;

import com.abdimas.bukasol.dto.StudentDTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PrayerGradeDTO {
    private UUID id;
    private LocalDate timeStamp;
    private String motionCategory;
    private double gradeSemester1;
    private double gradeSemester2;
    private boolean teacherSign;
    private boolean parentSign;
    
    private StudentDTO student;
}
