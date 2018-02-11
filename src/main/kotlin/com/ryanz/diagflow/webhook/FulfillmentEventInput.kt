package com.ryanz.diagflow.webhook

import com.fasterxml.jackson.annotation.JsonIgnoreProperties

// https://dialogflow.com/docs/reference/api-v2/rest/v2beta1/projects.agent.sessions/detectIntent#EventInput
@JsonIgnoreProperties(ignoreUnknown = true)
data class FulfillmentEventInput(
        var name: String = "",
        var parameters: String = "",
        var languageCode: String = ""
)