package com.ryanz.dialogflow.fulfillment.v2.model.request

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import org.apache.commons.lang3.builder.EqualsBuilder
import org.apache.commons.lang3.builder.HashCodeBuilder
import org.apache.commons.lang3.builder.ToStringBuilder

// https://actions-on-google.github.io/actions-on-google-nodejs/interfaces/dialogflow_api_v2.googleclouddialogflowv2intenttrainingphrase.html
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
class IntentTrainingPhrase {
    @JsonProperty("name")
    var name: String? = ""
    @JsonProperty("parts")
    var parts: List<TrainingPhrasePart>? = mutableListOf()
    @JsonProperty("timesAddedCount")
    var timesAddedCount: Int? = 0
    @JsonProperty("type")
    var type: TrainingPhraseType? = TrainingPhraseType.TYPE_UNSPECIFIED

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

// https://actions-on-google.github.io/actions-on-google-nodejs/modules/dialogflow_api_v2.html#googleclouddialogflowv2intenttrainingphrasetype
enum class TrainingPhraseType {
    TYPE_UNSPECIFIED,EXAMPLE,TEMPLATE
}

// https://actions-on-google.github.io/actions-on-google-nodejs/interfaces/dialogflow_api_v2.googleclouddialogflowv2intenttrainingphrasepart.html
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
class TrainingPhrasePart() {

    constructor(text: String, entityType: String?, alias: String, userDefined: Boolean): this (){
        this.alias = alias
        this.entityType = entityType
        this.text = text
        this.userDefined = userDefined
    }

    @JsonProperty("alias")
    var alias: String = ""
    @JsonProperty("entityType")
    var entityType: String? = ""
    @JsonProperty("text")
    var text: String = ""
    @JsonProperty("userDefined")
    var userDefined: Boolean = false

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