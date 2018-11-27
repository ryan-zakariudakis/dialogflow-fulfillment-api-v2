package com.ryanz.dialogflow.fulfillment.v2.model

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import org.apache.commons.lang3.builder.EqualsBuilder
import org.apache.commons.lang3.builder.HashCodeBuilder
import org.apache.commons.lang3.builder.ToStringBuilder

// https://actions-on-google.github.io/actions-on-google-nodejs/interfaces/dialogflow_api_v2.googleclouddialogflowv2intentmessagebasiccard.html
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
class IntentMessageBasicCard() {

        constructor(title: String?, subtitle: String?, formattedText: String?, image: IntentMessageImage?, buttons: List<IntentMessageBasicCardButton>?): this() {
                this.buttons = buttons
                this.formattedText = formattedText
                this.image = image
                this.subtitle = subtitle
                this.title = title
        }

        @JsonProperty("buttons")
        var buttons: List<IntentMessageBasicCardButton>? = mutableListOf()
        @JsonProperty("formattedText")
        var formattedText: String? = ""
        @JsonProperty("image")
        var image: IntentMessageImage? = IntentMessageImage()
        @JsonProperty("subtitle")
        var subtitle: String? = ""
        @JsonProperty("title")
        var title: String? = ""

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