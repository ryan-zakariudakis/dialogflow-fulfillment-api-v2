package com.ryanz.dialogflow.fulfillment.v2.model

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import org.apache.commons.lang3.builder.EqualsBuilder
import org.apache.commons.lang3.builder.HashCodeBuilder
import org.apache.commons.lang3.builder.ToStringBuilder

// https://actions-on-google.github.io/actions-on-google-nodejs/interfaces/dialogflow_api_v2.googleclouddialogflowv2intentmessage.html
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
class IntentMessage() {

        constructor(platform: IntentMessagePlatform, text: IntentMessageText?, image: IntentMessageImage?, quickReplies: IntentMessageQuickRepies?, card: IntentMessageCard?, payload: Map<String, Any>?, simpleResponses: IntentMessageSimpleResponses?, basicCard: IntentMessageBasicCard?, suggestions: IntentMessageSuggestions?, linkOutSuggestion: IntentMessageLinkOutSuggestion?, listSelect: IntentMessageListSelect?, carouselSelect: IntentMessageCarouselSelect?): this() {
                this.basicCard = basicCard
                this.card = card
                this.carouselSelect = carouselSelect
                this.image = image
                this.linkOutSuggestion = linkOutSuggestion
                this.listSelect = listSelect
                this.payload = payload
                this.platform = platform
                this.quickReplies = quickReplies
                this.simpleResponses = simpleResponses
                this.suggestions = suggestions
                this.text = text
        }

        @JsonProperty("basicCard")
        var basicCard: IntentMessageBasicCard? = null
        @JsonProperty("card")
        var card: IntentMessageCard? = null
        @JsonProperty("carouselSelect")
        var carouselSelect: IntentMessageCarouselSelect? = null
        @JsonProperty("image")
        var image: IntentMessageImage? = null
        @JsonProperty("linkOutSuggestion")
        var linkOutSuggestion: IntentMessageLinkOutSuggestion? = null
        @JsonProperty("listSelect")
        var listSelect: IntentMessageListSelect? = null
        @JsonProperty("payload")
        var payload: Map<String, Any>? = null
        @JsonProperty("platform")
        var platform: IntentMessagePlatform = IntentMessagePlatform.PLATFORM_UNSPECIFIED
        @JsonProperty("quickReplies")
        var quickReplies: IntentMessageQuickRepies? = null
        @JsonProperty("simpleResponses")
        var simpleResponses: IntentMessageSimpleResponses? = null
        @JsonProperty("suggestions")
        var suggestions: IntentMessageSuggestions? = null
        @JsonProperty("text")
        var text: IntentMessageText? = null

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