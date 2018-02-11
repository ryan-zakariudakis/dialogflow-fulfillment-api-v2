package com.ryanz.diagflow.webhook.request

import com.fasterxml.jackson.annotation.JsonIgnoreProperties

// https://dialogflow.com/docs/reference/api-v2/rest/v2beta1/projects.agent.intents#TrainingPhrase
@JsonIgnoreProperties(ignoreUnknown = true)
data class IntentTrainingPhrase (
        var name: String = "",
        var type: TrainingPhraseType = TrainingPhraseType.TYPE_UNSPECIFIED,
        var parts: Array<TrainingPhrasePart> = arrayOf(),
        var timesAddedCount: Int = 0

)
// https://dialogflow.com/docs/reference/api-v2/rest/v2beta1/projects.agent.intents#Type
enum class TrainingPhraseType {
    TYPE_UNSPECIFIED,EXAMPLE,TEMPLATE
}
// https://dialogflow.com/docs/reference/api-v2/rest/v2beta1/projects.agent.intents#Part
@JsonIgnoreProperties(ignoreUnknown = true)
data class TrainingPhrasePart(
        var text: String = "",
        var entityType: String = "",
        var alias: String = "",
        var userDefined: Boolean = false
)