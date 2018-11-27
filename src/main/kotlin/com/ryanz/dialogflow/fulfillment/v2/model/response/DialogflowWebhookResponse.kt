package com.ryanz.dialogflow.fulfillment.v2.model.response

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.ryanz.dialogflow.fulfillment.v2.model.DialogflowContext
import com.ryanz.dialogflow.fulfillment.v2.model.EventInput
import com.ryanz.dialogflow.fulfillment.v2.model.IntentMessage
import org.apache.commons.lang3.builder.EqualsBuilder
import org.apache.commons.lang3.builder.HashCodeBuilder
import org.apache.commons.lang3.builder.ToStringBuilder

// https://actions-on-google.github.io/actions-on-google-nodejs/interfaces/dialogflow_api_v2.googleclouddialogflowv2webhookresponse.html
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
class DialogflowWebhookResponse() {

        constructor(fulfillmentText: String?, fulfillmentMessages: List<IntentMessage>?, source: String?, payload: Map<String, Any>?, outputContexts: List<DialogflowContext>?, followupEventInput: EventInput?): this() {
                this.fulfillmentText = fulfillmentText
                this.fulfillmentMessages = fulfillmentMessages
                this.source = source
                this.payload = payload
                this.outputContexts = outputContexts
                this.followupEventInput = followupEventInput
        }

        @JsonProperty("followupEventInput")
        var followupEventInput: EventInput? = null
        @JsonProperty("fulfillmentMessages")
        var fulfillmentMessages: List<IntentMessage>? = null
        @JsonProperty("fulfillmentText")
        var fulfillmentText: String? = null
        @JsonProperty("outputContexts")
        var outputContexts: List<DialogflowContext>? = null
        @JsonProperty("payload")
        var payload: Map<String, Any>? = null
        @JsonProperty("source")
        var source: String? = null

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