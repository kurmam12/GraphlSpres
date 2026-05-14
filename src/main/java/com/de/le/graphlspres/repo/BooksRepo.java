package com.de.le.graphlspres.repo;

import com.de.le.graphlspres.entity.Books;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BooksRepo extends JpaRepository<Books,Long> {
}
