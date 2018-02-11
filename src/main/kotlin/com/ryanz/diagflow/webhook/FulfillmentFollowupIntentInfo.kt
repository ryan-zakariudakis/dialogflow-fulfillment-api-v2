package com.ryanz.diagflow.webhook

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

// https://dialogflow.com/docs/reference/api-v2/rest/v2beta1/projects.agent.intents#FollowupIntentInfo
@JsonIgnoreProperties(ignoreUnknown = true)
data class FulfillmentFollowupIntentInfo(
        @JsonProperty("followupIntentName")
        var followupIntentName: String? = "",
        @JsonProperty("parentFollowupIntentName")
        var parentFollowupIntentName: String? = ""
)