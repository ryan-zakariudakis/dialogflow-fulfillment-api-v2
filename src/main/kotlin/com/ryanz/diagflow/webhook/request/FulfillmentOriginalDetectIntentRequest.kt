package com.ryanz.diagflow.webhook.request

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

// https://dialogflow.com/docs/reference/api-v2/rest/v2beta1/OriginalDetectIntentRequest
@JsonIgnoreProperties(ignoreUnknown = true)
data class FulfillmentOriginalDetectIntentRequest (
        @JsonProperty("source")
        var source: String? = "",
        @JsonProperty("payload")
        var payload: Map<String, Any>? = mapOf()
)