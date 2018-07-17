package com.ryanz.dialoglow.v2webhook.request

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.ryanz.dialoglow.v2webhook.FulfillmentContext
import com.ryanz.dialoglow.v2webhook.FulfillmentMessage
import org.apache.commons.lang3.builder.EqualsBuilder
import org.apache.commons.lang3.builder.HashCodeBuilder
import org.apache.commons.lang3.builder.ToStringBuilder

// https://dialogflow.com/docs/reference/api-v2/rest/v2beta1/projects.agent.sessions/detectIntent#QueryResult
@JsonIgnoreProperties(ignoreUnknown = true)
class DiagflowQueryResult() {

        constructor(queryText: String, languageCode: String, speechRecognitionConfidence: Int, action: String, parameters: Map<String, Any?>, allRequiredParamsPresent: Boolean, fulfillmentText: String, fulfillmentMessages: List<FulfillmentMessage>, webhookSource: String, webhookPayload: Map<String, Any?>, outputContexts: List<FulfillmentContext>, intent: FulfillmentIntent, intentDetectionConfidence: Int, diagnosticInfo: Map<String, Any?>): this() {
                this.queryText = queryText
                this.languageCode = languageCode
                this.speechRecognitionConfidence = speechRecognitionConfidence
                this.action = action
                this.parameters = parameters
                this.allRequiredParamsPresent = allRequiredParamsPresent
                this.fulfillmentText = fulfillmentText
                this.fulfillmentMessages = fulfillmentMessages
                this.webhookSource = webhookSource
                this.webhookPayload = webhookPayload
                this.outputContexts = outputContexts
                this.intent = intent
                this.intentDetectionConfidence = intentDetectionConfidence
                this.diagnosticInfo = diagnosticInfo
        }

        @JsonProperty("queryText")
        var queryText: String = ""
        @JsonProperty("languageCode")
        var languageCode: String = ""
        @JsonProperty("speechRecognitionConfidence")
        var speechRecognitionConfidence: Int = 0
        @JsonProperty("action")
        var action: String = ""
        @JsonProperty("parameters")
        var parameters: Map<String, Any?> = mutableMapOf()
        @JsonProperty("allRequiredParamsPresent")
        var allRequiredParamsPresent: Boolean = false
        @JsonProperty("fulfillmentText")
        var fulfillmentText: String = ""
        @JsonProperty("fulfillmentMessages")
        var fulfillmentMessages: List<FulfillmentMessage> = mutableListOf()
        @JsonProperty("webhookSource")
        var webhookSource: String = ""
        @JsonProperty("webhookPayload")
        var webhookPayload: Map<String, Any?> = mutableMapOf()
        @JsonProperty("outputContexts")
        var outputContexts: List<FulfillmentContext> = mutableListOf()
        @JsonProperty("intent")
        var intent: FulfillmentIntent = FulfillmentIntent()
        @JsonProperty("intentDetectionConfidence")
        var intentDetectionConfidence: Int = 0

        @JsonProperty("diagnosticInfo")
        var diagnosticInfo: Map<String, Any?> = mapOf()

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