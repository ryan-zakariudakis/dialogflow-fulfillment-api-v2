package com.ryanz.diagflow.webhook

import com.fasterxml.jackson.annotation.JsonIgnoreProperties

// https://dialogflow.com/docs/reference/api-v2/rest/v2beta1/projects.agent.intents#QuickReplies
@JsonIgnoreProperties(ignoreUnknown = true)
data class FulfillmentQuickReply(
        var title: String = "",
        var quickReplies: Array<String> = arrayOf()
)