package com.ryanz.diagflow.webhook

import com.fasterxml.jackson.annotation.JsonIgnoreProperties

// https://dialogflow.com/docs/reference/api-v2/rest/v2beta1/projects.agent.intents#Suggestions
@JsonIgnoreProperties(ignoreUnknown = true)
data class FulfillmentSuggestions (
        var suggestions: Array<FulfillmentSuggestion> = arrayOf()
)
// https://dialogflow.com/docs/reference/api-v2/rest/v2beta1/projects.agent.intents#Suggestion
@JsonIgnoreProperties(ignoreUnknown = true)
data class FulfillmentSuggestion (
        var title: String = ""
)