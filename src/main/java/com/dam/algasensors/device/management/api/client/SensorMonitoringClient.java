package com.dam.algasensors.device.management.api.client;

import com.dam.algasensors.device.management.api.model.SensorMonitoringOutPut;
import io.hypersistence.tsid.TSID;

public interface SensorMonitoringClient {
    void enableMonitoring(TSID sensorId);
    void disableMonitoring(TSID sensorId);
    SensorMonitoringOutPut getDetail(TSID sensorId);
}
