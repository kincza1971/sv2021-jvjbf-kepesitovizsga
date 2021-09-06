package training360.guinessapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Positive;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WorldRecordCreateCommand {

    @NotBlank
    private String description;

    @NotNull
    private Double value;

    @NotBlank
    private String measurementUnit;

    @Past
    @NotNull
    private LocalDate date;

    @NotNull
    @Positive
    private long recorderId;

}
