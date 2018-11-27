package com.ryanz.dialogflow.fulfillment.v2.model.request

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.ryanz.dialogflow.fulfillment.v2.model.DialogflowContext
import com.ryanz.dialogflow.fulfillment.v2.model.Intent
import com.ryanz.dialogflow.fulfillment.v2.model.IntentMessage
import org.apache.commons.lang3.builder.EqualsBuilder
import org.apache.commons.lang3.builder.HashCodeBuilder
import org.apache.commons.lang3.builder.ToStringBuilder

// https://actions-on-google.github.io/actions-on-google-nodejs/interfaces/dialogflow_api_v2.googleclouddialogflowv2queryresult.html
@JsonIgnoreProperties(ignoreUnknown = true)
class DialogflowQueryResult() {

        constructor(queryText: String, languageCode: String, speechRecognitionConfidence: Int, action: String, parameters: Map<String, Any?>, allRequiredParamsPresent: Boolean, fulfillmentText: String, fulfillmentMessages: List<IntentMessage>, webhookSource: String, webhookPayload: Map<String, Any?>, outputContexts: List<DialogflowContext>, intent: Intent, intentDetectionConfidence: Int, diagnosticInfo: Map<String, Any?>): this() {
                this.action = action
                this.allRequiredParamsPresent = allRequiredParamsPresent
                this.diagnosticInfo = diagnosticInfo
                this.fulfillmentMessages = fulfillmentMessages
                this.fulfillmentText = fulfillmentText
                this.intent = intent
                this.intentDetectionConfidence = intentDetectionConfidence
                this.languageCode = languageCode
                this.outputContexts = outputContexts
                this.parameters = parameters
                this.queryText = queryText
                this.speechRecognitionConfidence = speechRecognitionConfidence
                this.webhookPayload = webhookPayload
                this.webhookSource = webhookSource
        }

        @JsonProperty("action")
        var action: String = ""
        @JsonProperty("allRequiredParamsPresent")
        var allRequiredParamsPresent: Boolean = false
        @JsonProperty("diagnosticInfo")
        var diagnosticInfo: Map<String, Any?> = mapOf()
        @JsonProperty("fulfillmentMessages")
        var fulfillmentMessages: List<IntentMessage> = mutableListOf()
        @JsonProperty("fulfillmentText")
        var fulfillmentText: String = ""
        @JsonProperty("intent")
        var intent: Intent = Intent()
        @JsonProperty("intentDetectionConfidence")
        var intentDetectionConfidence: Int = 0
        @JsonProperty("languageCode")
        var languageCode: String = ""
        @JsonProperty("outputContexts")
        var outputContexts: List<DialogflowContext> = mutableListOf()
        @JsonProperty("parameters")
        var parameters: Map<String, Any?> = mutableMapOf()
        @JsonProperty("queryText")
        var queryText: String = ""
        @JsonProperty("speechRecognitionConfidence")
        var speechRecognitionConfidence: Int = 0
        @JsonProperty("webhookPayload")
        var webhookPayload: Map<String, Any?> = mutableMapOf()
        @JsonProperty("webhookSource")
        var webhookSource: String = ""

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