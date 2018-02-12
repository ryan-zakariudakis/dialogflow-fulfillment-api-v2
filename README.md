# Kotlin data structures for the Diagflow Fulfillment Webhook API

kotlin implementation of api request and response for the diagflow v2 webhook mechanism 

https://dialogflow.com/docs/reference/api-v2/rest/v2beta1/WebhookRequest 

https://dialogflow.com/docs/reference/api-v2/rest/v2beta1/WebhookResponse

Do not use Kotlin data classes.  Use plain classes and remember to implement equals()/hashCode()/toString(). Use Commons-Lang to counteract the boilerplate annoyance.

This is to ensure optional fields can be assigned defaults without requiring `?` throught the code base and the resultant `!!` in any clients.

This is required because of the way jackson works, it tries to override existing values with null on new object creation.

## To use this project

`cd ~`

`git clone git@gitlab.com:ryan.zakariudakis/diagflow-v2beta1-kotlin-api-model.git` 

`cd diagflow-v2beta1-kotlin-api-model`

`mvn clean install`

Add this to your pom.xml:

`<dependency>
 <groupId>com.ryanz.diagflow</groupId>
 <artifactId>diagflow-v2beta1-kotlin-api-model</artifactId>
 <version>1.0.0-SNAPSHOT</version>
</dependency>`

Ensure you have kotlin as a dependency with scope 'compile' as this project defines it as 'provided'