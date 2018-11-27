package com.ryanz.dialogflow.fulfillment.v2.model

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import org.apache.commons.lang3.builder.EqualsBuilder
import org.apache.commons.lang3.builder.HashCodeBuilder
import org.apache.commons.lang3.builder.ToStringBuilder

// https://actions-on-google.github.io/actions-on-google-nodejs/interfaces/dialogflow_api_v2.googleclouddialogflowv2intentmessagelistselectitem.html
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
class IntentMessageListSelectItem() {

        constructor(info: IntentMessageSelectItemInfo?, title: String?, description: String?, image: IntentMessageImage?): this() {
                this.description = description
                this.image = image
                this.info = info
                this.title = title
        }

        @JsonProperty("description")
        var description: String? = ""
        @JsonProperty("image")
        var image: IntentMessageImage? = null
        @JsonProperty("info")
        var info: IntentMessageSelectItemInfo? = null
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