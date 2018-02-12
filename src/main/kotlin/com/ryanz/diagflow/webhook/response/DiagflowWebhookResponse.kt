package com.ryanz.diagflow.webhook.response

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.ryanz.diagflow.webhook.FulfillmentContext
import com.ryanz.diagflow.webhook.FulfillmentEventInput
import com.ryanz.diagflow.webhook.FulfillmentMessage
import org.apache.commons.lang3.builder.EqualsBuilder
import org.apache.commons.lang3.builder.HashCodeBuilder
import org.apache.commons.lang3.builder.ToStringBuilder

// https://dialogflow.com/docs/reference/api-v2/rest/v2beta1/WebhookResponse
@JsonIgnoreProperties(ignoreUnknown = true)
class DiagflowWebhookResponse() {

        constructor(fulfillmentText: String?, fulfillmentMessages: List<FulfillmentMessage>?, source: String?, payload: Map<String, Any>?, outputContexts: List<FulfillmentContext>?, followupEventInput: FulfillmentEventInput?): this() {
                this.fulfillmentText = fulfillmentText
                this.fulfillmentMessages = fulfillmentMessages
                this.source = source
                this.payload = payload
                this.outputContexts = outputContexts
                this.followupEventInput = followupEventInput
        }

        @JsonProperty("fulfillmentText")
        var fulfillmentText: String? = ""
        @JsonProperty("fulfillmentMessages")
        var fulfillmentMessages: List<FulfillmentMessage>? = mutableListOf()
        @JsonProperty("source")
        var source: String? = ""
        @JsonProperty("payload")
        var payload: Map<String, Any>? = mapOf()
        @JsonProperty("outputContexts")
        var outputContexts: List<FulfillmentContext>? = mutableListOf()

        @JsonProperty("followupEventInput")
        var followupEventInput: FulfillmentEventInput? = FulfillmentEventInput()

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