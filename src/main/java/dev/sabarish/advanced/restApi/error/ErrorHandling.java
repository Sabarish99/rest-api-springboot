package dev.sabarish.advanced.restApi.error;

import lombok.*;

import java.time.LocalDate;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ErrorHandling {
    private String  message;
    private String description;
    private LocalDate date;

}
