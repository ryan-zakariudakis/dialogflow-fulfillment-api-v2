package com.ryanz.diagflow.webhook

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

// https://dialogflow.com/docs/reference/api-v2/rest/v2beta1/projects.agent.intents#Suggestions
@JsonIgnoreProperties(ignoreUnknown = true)
data class FulfillmentSuggestions (
        @JsonProperty("suggestions")
        var suggestions: List<FulfillmentSuggestion>? = mutableListOf()
)
// https://dialogflow.com/docs/reference/api-v2/rest/v2beta1/projects.agent.intents#Suggestion
@JsonIgnoreProperties(ignoreUnknown = true)
data class FulfillmentSuggestion (
        @JsonProperty("title")
        var title: String? = ""
)