package training360.guinessapp.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import training360.guinessapp.dto.WorldRecordCreateCommand;
import training360.guinessapp.dto.WorldRecordDto;
import training360.guinessapp.service.WorldRecordService;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/worldrecords")
public class WorldRecordController {

    private WorldRecordService service;

    public WorldRecordController(WorldRecordService service) {
        this.service = service;
    }

    @PostMapping
    public WorldRecordDto saveWordRecord(@RequestBody @Valid WorldRecordCreateCommand command) {
        return service.SaveWorldRecord(command);
    }

}
