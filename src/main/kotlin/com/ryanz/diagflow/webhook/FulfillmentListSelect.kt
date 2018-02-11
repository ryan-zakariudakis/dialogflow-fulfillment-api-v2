package com.ryanz.diagflow.webhook

import com.fasterxml.jackson.annotation.JsonIgnoreProperties

// https://dialogflow.com/docs/reference/api-v2/rest/v2beta1/projects.agent.intents#ListSelect
@JsonIgnoreProperties(ignoreUnknown = true)
data class FulfillmentListSelect(
        var title: String = "",
        var items: Array<FulfillmentItem> = arrayOf()
)