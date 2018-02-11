package com.ryanz.diagflow.webhook.response

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.ryanz.diagflow.webhook.FulfillmentContext
import com.ryanz.diagflow.webhook.FulfillmentEventInput

@JsonIgnoreProperties(ignoreUnknown = true)
data class DiagflowWebhookResponse (
        var fulfillmentText:String="",
        var fulfillmentMessages: Array<FulfillmentMessage> = arrayOf(),
        var source: String = "",
        var payload: String = "",
        var outputContexts: Array<FulfillmentContext> = arrayOf(),
        var followupEventInput: FulfillmentEventInput = FulfillmentEventInput()
)