package com.ryanz.dialogflow.fulfillment.v2.model

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import org.apache.commons.lang3.builder.EqualsBuilder
import org.apache.commons.lang3.builder.HashCodeBuilder
import org.apache.commons.lang3.builder.ToStringBuilder

// https://actions-on-google.github.io/actions-on-google-nodejs/interfaces/dialogflow_api_v2.googleclouddialogflowv2intentmessagesimpleresponses.html
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
class IntentMessageSimpleResponses() {

        constructor(simpleResponses: List<IntentMessageSimpleResponse>?): this() {
                this.simpleResponses = simpleResponses
        }

        @JsonProperty("simpleResponses")
        var simpleResponses: List<IntentMessageSimpleResponse>? = mutableListOf()

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

// https://actions-on-google.github.io/actions-on-google-nodejs/interfaces/dialogflow_api_v2.googleclouddialogflowv2intentmessagesimpleresponse.html
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
class IntentMessageSimpleResponse() {

        constructor(textToSpeech: String?, ssml: String?, displayText: String?): this() {
                this.displayText = displayText
                this.ssml = ssml
                this.textToSpeech = textToSpeech
        }

        @JsonProperty("displayText")
        var displayText: String? = ""
        @JsonProperty("ssml")
        var ssml: String? = null
        @JsonProperty("textToSpeech")
        var textToSpeech: String? = null

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