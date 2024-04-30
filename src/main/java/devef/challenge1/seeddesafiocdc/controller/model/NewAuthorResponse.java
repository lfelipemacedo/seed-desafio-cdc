package devef.challenge1.seeddesafiocdc.controller.model;

import devef.challenge1.seeddesafiocdc.entity.Author;

public record NewAuthorResponse(Long id, String name, String email, String description) {
    public static NewAuthorResponse with(Author author) {
        return new NewAuthorResponse(author.getId(), author.getName(), author.getEmail(), author.getDescription());
    }
}
