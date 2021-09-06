package training360.guinessapp.service;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import training360.guinessapp.dto.RecorderCreateCommand;
import training360.guinessapp.dto.RecorderDto;
import training360.guinessapp.dto.RecorderShortDto;
import training360.guinessapp.entity.Recorder;
import training360.guinessapp.repository.RecorderRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RecorderService {
    private RecorderRepository repository;
    private ModelMapper modelMapper;

    public RecorderService(RecorderRepository repository, ModelMapper modelMapper) {
        this.repository = repository;
        this.modelMapper = modelMapper;
    }

    public RecorderDto saveRecorder(RecorderCreateCommand command) {
        Recorder recorder = new Recorder(command.getName(), command.getDateOfBirth());
        repository.save(recorder);
        return modelMapper.map(recorder, RecorderDto.class);
    }

    public List<RecorderShortDto> getRecorders() {
        return repository.findAll()
                .stream()
                .map(r -> modelMapper.map(r, RecorderShortDto.class))
                .collect(Collectors.toList());
    }
}


