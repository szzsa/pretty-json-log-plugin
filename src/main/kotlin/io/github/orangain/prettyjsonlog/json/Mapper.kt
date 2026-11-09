package io.github.orangain.prettyjsonlog.json

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.databind.SerializationFeature
import com.fasterxml.jackson.databind.cfg.JsonNodeFeature

// We only read and write JsonNode trees, so the Kotlin module (and the kotlin-reflect it requires) is not needed.
val mapper = ObjectMapper().apply {
    configure(SerializationFeature.INDENT_OUTPUT, true)
    configure(JsonNodeFeature.WRITE_PROPERTIES_SORTED, true)
}