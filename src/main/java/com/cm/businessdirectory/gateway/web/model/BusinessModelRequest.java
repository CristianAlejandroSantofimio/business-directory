package com.cm.businessdirectory.gateway.web.model;

import java.util.List;

public record BusinessModelRequest(
        String name,
        String description,
        List<String> socialMedia,
        List<String> tags) {
}
