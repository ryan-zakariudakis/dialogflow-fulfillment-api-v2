package com.ryanz.diagflow.webhook

import com.fasterxml.jackson.annotation.JsonIgnoreProperties

// https://dialogflow.com/docs/reference/api-v2/rest/v2beta1/projects.agent.intents#Image
@JsonIgnoreProperties(ignoreUnknown = true)
data class FulfillmentImage(
        var imageUri:String=""
)