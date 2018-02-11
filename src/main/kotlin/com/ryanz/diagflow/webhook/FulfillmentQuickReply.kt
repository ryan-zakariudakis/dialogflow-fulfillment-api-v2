package com.ryanz.diagflow.webhook

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

// https://dialogflow.com/docs/reference/api-v2/rest/v2beta1/projects.agent.intents#QuickReplies
@JsonIgnoreProperties(ignoreUnknown = true)
data class FulfillmentQuickReply(
        @JsonProperty("title")
        var title: String? = "",
        @JsonProperty("quickReplies")
        var quickReplies: List<String>? = mutableListOf()
)