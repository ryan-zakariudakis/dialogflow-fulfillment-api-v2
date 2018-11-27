package com.ryanz.dialogflow.fulfillment.v2.model.request

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import org.apache.commons.lang3.builder.EqualsBuilder
import org.apache.commons.lang3.builder.HashCodeBuilder
import org.apache.commons.lang3.builder.ToStringBuilder

// https://actions-on-google.github.io/actions-on-google-nodejs/interfaces/dialogflow_api_v2.googleclouddialogflowv2originaldetectintentrequest.html
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
class FulfillmentOriginalDetectIntentRequest() {

    constructor(source: String, payload: Map<String, Any?>): this() {
        this.payload = payload
        this.source = source
    }

    @JsonProperty("payload")
    var payload: Map<String, Any?> = mapOf()
    @JsonProperty("source")
    var source: String = ""

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