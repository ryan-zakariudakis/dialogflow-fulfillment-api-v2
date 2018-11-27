package com.ryanz.dialogflow.fulfillment.v2.model

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.ryanz.dialogflow.fulfillment.v2.model.request.IntentTrainingPhrase
import org.apache.commons.lang3.builder.EqualsBuilder
import org.apache.commons.lang3.builder.HashCodeBuilder
import org.apache.commons.lang3.builder.ToStringBuilder

// https://actions-on-google.github.io/actions-on-google-nodejs/interfaces/dialogflow_api_v2.googleclouddialogflowv2intent.html
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
class Intent() {

        constructor(name: String, displayName: String, webhookState: WebhookState, priority: Int, isFallback: Boolean, mlDisabled: Boolean, inputContextNames: List<String>, events: List<String>, trainingPhrases: List<IntentTrainingPhrase>, action: String, outputContexts: List<DialogflowContext>, resetContexts: Boolean, parameters: List<IntentParameter>, messages: List<IntentMessage>, defaultResponsePlatforms: List<IntentMessagePlatform>, rootFollowupIntentName: String, parentFollowupIntentName: String, followupIntentInfo: List<IntentFollowupIntentInfo>): this() {
                this.action = action
                this.defaultResponsePlatforms = defaultResponsePlatforms
                this.displayName = displayName
                this.events = events
                this.followupIntentInfo = followupIntentInfo
                this.inputContextNames = inputContextNames
                this.isFallback = isFallback
                this.messages = messages
                this.mlDisabled = mlDisabled
                this.name = name
                this.outputContexts = outputContexts
                this.parameters = parameters
                this.parentFollowupIntentName = parentFollowupIntentName
                this.priority = priority
                this.resetContexts = resetContexts
                this.rootFollowupIntentName = rootFollowupIntentName
                this.trainingPhrases = trainingPhrases
                this.webhookState = webhookState
        }

        @JsonProperty("action")
        var action: String = ""
        @JsonProperty("defaultResponsePlatforms")
        var defaultResponsePlatforms: List<IntentMessagePlatform> = mutableListOf()
        @JsonProperty("displayName")
        var displayName: String = ""
        @JsonProperty("events")
        var events: List<String> = mutableListOf()
        @JsonProperty("followupIntentInfo")
        var followupIntentInfo: List<IntentFollowupIntentInfo> = mutableListOf()
        @JsonProperty("inputContextNames")
        var inputContextNames: List<String> = mutableListOf()
        @JsonProperty("isFallback")
        var isFallback: Boolean = false
        @JsonProperty("messages")
        var messages: List<IntentMessage> = mutableListOf()
        @JsonProperty("mlDisabled")
        var mlDisabled: Boolean = false
        @JsonProperty("name")
        var name: String = ""
        @JsonProperty("outputContexts")
        var outputContexts: List<DialogflowContext> = mutableListOf()
        @JsonProperty("parameters")
        var parameters: List<IntentParameter> = mutableListOf()
        @JsonProperty("parentFollowupIntentName")
        var parentFollowupIntentName: String = ""
        @JsonProperty("priority")
        var priority: Int = 0
        @JsonProperty("resetContexts")
        var resetContexts: Boolean = false
        @JsonProperty("rootFollowupIntentName")
        var rootFollowupIntentName: String = ""
        @JsonProperty("trainingPhrases")
        var trainingPhrases: List<IntentTrainingPhrase> = mutableListOf()
        @JsonProperty("webhookState")
        var webhookState: WebhookState = WebhookState.WEBHOOK_STATE_UNSPECIFIED

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

// https://actions-on-google.github.io/actions-on-google-nodejs/modules/dialogflow_api_v2.html#googleclouddialogflowv2intentwebhookstate
enum class WebhookState{WEBHOOK_STATE_UNSPECIFIED,WEBHOOK_STATE_ENABLED,WEBHOOK_STATE_ENABLED_FOR_SLOT_FILLING}