package com.ryanz.diagflow.webhook.request

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

// https://dialogflow.com/docs/reference/api-v2/rest/v2beta1/projects.agent.intents#TrainingPhrase
@JsonIgnoreProperties(ignoreUnknown = true)
data class IntentTrainingPhrase (
        @JsonProperty("name")
        var name: String? = "",
        @JsonProperty("type")
        var type: TrainingPhraseType? = TrainingPhraseType.TYPE_UNSPECIFIED,
        @JsonProperty("parts")
        var parts: List<TrainingPhrasePart>? = mutableListOf(),
        @JsonProperty("timesAddedCount")
        var timesAddedCount: Int? = 0

)
// https://dialogflow.com/docs/reference/api-v2/rest/v2beta1/projects.agent.intents#Type
enum class TrainingPhraseType {
    TYPE_UNSPECIFIED,EXAMPLE,TEMPLATE
}
// https://dialogflow.com/docs/reference/api-v2/rest/v2beta1/projects.agent.intents#Part
@JsonIgnoreProperties(ignoreUnknown = true)
data class TrainingPhrasePart(
        @JsonProperty("text")
        var text: String? = "",
        @JsonProperty("entityType")
        var entityType: String? = "",
        @JsonProperty("alias")
        var alias: String? = "",
        @JsonProperty("userDefined")
        var userDefined: Boolean? = false
)