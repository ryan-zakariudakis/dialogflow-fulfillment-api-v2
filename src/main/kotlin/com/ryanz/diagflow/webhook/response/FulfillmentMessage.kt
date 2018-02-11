package com.ryanz.diagflow.webhook.response

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.ryanz.diagflow.webhook.*

// https://dialogflow.com/docs/reference/api-v2/rest/v2beta1/projects.agent.intents#Message
@JsonIgnoreProperties(ignoreUnknown = true)
data class FulfillmentMessage(
        var platform: FulfillmentIntentPlatform,
        var text: FulfillmentText,
        var image: FulfillmentImage,
        var quickReplies: FulfillmentQuickReply = FulfillmentQuickReply(),
        var card: FulfillmentCard = FulfillmentCard(),
        var payload: String = "",
        var simpleResponses: FulfillmentSimpleResponses = FulfillmentSimpleResponses(),
        var basicCard: FulfillmentBasicCard = FulfillmentBasicCard(),
        var suggestions: FulfillmentSuggestions = FulfillmentSuggestions(),
        var linkOutSuggestion: FulfillmentLinkOutSuggestion = FulfillmentLinkOutSuggestion(),
        var listSelect: FulfillmentListSelect = FulfillmentListSelect(),
        var carouselSelect: FulfillmentCarouselSelect = FulfillmentCarouselSelect()
)