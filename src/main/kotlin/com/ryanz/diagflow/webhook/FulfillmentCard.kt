package com.ryanz.diagflow.webhook

import com.fasterxml.jackson.annotation.JsonIgnoreProperties

// https://dialogflow.com/docs/reference/api-v2/rest/v2beta1/projects.agent.intents#Card
@JsonIgnoreProperties(ignoreUnknown = true)
data class FulfillmentCard(
        var title:String="",
        var subtitle: String= "",
        var imageUri: String = "",
        var buttons: Array<FulfillmentButton> = arrayOf()
)