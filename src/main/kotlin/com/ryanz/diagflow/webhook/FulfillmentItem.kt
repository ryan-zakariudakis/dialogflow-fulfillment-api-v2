package com.ryanz.diagflow.webhook

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

// https://dialogflow.com/docs/reference/api-v2/rest/v2beta1/projects.agent.intents#Item
@JsonIgnoreProperties(ignoreUnknown = true)
data class FulfillmentItem(
        @JsonProperty("info")
        var info: FulfillmentSelectItemInfo? = FulfillmentSelectItemInfo(),
        @JsonProperty("title")
        var title: String? = "",
        @JsonProperty("description")
        var description: String? = "",
        @JsonProperty("image")
        var image: FulfillmentImage? = FulfillmentImage()
)