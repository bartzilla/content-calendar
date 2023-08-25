package dev.ciprianosanchez.contentcalendar.repository;

import dev.ciprianosanchez.contentcalendar.model.Content;
import dev.ciprianosanchez.contentcalendar.model.Status;
import dev.ciprianosanchez.contentcalendar.model.Type;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class ContentCollectionRepository {
    private final List<Content> contents = new ArrayList<>();

    public ContentCollectionRepository() {
    }

    public List<Content> findAll() {
        return contents;
    }

    public Optional<Content> findById(Integer id) {
        return contents.stream().filter(c -> c.id().equals(id)).findFirst();
    }

    @PostConstruct
    private void init() {
        Content content = new Content(1,
                "My first blog post",
                "My fist blog post",
                Status.IDEA,
                Type.ARTICLE,
                LocalDateTime.now(),
                null,
                ""
        );
        contents.add(content);
    }

    public void save(Content content) {
        contents.add(content);
    }
}
