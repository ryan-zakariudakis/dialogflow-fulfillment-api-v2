package com.ryanz.diagflow.webhook

import com.fasterxml.jackson.annotation.JsonIgnoreProperties

// https://dialogflow.com/docs/reference/api-v2/rest/v2beta1/projects.agent.intents#Item
@JsonIgnoreProperties(ignoreUnknown = true)
data class FulfillmentItem(
        var info: FulfillmentSelectItemInfo = FulfillmentSelectItemInfo(),
        var title: String = "",
        var description: String = "",
        var image: FulfillmentImage = FulfillmentImage()
)