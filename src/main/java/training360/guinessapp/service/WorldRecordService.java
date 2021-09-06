package training360.guinessapp.service;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import training360.guinessapp.dto.WorldRecordCreateCommand;
import training360.guinessapp.dto.WorldRecordDto;
import training360.guinessapp.entity.Recorder;
import training360.guinessapp.entity.WorldRecord;
import training360.guinessapp.exception.NotFoundException;
import training360.guinessapp.repository.RecorderRepository;
import training360.guinessapp.repository.WorldRecordRepository;

@Service
public class WorldRecordService {

    private WorldRecordRepository repository;
    private RecorderRepository recorderRepository;
    ModelMapper modelMapper;

    public WorldRecordService(WorldRecordRepository repository, RecorderRepository recorderRepository, ModelMapper modelMapper) {
        this.repository = repository;
        this.recorderRepository = recorderRepository;
        this.modelMapper = modelMapper;
    }

    @Transactional
    public WorldRecordDto SaveWorldRecord(WorldRecordCreateCommand command) {
        long recorderId= command.getRecorderId();
        Recorder recorder = recorderRepository.findById(recorderId).orElseThrow(() ->
                new NotFoundException("/api/not-found", "Recorder not found with this id: " + recorderId));
        WorldRecord worldRecord =
                new WorldRecord(command.getDescription(), command.getValue(), command.getMeasurementUnit(), command.getDate(), recorder);
        repository.save(worldRecord);
        return modelMapper.map(worldRecord, WorldRecordDto.class);
    }
}
