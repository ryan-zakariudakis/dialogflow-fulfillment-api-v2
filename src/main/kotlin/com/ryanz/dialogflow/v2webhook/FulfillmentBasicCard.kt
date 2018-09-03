package com.ryanz.dialogflow.v2webhook

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import org.apache.commons.lang3.builder.EqualsBuilder
import org.apache.commons.lang3.builder.HashCodeBuilder
import org.apache.commons.lang3.builder.ToStringBuilder

// https://dialogflow.com/docs/reference/api-v2/rest/v2beta1/projects.agent.intents#BasicCard
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
class FulfillmentBasicCard() {

        constructor(title: String?, subtitle: String?, formattedText: String?, image: FulfillmentImage?, buttons: List<FulfillmentButton>?): this() {
                this.title = title
                this.subtitle = subtitle
                this.formattedText = formattedText
                this.image = image
                this.buttons = buttons
        }

        @JsonProperty("title")
        var title: String? = ""
        @JsonProperty("subtitle")
        var subtitle: String? = ""
        @JsonProperty("formattedText")
        var formattedText: String? = ""
        @JsonProperty("image")
        var image: FulfillmentImage? = FulfillmentImage()

        @JsonProperty("buttons")
        var buttons: List<FulfillmentButton>? = mutableListOf()

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