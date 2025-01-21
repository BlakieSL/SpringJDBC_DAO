package org.example.springjdbc.repository.declaration;

import org.example.springjdbc.model.Library;

import java.util.Optional;
import java.util.Set;

public interface LibraryRepository {
    Optional<Library> findById(Long id);
    Set<Library> findAll();
    Library create(Library library);
    Library update(long id, Library library);
    boolean delete(long id);
}
