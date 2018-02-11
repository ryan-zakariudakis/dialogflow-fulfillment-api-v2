package com.ryanz.diagflow.webhook

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

// https://dialogflow.com/docs/reference/api-v2/rest/v2beta1/projects.agent.sessions/detectIntent#EventInput
@JsonIgnoreProperties(ignoreUnknown = true)
data class FulfillmentEventInput(
        @JsonProperty("name")
        var name: String? = "",
        @JsonProperty("parameters")
        var parameters: Map<String, Any>? = mapOf(),
        @JsonProperty("languageCode")
        var languageCode: String? = ""
)