package com.ryanz.diagflow.webhook

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

// https://dialogflow.com/docs/reference/api-v2/rest/v2beta1/projects.agent.intents#LinkOutSuggestion
@JsonIgnoreProperties(ignoreUnknown = true)
data class FulfillmentLinkOutSuggestion (
        @JsonProperty("destinationName")
        var destinationName: String? = "",
        @JsonProperty("uri")
        var uri: String? = ""
)