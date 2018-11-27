package com.ryanz.dialogflow.fulfillment.v2.model

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import org.apache.commons.lang3.builder.EqualsBuilder
import org.apache.commons.lang3.builder.HashCodeBuilder
import org.apache.commons.lang3.builder.ToStringBuilder

// https://actions-on-google.github.io/actions-on-google-nodejs/interfaces/dialogflow_api_v2.googleclouddialogflowv2intentmessagesuggestions.html
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
class IntentMessageSuggestions() {

    constructor(suggestions: List<IntentMessageSuggestion>?): this() {
        this.suggestions = suggestions
    }

    @JsonProperty("suggestions")
    var suggestions: List<IntentMessageSuggestion>? = mutableListOf()

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
// https://actions-on-google.github.io/actions-on-google-nodejs/interfaces/dialogflow_api_v2.googleclouddialogflowv2intentmessagesuggestion.html
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
class IntentMessageSuggestion() {


    constructor(title: String?): this() {
        this.title = title
    }

    @JsonProperty("title")
    var title: String? = ""

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