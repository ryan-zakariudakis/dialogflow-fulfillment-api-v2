package com.ryanz.dialoglow.v2webhook

// https://dialogflow.com/docs/reference/api-v2/rest/v2beta1/projects.agent.intents#Platform
enum class FulfillmentIntentPlatform {
    PLATFORM_UNSPECIFIED,
    FACEBOOK,
    SLACK,
    TELEGRAM,
    KIK,
    SKYPE,
    LINE,
    VIBER,
    ACTIONS_ON_GOOGLE
}