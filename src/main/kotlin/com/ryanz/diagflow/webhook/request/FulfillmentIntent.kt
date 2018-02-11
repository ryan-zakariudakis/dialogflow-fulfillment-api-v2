package com.ryanz.diagflow.webhook.request

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.ryanz.diagflow.webhook.FulfillmentContext
import com.ryanz.diagflow.webhook.FulfillmentFollowupIntentInfo
import com.ryanz.diagflow.webhook.FulfillmentIntentPlatform
import com.ryanz.diagflow.webhook.response.FulfillmentMessage

// https://dialogflow.com/docs/reference/api-v2/rest/v2beta1/projects.agent.intents#Intent
@JsonIgnoreProperties(ignoreUnknown = true)
data class FulfillmentIntent(
        var name:String="",
        var displayName:String="",
        var webhookState:WebhookState = WebhookState.WEBHOOK_STATE_UNSPECIFIED,
        var priority: Int = 0,
        var isFallback: Boolean = false,
        var mlEnabled: Boolean = false,
        var inputContextNames: Array<String> = arrayOf(),
        var events: Array<String> = arrayOf(),
        var trainingPhrases: Array<IntentTrainingPhrase> = arrayOf(),
        var action: String = "",
        var outputContexts: Array<FulfillmentContext> = arrayOf(),
        var resetContexts: Boolean = false,
        var parameters: Map<String, String> = mapOf(),
        var messages: Array<FulfillmentMessage> = arrayOf(),
        var defaultResponsePlatforms: Array<FulfillmentIntentPlatform> = arrayOf(),
        var rootFollowupIntentName: String = "",
        var parentFollowupIntentName: String = "",
        var followupIntentInfo: Array<FulfillmentFollowupIntentInfo> = arrayOf()
)

enum class WebhookState{WEBHOOK_STATE_UNSPECIFIED,WEBHOOK_STATE_ENABLED,WEBHOOK_STATE_ENABLED_FOR_SLOT_FILLING}