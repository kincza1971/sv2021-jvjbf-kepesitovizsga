package training360.guinessapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BeatWorldRecordDto {
    private String description;
    private String UnitOfMeasurement;
    private String nameOfOldRecorder;
    private double valueOfOldRecord;
    private String nameOfNewRecorder;
    private double valueOfNewRecord;
    private double difference;

}

////rekord leírása
////mértékegység
////korábbi rekorder neve
////korábbi rekord értéke
////új rekorder neve
////új rekord értéke
////két rekord különbsége
////A megfelelő tesztesetben megtalálod a szükséges elnevezéseket.
