package com.ryanz.dialogflow.fulfillment.v2.webhook

import com.ryanz.dialogflow.fulfillment.v2.model.request.DialogflowWebhookRequest
import com.ryanz.dialogflow.fulfillment.v2.model.response.DialogflowWebhookResponse

interface WebhookApi {
    fun handleFulfillment(dialogflowWebhookRequest: DialogflowWebhookRequest): DialogflowWebhookResponse
}