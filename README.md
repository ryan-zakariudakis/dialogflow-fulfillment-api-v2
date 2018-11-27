# Kotlin data structures for the Dialogflow Fulfillment Webhook API

kotlin API for the Dialogflow Fulfillment v2 API for use in jvm based projects

https://actions-on-google.github.io/actions-on-google-nodejs/interfaces/dialogflow_api_v2.googleclouddialogflowv2webhookrequest.html

https://actions-on-google.github.io/actions-on-google-nodejs/interfaces/dialogflow_api_v2.googleclouddialogflowv2webhookresponse.html

Do not use Kotlin data classes.  Use plain classes and remember to implement equals()/hashCode()/toString(). Use Commons-Lang to counteract the boilerplate annoyance.
This is to ensure optional fields can be assigned defaults without requiring `?` throught the code base and the resultant `!!` in any clients.
This is required because of the way jackson works, it tries to override existing values with null on new object creation.

## To use this project

`cd ~`

`git clone git@github.com:ryan-zakariudakis/dialogflow-fulfillment-api-v2.git`

`cd dialogflow-fulfillment-api-v2`

`mvn clean install`

Add this to your pom.xml for your own implementing project:

`<dependency>
 <groupId>com.ryanz.diagflow</groupId>
 <artifactId>dialogflow-fulfillment-api</artifactId>
 <version>1.0.0-SNAPSHOT</version>
</dependency>`

Ensure you have kotlin as a dependency with scope 'compile' as this project defines it as 'provided'