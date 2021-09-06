package training360.guinessapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BeatWorldRecordCommand {
    @NotNull
    private Long recorderId;

    @NotNull
    private Double newValue;
}

//új rekorder id-ja (Long, nem lehet null)
//új rekord értéke (Double, nem lehet null)
//A kérésben beérkező adatokat a fenti feltételek alapján validáld le, és hiba esetén küldj vissza hibaüzenet (a pontos hibaüzeneteket megtalálhatod a vonatkozó teszteseteknél), valamint 400-as hibakódot!
