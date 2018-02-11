package com.ryanz.diagflow.webhook

import com.fasterxml.jackson.annotation.JsonIgnoreProperties

// https://dialogflow.com/docs/reference/api-v2/rest/v2beta1/projects.agent.intents#BasicCard
@JsonIgnoreProperties(ignoreUnknown = true)
data class FulfillmentBasicCard(
        var title:String="",
        var subtitle: String= "",
        var formattedText: String = "",
        var image: FulfillmentImage = FulfillmentImage(),
        var butons: Array<FulfillmentButton> = arrayOf()
)