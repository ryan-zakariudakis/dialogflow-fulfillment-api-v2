package com.ryanz.diagflow.webhook.request

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.ryanz.diagflow.webhook.FulfillmentContext
import com.ryanz.diagflow.webhook.FulfillmentMessage

// https://dialogflow.com/docs/reference/api-v2/rest/v2beta1/projects.agent.sessions/detectIntent#QueryResult
@JsonIgnoreProperties(ignoreUnknown = true)
data class DiagflowQueryResult (
        @JsonProperty("queryText")
        var queryText: String? = "",
        @JsonProperty("languageCode")
        var languageCode: String? = "",
        @JsonProperty("speechRecognitionConfidence")
        var speechRecognitionConfidence: Int? = 0,
        @JsonProperty("action")
        var action: String? = "",
        @JsonProperty("parameters")
        var parameters: Map<String,Any>? = mutableMapOf(),
        @JsonProperty("allRequiredParamsPresent")
        var allRequiredParamsPresent: Boolean? = false,
        @JsonProperty("fulfillmentText")
        var fulfillmentText: String? = "",
        @JsonProperty("fulfillmentMessages")
        var fulfillmentMessages: List<FulfillmentMessage>? = mutableListOf(),
        @JsonProperty("webhookSource")
        var webhookSource: String? = "",
        @JsonProperty("webhookPayload")
        var webhookPayload: Map<String,Any>? = mutableMapOf(),
        @JsonProperty("outputContexts")
        var outputContexts: List<FulfillmentContext>? = mutableListOf(),
        @JsonProperty("intent")
        var intent: FulfillmentIntent? = FulfillmentIntent(),
        @JsonProperty("intentDetectionConfidence")
        var intentDetectionConfidence: Int? = 0,
        @JsonProperty("diagnosticInfo")
        var diagnosticInfo: Map<String, Any>? = mapOf()
)