package training360.guinessapp.exception;


import org.zalando.problem.AbstractThrowableProblem;
import org.zalando.problem.Status;

import java.net.URI;

public class NotFoundException extends AbstractThrowableProblem {
    public NotFoundException(String uriString, String problemDetails) {
        super(
                URI.create(uriString),
                "Recorder not found",
                Status.NOT_FOUND,
                problemDetails
        );

    }
}
