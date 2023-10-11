package atu.ie.lab3_userservice;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    private RegistrationServiceClient registrationServiceClient;
    private final AcknowledgeService acknowledgeService;
}
