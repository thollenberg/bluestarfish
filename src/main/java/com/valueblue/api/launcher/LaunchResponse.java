package com.valueblue.api.launcher;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

public class LaunchResponse {
    @Getter @Setter private UUID configId;
    @Getter @Setter private UUID queueId;
}
