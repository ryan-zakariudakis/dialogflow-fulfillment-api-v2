package com.ryanz.diagflow.webhook

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

// https://dialogflow.com/docs/reference/api-v2/rest/v2beta1/projects.agent.intents#Text
@JsonIgnoreProperties(ignoreUnknown = true)
data class FulfillmentText (
        @JsonProperty("text")
        var text: List<String>? = mutableListOf()
)