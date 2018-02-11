package com.ryanz.diagflow.webhook.request

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

// https://dialogflow.com/docs/reference/api-v2/rest/v2beta1/WebhookRequest
@JsonIgnoreProperties(ignoreUnknown = true)
data class DiagflowWebhookRequest (
        @JsonProperty(value = "session")
        var session: String? = "",
        @JsonProperty(value = "responseId")
        var responseId: String? = "",
        @JsonProperty(value = "queryResult")
        var queryResult: DiagflowQueryResult? = DiagflowQueryResult(),
        @JsonProperty(value = "originalDetectIntentRequest")
        var originalDetectIntentRequest: FulfillmentOriginalDetectIntentRequest? = FulfillmentOriginalDetectIntentRequest()
)

