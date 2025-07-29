package com.dam.algasensors.device.management.api.client.impl;

import com.dam.algasensors.device.management.api.client.RestClientFactory;
import com.dam.algasensors.device.management.api.client.SensorMonitoringClient;
import com.dam.algasensors.device.management.api.model.SensorMonitoringOutPut;
import io.hypersistence.tsid.TSID;
import org.springframework.web.client.RestClient;

//@Component
// Comentado para evitar que o spring tente injetar o bean automaticamente, ´já que estamos usando o HttpServiceProxyFactory para criar o cliente e as anotações @HttpExchange na interface.
public class SensorMonitoringClientImpl implements SensorMonitoringClient {

    private final RestClient restClient;

    public SensorMonitoringClientImpl(RestClientFactory factory) {
        this.restClient = factory.temperatureMonitoringRestClient();
    }

    @Override
    public void enableMonitoring(TSID sensorId) {
        restClient.put()
                .uri("/api/sensors/{sensorId}/monitoring/enable", sensorId)
                .retrieve()
                .toBodilessEntity();
    }

    @Override
    public void disableMonitoring(TSID sensorId) {
        restClient.delete()
                .uri("/api/sensors/{sensorId}/monitoring/enable", sensorId)
                .retrieve()
                .toBodilessEntity();
    }

    @Override
    public SensorMonitoringOutPut getDetail(TSID sensorId) {
        return restClient.get()
                .uri("/api/sensors/{sensorId}/monitoring", sensorId)
                .retrieve()
                .body(SensorMonitoringOutPut.class);
    }

}
