package com.cm.businessdirectory.domain;

import java.util.List;

public record Business(
        String id,
        String name,
        String description,
        List<String> socialMedia,
        List<String> tags) {
}
