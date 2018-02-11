package com.ryanz.diagflow.webhook

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

// https://dialogflow.com/docs/reference/api-v2/rest/v2beta1/projects.agent.intents#Card
@JsonIgnoreProperties(ignoreUnknown = true)
data class FulfillmentCard(
        @JsonProperty("title")
        var title: String? = "",
        @JsonProperty("subtitle")
        var subtitle: String? = "",
        @JsonProperty("imageUri")
        var imageUri: String? = "",
        @JsonProperty("buttons")
        var buttons: List<FulfillmentButton>? = mutableListOf()
)