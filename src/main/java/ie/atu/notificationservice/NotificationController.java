package ie.atu.notificationservice;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotificationController {
    @PostMapping("/confirmNotification")
    public String notification(@RequestBody UserDetails userDetails) {
        System.out.println(userDetails);
        String confirmMessage = String.format("User %s (%s) has been successfully registered", userDetails.getName(),userDetails.getEmail());
        return confirmMessage;
    }
}
