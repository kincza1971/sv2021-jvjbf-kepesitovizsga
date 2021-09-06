package training360.guinessapp.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import training360.guinessapp.dto.RecorderCreateCommand;
import training360.guinessapp.dto.RecorderDto;
import training360.guinessapp.dto.RecorderShortDto;
import training360.guinessapp.service.RecorderService;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/recorders")
public class RecorderController {

    private RecorderService service;

    public RecorderController(RecorderService service) {
        this.service = service;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public RecorderDto saveRecorder(@RequestBody @Valid RecorderCreateCommand command) {
        return service.saveRecorder(command);
    }

    @GetMapping()
    public List<RecorderShortDto> getRecorders() {
        return service.getRecorders();
    }

}
