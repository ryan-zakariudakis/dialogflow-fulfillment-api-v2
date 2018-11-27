package com.ryanz.dialogflow.fulfillment.v2.model

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import org.apache.commons.lang3.builder.EqualsBuilder
import org.apache.commons.lang3.builder.HashCodeBuilder
import org.apache.commons.lang3.builder.ToStringBuilder

// https://actions-on-google.github.io/actions-on-google-nodejs/interfaces/dialogflow_api_v2.googleclouddialogflowv2intentparameter.html
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
class IntentParameter() {

    constructor(name: String?, displayName: String?, value: String?, defaultValue: String?, entityTypeDisplayName: String?, mandatory: Boolean?, prompts: List<String>, isList: Boolean?): this() {
        this.name = name
        this.displayName = displayName
        this.value = value
        this.defaultValue = defaultValue
        this.entityTypeDisplayName = entityTypeDisplayName
        this.mandatory = mandatory
        this.prompts = prompts
        this.isList = isList
    }
    @JsonProperty("name")
    var name: String? = ""
    @JsonProperty("displayName")
    var displayName: String? = ""
    @JsonProperty("value")
    var value: String? = ""
    @JsonProperty("defaultValue")
    var defaultValue: String? = ""
    @JsonProperty("entityTypeDisplayName")
    var entityTypeDisplayName: String? = ""
    @JsonProperty("mandatory")
    var mandatory: Boolean? = false
    @JsonProperty("prompts")
    var prompts: List<String> = mutableListOf()
    @JsonProperty("parameters")
    var isList: Boolean? = false

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