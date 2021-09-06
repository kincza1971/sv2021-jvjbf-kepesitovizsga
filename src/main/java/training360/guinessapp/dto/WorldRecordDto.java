package training360.guinessapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class WorldRecordDto {

    private Long id;

    private String description;

    private Double value;

    private String unitOfMeasure;

    private LocalDate dateOfRecord;

    private String recorderName;

}

//    id (Long, szerver adja ki sorban)
//    leírás (String, nem lehet null, üres String vagy csak whitespace karakter)
//    érték (Double, nem lehet null)
//    mértékegység (String, nem lehet null, üres String vagy csak whitespace karakter)
//    dátum (LocalDate, nem lehet null)
//    rekorder id-ja (Long, nem lehet null)