package com.ryanz.diagflow.webhook

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

// https://dialogflow.com/docs/reference/api-v2/rest/v2beta1/projects.agent.intents#BasicCard
@JsonIgnoreProperties(ignoreUnknown = true)
data class FulfillmentBasicCard(
        @JsonProperty("title")
        var title: String? = "",
        @JsonProperty("subtitle")
        var subtitle: String? = "",
        @JsonProperty("formattedText")
        var formattedText: String? = "",
        @JsonProperty("image")
        var image: FulfillmentImage? = FulfillmentImage(),
        @JsonProperty("buttons")
        var buttons: List<FulfillmentButton>? = mutableListOf()
)