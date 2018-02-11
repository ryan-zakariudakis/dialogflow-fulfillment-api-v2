package com.ryanz.diagflow.webhook

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

// https://dialogflow.com/docs/reference/api-v2/rest/v2beta1/projects.agent.sessions.contexts#Context
@JsonIgnoreProperties(ignoreUnknown = true)
data class FulfillmentContext (
        @JsonProperty("name")
        var name: String? = "",
        @JsonProperty("lifespanCount")
        var lifespanCount: Int? = 0,
        @JsonProperty("parameters")
        var parameters: Map<String, Any>? = mapOf()
)