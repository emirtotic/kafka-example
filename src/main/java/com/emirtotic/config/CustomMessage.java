package com.emirtotic.config;

import java.time.LocalDateTime;

public record CustomMessage(String message,
                            LocalDateTime createdAt) {
}
