package com.ryanz.diagflow.webhook

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

// https://dialogflow.com/docs/reference/api-v2/rest/v2beta1/projects.agent.intents#Message
@JsonIgnoreProperties(ignoreUnknown = true)
data class FulfillmentMessage(
        @JsonProperty("platform")
        var platform: FulfillmentIntentPlatform? = FulfillmentIntentPlatform.PLATFORM_UNSPECIFIED,
        @JsonProperty("text")
        var text: FulfillmentText? = FulfillmentText(),
        @JsonProperty("image")
        var image: FulfillmentImage? = FulfillmentImage(),
        @JsonProperty("quickReplies")
        var quickReplies: FulfillmentQuickReply? = FulfillmentQuickReply(),
        @JsonProperty("card")
        var card: FulfillmentCard? = FulfillmentCard(),
        @JsonProperty("payload")
        var payload: Map<String, Any>? = mapOf(),
        @JsonProperty("simpleResponses")
        var simpleResponses: FulfillmentSimpleResponses? = FulfillmentSimpleResponses(),
        @JsonProperty("basicCard")
        var basicCard: FulfillmentBasicCard? = FulfillmentBasicCard(),
        @JsonProperty("suggestions")
        var suggestions: FulfillmentSuggestions? = FulfillmentSuggestions(),
        @JsonProperty("linkOutSuggestion")
        var linkOutSuggestion: FulfillmentLinkOutSuggestion? = FulfillmentLinkOutSuggestion(),
        @JsonProperty("listSelect")
        var listSelect: FulfillmentListSelect? = FulfillmentListSelect(),
        @JsonProperty("carouselSelect")
        var carouselSelect: FulfillmentCarouselSelect? = FulfillmentCarouselSelect()
)