package com.ryanz.diagflow.webhook.request

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
// https://dialogflow.com/docs/reference/api-v2/rest/v2beta1/OriginalDetectIntentRequest
@JsonIgnoreProperties(ignoreUnknown = true)
data class FulfillmentOriginalDetectIntentRequest (
        var source: String = "",
        var payload: Map<String, String> = mapOf()
)