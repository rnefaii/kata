package com.carrefour.eventData;

import java.time.LocalDateTime;

public record Event(EventType type, CutstomerDto cutstomerDto, LocalDateTime eventCreatedAt){}