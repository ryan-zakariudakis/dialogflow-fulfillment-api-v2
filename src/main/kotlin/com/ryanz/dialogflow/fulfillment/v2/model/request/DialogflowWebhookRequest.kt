package com.ryanz.dialogflow.fulfillment.v2.model.request

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty

// https://actions-on-google.github.io/actions-on-google-nodejs/interfaces/dialogflow_api_v2.googleclouddialogflowv2webhookrequest.html
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
class DialogflowWebhookRequest() {

        constructor(session: String, responseId: String, queryResult: DialogflowQueryResult, originalDetectIntentRequest: FulfillmentOriginalDetectIntentRequest): this() {
                this.originalDetectIntentRequest = originalDetectIntentRequest
                this.queryResult = queryResult
                this.responseId = responseId
                this.session = session
        }

        @JsonProperty(value = "originalDetectIntentRequest")
        var originalDetectIntentRequest: FulfillmentOriginalDetectIntentRequest = FulfillmentOriginalDetectIntentRequest()
        @JsonProperty(value = "queryResult")
        var queryResult: DialogflowQueryResult = DialogflowQueryResult()
        @JsonProperty(value = "responseId")
        var responseId: String = ""
        @JsonProperty(value = "session")
        var session: String = ""

        override fun equals(other: Any?): Boolean {
                if (this === other) return true
                if (javaClass != other?.javaClass) return false

                other as DialogflowWebhookRequest

                if (session != other.session) return false
                if (responseId != other.responseId) return false
                if (queryResult != other.queryResult) return false
                if (originalDetectIntentRequest != other.originalDetectIntentRequest) return false

                return true
        }

        override fun hashCode(): Int {
                var result = session.hashCode()
                result = 31 * result + responseId.hashCode()
                result = 31 * result + queryResult.hashCode()
                result = 31 * result + originalDetectIntentRequest.hashCode()
                return result
        }

        override fun toString(): String {
                return "DialogflowWebhookRequest(session='$session', responseId='$responseId', queryResult=$queryResult, originalDetectIntentRequest=$originalDetectIntentRequest)"
        }

}