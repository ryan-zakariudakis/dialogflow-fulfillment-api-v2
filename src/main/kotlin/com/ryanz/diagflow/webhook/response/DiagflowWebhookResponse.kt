package com.ryanz.diagflow.webhook.response

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.ryanz.diagflow.webhook.FulfillmentContext
import com.ryanz.diagflow.webhook.FulfillmentEventInput
import com.ryanz.diagflow.webhook.FulfillmentMessage

// https://dialogflow.com/docs/reference/api-v2/rest/v2beta1/WebhookResponse
@JsonIgnoreProperties(ignoreUnknown = true)
data class DiagflowWebhookResponse (
        @JsonProperty("fulfillmentText")
        var fulfillmentText: String? = "",
        @JsonProperty("fulfillmentMessages")
        var fulfillmentMessages: List<FulfillmentMessage>? = mutableListOf(),
        @JsonProperty("source")
        var source: String? = "",
        @JsonProperty("payload")
        var payload: Map<String, Any>? = mapOf(),
        @JsonProperty("outputContexts")
        var outputContexts: List<FulfillmentContext>? = mutableListOf(),
        @JsonProperty("followupEventInput")
        var followupEventInput: FulfillmentEventInput? = FulfillmentEventInput()
)