package com.ryanz.diagflow.webhook

// https://dialogflow.com/docs/reference/api-v2/rest/v2beta1/projects.agent.sessions.contexts#Context
data class FulfillmentContext (
        var name: String = "",
        var lifespanCount: Int = 0,
        var parameters: String = ""
)