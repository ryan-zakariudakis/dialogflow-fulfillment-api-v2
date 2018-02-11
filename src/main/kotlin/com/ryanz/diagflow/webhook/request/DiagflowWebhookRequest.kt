package com.ryanz.diagflow.webhook.request

import com.fasterxml.jackson.annotation.JsonIgnoreProperties

@JsonIgnoreProperties(ignoreUnknown = true)
data class DiagflowWebhookRequest (
        var session: String = "",
        var responseId: String = "",
        var queryResult: DiagflowQueryResult = DiagflowQueryResult(),
        var originalDetectIntentRequest: FulfillmentOriginalDetectIntentRequest = FulfillmentOriginalDetectIntentRequest()
)

