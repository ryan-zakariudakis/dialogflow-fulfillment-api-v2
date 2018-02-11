package com.ryanz.diagflow.webhook.request

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.ryanz.diagflow.webhook.FulfillmentContext
import com.ryanz.diagflow.webhook.response.FulfillmentMessage

// https://dialogflow.com/docs/reference/api-v2/rest/v2beta1/projects.agent.sessions/detectIntent#QueryResult
@JsonIgnoreProperties(ignoreUnknown = true)
data class DiagflowQueryResult (
        var queryText: String = "",
        var languageCode: String = "",
        var speechRecognitionConfidence: Int = 0,
        var action: String = "",
        var parameters: Map<String,String> = mutableMapOf(),
        var allRequiredParamsPresent: Boolean = false,
        var fulfillmentText: String = "",
        var fulfillmentMessages: Array<FulfillmentMessage> = arrayOf(),
        var webhookSource: String = "",
        var webhookPayload: Map<String,String> = mutableMapOf(),
        var outputContexts: List<FulfillmentContext> = mutableListOf(),
        var intent: FulfillmentIntent = FulfillmentIntent(),
        var intentDetectionConfidence: Int = 0,
        var diagnosticInfo: Map<String, String> = mapOf()
)