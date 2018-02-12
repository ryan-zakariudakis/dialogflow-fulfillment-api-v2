package com.ryanz.diagflow.webhook.request

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

// https://dialogflow.com/docs/reference/api-v2/rest/v2beta1/WebhookRequest
@JsonIgnoreProperties(ignoreUnknown = true)
class DiagflowWebhookRequest() {

        constructor(session: String, responseId: String, queryResult: DiagflowQueryResult, originalDetectIntentRequest: FulfillmentOriginalDetectIntentRequest): this() {
                this.session = session
                this.responseId = responseId
                this.queryResult = queryResult
                this.originalDetectIntentRequest = originalDetectIntentRequest
        }

        @JsonProperty(value = "session")
        var session: String = ""
        @JsonProperty(value = "responseId")
        var responseId: String = ""
        @JsonProperty(value = "queryResult")
        var queryResult: DiagflowQueryResult = DiagflowQueryResult()

        @JsonProperty(value = "originalDetectIntentRequest")
        var originalDetectIntentRequest: FulfillmentOriginalDetectIntentRequest = FulfillmentOriginalDetectIntentRequest()

        override fun equals(other: Any?): Boolean {
                if (this === other) return true
                if (javaClass != other?.javaClass) return false

                other as DiagflowWebhookRequest

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
                return "DiagflowWebhookRequest(session='$session', responseId='$responseId', queryResult=$queryResult, originalDetectIntentRequest=$originalDetectIntentRequest)"
        }

}