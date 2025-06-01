package com.dam.algasensors.device.management.api.config.jackson;

import com.fasterxml.jackson.databind.JsonSerializer;
import io.hypersistence.tsid.TSID;

import java.io.IOException;

public class TSIDToStringSerializer extends JsonSerializer<TSID> {

    @Override
    public void serialize(TSID value, com.fasterxml.jackson.core.JsonGenerator gen, com.fasterxml.jackson.databind.SerializerProvider serializers) {
        try {
            gen.writeString(value.toString());
        } catch (IOException e) {
            throw new RuntimeException("Error serializing TSID", e);
        }
    }
}
