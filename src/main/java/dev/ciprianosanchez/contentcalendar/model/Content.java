package dev.ciprianosanchez.contentcalendar.model;

import java.time.LocalDateTime;

// tag::r
public record Content(
        Integer id,
        String title,
        String desc,
        Status status,
        Type type,
        LocalDateTime dateCreated,
        LocalDateTime dateUpdated,
        String url
) { }
