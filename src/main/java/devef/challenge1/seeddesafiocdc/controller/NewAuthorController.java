package devef.challenge1.seeddesafiocdc.controller;

import devef.challenge1.seeddesafiocdc.controller.model.NewAuthorRequest;
import devef.challenge1.seeddesafiocdc.controller.model.NewAuthorResponse;
import devef.challenge1.seeddesafiocdc.entity.Author;
import devef.challenge1.seeddesafiocdc.repository.AuthorRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("authors")
public class NewAuthorController {

    private final AuthorRepository repository;

    @Autowired
    public NewAuthorController(AuthorRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public NewAuthorResponse create(@Valid @RequestBody NewAuthorRequest request) {
        Author author = repository.save(Author.create(request.name(), request.email(), request.description()));

        return NewAuthorResponse.with(author);
    }
}
