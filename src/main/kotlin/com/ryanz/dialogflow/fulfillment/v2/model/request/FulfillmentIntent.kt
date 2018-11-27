package com.ryanz.dialogflow.fulfillment.v2.model.request

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.ryanz.dialogflow.fulfillment.v2.model.FulfillmentContext
import com.ryanz.dialogflow.fulfillment.v2.model.FulfillmentFollowupIntentInfo
import com.ryanz.dialogflow.fulfillment.v2.model.FulfillmentIntentPlatform
import com.ryanz.dialogflow.fulfillment.v2.model.FulfillmentMessage
import org.apache.commons.lang3.builder.EqualsBuilder
import org.apache.commons.lang3.builder.HashCodeBuilder
import org.apache.commons.lang3.builder.ToStringBuilder

// https://dialogflow.com/docs/reference/api-v2/rest/v2beta1/projects.agent.intents#Intent
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
class FulfillmentIntent() {

        constructor(name: String, displayName: String, webhookState: WebhookState, priority: Int, isFallback: Boolean, mlEnabled: Boolean, inputContextNames: List<String>, events: List<String>, trainingPhrases: List<IntentTrainingPhrase>, action: String, outputContexts: List<FulfillmentContext>, resetContexts: Boolean, parameters: Map<String, Any?>, messages: List<FulfillmentMessage>, defaultResponsePlatforms: List<FulfillmentIntentPlatform>, rootFollowupIntentName: String, parentFollowupIntentName: String, followupIntentInfo: List<FulfillmentFollowupIntentInfo>): this() {
                this.name = name
                this.displayName = displayName
                this.webhookState = webhookState
                this.priority = priority
                this.isFallback = isFallback
                this.mlEnabled = mlEnabled
                this.inputContextNames = inputContextNames
                this.events = events
                this.trainingPhrases = trainingPhrases
                this.action = action
                this.outputContexts = outputContexts
                this.resetContexts = resetContexts
                this.parameters = parameters
                this.messages = messages
                this.defaultResponsePlatforms = defaultResponsePlatforms
                this.rootFollowupIntentName = rootFollowupIntentName
                this.parentFollowupIntentName = parentFollowupIntentName
                this.followupIntentInfo = followupIntentInfo
        }

        @JsonProperty("name")
        var name: String = ""
        @JsonProperty("displayName")
        var displayName: String = ""
        @JsonProperty("webhookState")
        var webhookState: WebhookState = WebhookState.WEBHOOK_STATE_UNSPECIFIED
        @JsonProperty("priority")
        var priority: Int = 0
        @JsonProperty("isFallback")
        var isFallback: Boolean = false
        @JsonProperty("mlEnabled")
        var mlEnabled: Boolean = false
        @JsonProperty("inputContextNames")
        var inputContextNames: List<String> = mutableListOf()
        @JsonProperty("events")
        var events: List<String> = mutableListOf()
        @JsonProperty("trainingPhrases")
        var trainingPhrases: List<IntentTrainingPhrase> = mutableListOf()
        @JsonProperty("action")
        var action: String = ""
        @JsonProperty("outputContexts")
        var outputContexts: List<FulfillmentContext> = mutableListOf()
        @JsonProperty("resetContexts")
        var resetContexts: Boolean = false
        @JsonProperty("parameters")
        var parameters: Map<String, Any?> = mapOf()
        @JsonProperty("messages")
        var messages: List<FulfillmentMessage> = mutableListOf()
        @JsonProperty("defaultResponsePlatforms")
        var defaultResponsePlatforms: List<FulfillmentIntentPlatform> = mutableListOf()
        @JsonProperty("rootFollowupIntentName")
        var rootFollowupIntentName: String = ""
        @JsonProperty("parentFollowupIntentName")
        var parentFollowupIntentName: String = ""

        @JsonProperty("followupIntentInfo")
        var followupIntentInfo: List<FulfillmentFollowupIntentInfo> = mutableListOf()

        override fun equals(other: Any?): Boolean {
                return EqualsBuilder.reflectionEquals(this, other)
        }

        override fun hashCode(): Int {
                return HashCodeBuilder.reflectionHashCode(this)
        }

        override fun toString(): String {
                return ToStringBuilder.reflectionToString(this)
        }
}

// https://dialogflow.com/docs/reference/api-v2/rest/v2beta1/projects.agent.intents#WebhookState
enum class WebhookState{WEBHOOK_STATE_UNSPECIFIED,WEBHOOK_STATE_ENABLED,WEBHOOK_STATE_ENABLED_FOR_SLOT_FILLING}