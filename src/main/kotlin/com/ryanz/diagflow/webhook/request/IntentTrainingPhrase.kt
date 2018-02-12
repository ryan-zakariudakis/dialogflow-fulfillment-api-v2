package com.ryanz.diagflow.webhook.request

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import org.apache.commons.lang3.builder.EqualsBuilder
import org.apache.commons.lang3.builder.HashCodeBuilder
import org.apache.commons.lang3.builder.ToStringBuilder

// https://dialogflow.com/docs/reference/api-v2/rest/v2beta1/projects.agent.intents#TrainingPhrase
@JsonIgnoreProperties(ignoreUnknown = true)
class IntentTrainingPhrase {
        @JsonProperty("name")
        var name: String? = ""
        @JsonProperty("type")
        var type: TrainingPhraseType? = TrainingPhraseType.TYPE_UNSPECIFIED
        @JsonProperty("parts")
        var parts: List<TrainingPhrasePart>? = mutableListOf()
        @JsonProperty("timesAddedCount")
        var timesAddedCount: Int? = 0

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
// https://dialogflow.com/docs/reference/api-v2/rest/v2beta1/projects.agent.intents#Type
enum class TrainingPhraseType {
    TYPE_UNSPECIFIED,EXAMPLE,TEMPLATE
}
// https://dialogflow.com/docs/reference/api-v2/rest/v2beta1/projects.agent.intents#Part
@JsonIgnoreProperties(ignoreUnknown = true)
class TrainingPhrasePart() {

    constructor(text: String, entityType: String?, alias: String, userDefined: Boolean): this (){
        this.text = text
        this.entityType = entityType
        this.alias = alias
        this.userDefined = userDefined
    }

    @JsonProperty("text")
        var text: String = ""
    @JsonProperty("entityType")
        var entityType: String? = ""
    @JsonProperty("alias")
        var alias: String = ""

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