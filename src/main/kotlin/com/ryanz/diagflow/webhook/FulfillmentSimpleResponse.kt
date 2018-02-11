package com.ryanz.diagflow.webhook

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

// https://dialogflow.com/docs/reference/api-v2/rest/v2beta1/projects.agent.intents#SimpleResponse
@JsonIgnoreProperties(ignoreUnknown = true)
data class FulfillmentSimpleResponse(
        @JsonProperty("textToSpeech")
        var textToSpeech: String? = "",
        @JsonProperty("ssml")
        var ssml: String? = "",
        @JsonProperty("displayText")
        var displayText: String? = ""
)
// https://dialogflow.com/docs/reference/api-v2/rest/v2beta1/projects.agent.intents#SimpleResponses
@JsonIgnoreProperties(ignoreUnknown = true)
data class FulfillmentSimpleResponses(
        @JsonProperty("simpleResponses")
        var simpleResponses: List<FulfillmentSimpleResponse>? = mutableListOf()
)