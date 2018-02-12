package com.ryanz.diagflow.webhook

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import org.apache.commons.lang3.builder.EqualsBuilder
import org.apache.commons.lang3.builder.HashCodeBuilder
import org.apache.commons.lang3.builder.ToStringBuilder

// https://dialogflow.com/docs/reference/api-v2/rest/v2beta1/projects.agent.sessions.contexts#Context
@JsonIgnoreProperties(ignoreUnknown = true)
class FulfillmentContext() {

        constructor(name: String?, lifespanCount: Int?, parameters: Map<String, Any>?): this() {
                this.name = name
                this.lifespanCount = lifespanCount
                this.parameters = parameters
        }

        @JsonProperty("name")
        var name: String? = ""
        @JsonProperty("lifespanCount")
        var lifespanCount: Int? = 0

        @JsonProperty("parameters")
        var parameters: Map<String, Any>? = mapOf()

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