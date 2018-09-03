package com.ryanz.dialogflow.v2webhook.response

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.ryanz.dialogflow.v2webhook.FulfillmentContext
import com.ryanz.dialogflow.v2webhook.FulfillmentEventInput
import com.ryanz.dialogflow.v2webhook.FulfillmentMessage
import org.apache.commons.lang3.builder.EqualsBuilder
import org.apache.commons.lang3.builder.HashCodeBuilder
import org.apache.commons.lang3.builder.ToStringBuilder

// https://dialogflow.com/docs/reference/api-v2/rest/v2beta1/WebhookResponse
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
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
        var fulfillmentText: String? = null
        @JsonProperty("fulfillmentMessages")
        var fulfillmentMessages: List<FulfillmentMessage>? = null
        @JsonProperty("source")
        var source: String? = null
        @JsonProperty("payload")
        var payload: Map<String, Any>? = null
        @JsonProperty("outputContexts")
        var outputContexts: List<FulfillmentContext>? = null

        @JsonProperty("followupEventInput")
        var followupEventInput: FulfillmentEventInput? = null

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