package ua.ucu.edu.apps.task1;
import java.time.LocalDate;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
@Data
class FacebookUser{
    private String email;
    private String UserCountry;
    private LocalDate LastActiveTime;
}