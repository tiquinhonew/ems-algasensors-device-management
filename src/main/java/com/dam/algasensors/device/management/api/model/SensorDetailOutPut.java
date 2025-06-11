package com.dam.algasensors.device.management.api.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SensorDetailOutPut {
    private SensorOutput sensor;
    private SensorMonitoringOutPut monitoring;
}
