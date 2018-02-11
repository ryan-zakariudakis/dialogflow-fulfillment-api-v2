package com.ryanz.diagflow.webhook

import com.fasterxml.jackson.annotation.JsonIgnoreProperties

// https://dialogflow.com/docs/reference/api-v2/rest/v2beta1/projects.agent.intents#SimpleResponse
@JsonIgnoreProperties(ignoreUnknown = true)
data class FulfillmentSimpleResponse(
        var textToSpeech: String = "",
        var ssml: String = "",
        var displayText: String = ""
)
// https://dialogflow.com/docs/reference/api-v2/rest/v2beta1/projects.agent.intents#SimpleResponses
@JsonIgnoreProperties(ignoreUnknown = true)
data class FulfillmentSimpleResponses(
        var simpleResponses: Array<FulfillmentSimpleResponse> = arrayOf()
)