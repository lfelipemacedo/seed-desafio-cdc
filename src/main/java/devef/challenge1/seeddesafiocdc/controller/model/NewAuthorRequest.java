package devef.challenge1.seeddesafiocdc.controller.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record NewAuthorRequest(
        @NotBlank(message = "Name is required")
        String name,
        @NotBlank(message = "Email is required")
        @Email
        String email,
        @NotBlank(message = "Description is required.")
        @Size(max = 400, message = "Description cannot be longer than 400 characters")
        String description) {
}
