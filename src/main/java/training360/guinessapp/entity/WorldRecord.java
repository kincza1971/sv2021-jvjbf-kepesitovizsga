package training360.guinessapp.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "world_record")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class WorldRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;

    private Double value;

    private String unitOfMeasure;

    private LocalDate dateOfRecord;

    @ManyToOne
    private Recorder recorder;

    public WorldRecord(String description, Double value, String unitOfMeasure, LocalDate date, Recorder recorder) {
        this.description = description;
        this.value = value;
        this.unitOfMeasure = unitOfMeasure;
        this.dateOfRecord = date;
        this.recorder = recorder;
    }
}

//d (Long, szerver adja ki sorban)
//leírás (String, nem lehet null, üres String vagy csak whitespace karakter)
//érték (Double, nem lehet null)
//mértékegység (String, nem lehet null, üres String vagy csak whitespace karakter)
//dátum (LocalDate, nem lehet null)
//rekorder id-ja (Long, nem lehet null)
//A kérésben beérkező adatokat a fenti feltételek alapján validáld le, és hiba esetén küldj vissza hibaüzenet (a pontos hibaüzeneteket megtalálhatod a vonatkozó teszteseteknél), valamint 400-as hibakódot!
//
//Ha a megadott id-nak megfelelő rekorder nem található a rendszerben, akkor küldj vissza ugyanúgy 400-as hibakódot és hibaüzenetet! Ehhez használhatod a validációs hiba formátumát, a pontos hibaüzenetet megtalálhatod a megfelelő tesztesetnél.
//
//Sikeres mentés esetén küldd vissza az elmentett világrekord adatait (id-val együtt), és a rekorder nevét, valamint 201-es státuszkódot!