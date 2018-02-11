package com.ryanz.diagflow.webhook

import com.fasterxml.jackson.annotation.JsonIgnoreProperties

// https://dialogflow.com/docs/reference/api-v2/rest/v2beta1/projects.agent.intents#Text
@JsonIgnoreProperties(ignoreUnknown = true)
data class FulfillmentSelectItemInfo(
        var key: String = "",
        var synonyms: Array<String> = arrayOf()
)