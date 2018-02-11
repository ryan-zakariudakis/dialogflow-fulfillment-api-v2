package com.ryanz.diagflow.webhook

import com.fasterxml.jackson.annotation.JsonIgnoreProperties

// https://dialogflow.com/docs/reference/api-v2/rest/v2beta1/projects.agent.intents#Button
@JsonIgnoreProperties(ignoreUnknown = true)
data class FulfillmentButton(
        var text: String = "",
        var postback: String = ""
)