package com.ryanz.diagflow.webhook

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

// https://dialogflow.com/docs/reference/api-v2/rest/v2beta1/projects.agent.intents#Image
@JsonIgnoreProperties(ignoreUnknown = true)
data class FulfillmentImage(
        @JsonProperty("imageUri")
        var imageUri: String? = ""
)