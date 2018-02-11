package com.ryanz.diagflow.webhook.request

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.ryanz.diagflow.webhook.FulfillmentContext
import com.ryanz.diagflow.webhook.FulfillmentFollowupIntentInfo
import com.ryanz.diagflow.webhook.FulfillmentIntentPlatform
import com.ryanz.diagflow.webhook.FulfillmentMessage

// https://dialogflow.com/docs/reference/api-v2/rest/v2beta1/projects.agent.intents#Intent
@JsonIgnoreProperties(ignoreUnknown = true)
data class FulfillmentIntent(
        @JsonProperty("name")
        var name: String? = "",
        @JsonProperty("displayName")
        var displayName: String? = "",
        @JsonProperty("webhookState")
        var webhookState: WebhookState? = WebhookState.WEBHOOK_STATE_UNSPECIFIED,
        @JsonProperty("priority")
        var priority: Int? = 0,
        @JsonProperty("isFallback")
        var isFallback: Boolean? = false,
        @JsonProperty("mlEnabled")
        var mlEnabled: Boolean? = false,
        @JsonProperty("inputContextNames")
        var inputContextNames: List<String>? = mutableListOf(),
        @JsonProperty("events")
        var events: List<String>? = mutableListOf(),
        @JsonProperty("trainingPhrases")
        var trainingPhrases: List<IntentTrainingPhrase>? = mutableListOf(),
        @JsonProperty("action")
        var action: String? = "",
        @JsonProperty("outputContexts")
        var outputContexts: List<FulfillmentContext>? = mutableListOf(),
        @JsonProperty("resetContexts")
        var resetContexts: Boolean? = false,
        @JsonProperty("parameters")
        var parameters: Map<String, Any>? = mapOf(),
        @JsonProperty("messages")
        var messages: List<FulfillmentMessage>? = mutableListOf(),
        @JsonProperty("defaultResponsePlatforms")
        var defaultResponsePlatforms: List<FulfillmentIntentPlatform>? = mutableListOf(),
        @JsonProperty("rootFollowupIntentName")
        var rootFollowupIntentName: String? = "",
        @JsonProperty("parentFollowupIntentName")
        var parentFollowupIntentName: String? = "",
        @JsonProperty("followupIntentInfo")
        var followupIntentInfo: List<FulfillmentFollowupIntentInfo>? = mutableListOf()
)

// https://dialogflow.com/docs/reference/api-v2/rest/v2beta1/projects.agent.intents#WebhookState
enum class WebhookState{WEBHOOK_STATE_UNSPECIFIED,WEBHOOK_STATE_ENABLED,WEBHOOK_STATE_ENABLED_FOR_SLOT_FILLING}