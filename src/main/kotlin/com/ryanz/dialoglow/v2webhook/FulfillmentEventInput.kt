package com.ryanz.dialoglow.v2webhook

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import org.apache.commons.lang3.builder.EqualsBuilder
import org.apache.commons.lang3.builder.HashCodeBuilder
import org.apache.commons.lang3.builder.ToStringBuilder

// https://dialogflow.com/docs/reference/api-v2/rest/v2beta1/projects.agent.sessions/detectIntent#EventInput
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
class FulfillmentEventInput() {

        constructor(name: String?, parameters: Map<String, Any?>?, languageCode: String?): this() {
                this.name = name
                this.parameters = parameters
                this.languageCode = languageCode
        }
        @JsonProperty("name")
        var name: String? = ""
        @JsonProperty("parameters")
        var parameters: Map<String, Any?>? = mapOf()

        @JsonProperty("languageCode")
        var languageCode: String? = ""

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