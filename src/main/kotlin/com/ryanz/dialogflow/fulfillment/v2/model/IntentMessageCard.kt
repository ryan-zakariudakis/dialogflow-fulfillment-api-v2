package com.ryanz.dialogflow.fulfillment.v2.model

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import org.apache.commons.lang3.builder.EqualsBuilder
import org.apache.commons.lang3.builder.HashCodeBuilder
import org.apache.commons.lang3.builder.ToStringBuilder

// https://actions-on-google.github.io/actions-on-google-nodejs/interfaces/dialogflow_api_v2.googleclouddialogflowv2intentmessagecard.html
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
class IntentMessageCard() {

        constructor(title: String?, subtitle: String?, imageUri: String?, buttons: List<IntentMessageCardButton>?): this() {
                this.buttons = buttons
                this.imageUri = imageUri
                this.subtitle = subtitle
                this.title = title
        }

        @JsonProperty("buttons")
        var buttons: List<IntentMessageCardButton>? = mutableListOf()
        @JsonProperty("imageUri")
        var imageUri: String? = ""
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