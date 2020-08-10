package in.eatabyte.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import in.eatabyte.dto.GenericMessageDto;

@RestController
@RequestMapping(path = "/eatabyte-service")
public class EatabyteServiceController {

    private static final String MESSAGE_READY = "We\'re Ready!!";

    @RequestMapping(method = RequestMethod.GET, path = "/status")
    public GenericMessageDto getStatus() {
        return new GenericMessageDto(MESSAGE_READY);
    }

}
