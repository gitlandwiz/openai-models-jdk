# org.openapitools.client - Kotlin client library for OpenAI API

## Requires

* Kotlin 1.4.30
* Gradle 6.8.3

## Build

First, create the gradle wrapper script:

```
gradle wrapper
```

Then, run:

```
./gradlew check assemble
```

This runs all tests and packages the library.

## Features/Implementation Notes

* Supports JSON inputs/outputs, File inputs, and Form inputs.
* Supports collection formats for query parameters: csv, tsv, ssv, pipes.
* Some Kotlin and Java types are fully qualified to avoid conflicts with types defined in OpenAPI definitions.
* Implementation of ApiClient is intended to reduce method counts, specifically to benefit Android targets.

<a name="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *https://api.openai.com/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*OpenAIApi* | [**cancelFineTune**](docs/OpenAIApi.md#cancelfinetune) | **POST** /fine-tunes/{fine_tune_id}/cancel | Immediately cancel a fine-tune job. 
*OpenAIApi* | [**createAnswer**](docs/OpenAIApi.md#createanswer) | **POST** /answers | Answers the specified question using the provided documents and examples.  The endpoint first [searches](/docs/api-reference/searches) over provided documents or files to find relevant context. The relevant context is combined with the provided examples and question to create the prompt for [completion](/docs/api-reference/completions). 
*OpenAIApi* | [**createChatCompletion**](docs/OpenAIApi.md#createchatcompletion) | **POST** /chat/completions | Creates a completion for the chat message
*OpenAIApi* | [**createClassification**](docs/OpenAIApi.md#createclassification) | **POST** /classifications | Classifies the specified `query` using provided examples.  The endpoint first [searches](/docs/api-reference/searches) over the labeled examples to select the ones most relevant for the particular query. Then, the relevant examples are combined with the query to construct a prompt to produce the final label via the [completions](/docs/api-reference/completions) endpoint.  Labeled examples can be provided via an uploaded `file`, or explicitly listed in the request using the `examples` parameter for quick tests and small scale use cases. 
*OpenAIApi* | [**createCompletion**](docs/OpenAIApi.md#createcompletion) | **POST** /completions | Creates a completion for the provided prompt and parameters
*OpenAIApi* | [**createEdit**](docs/OpenAIApi.md#createedit) | **POST** /edits | Creates a new edit for the provided input, instruction, and parameters.
*OpenAIApi* | [**createEmbedding**](docs/OpenAIApi.md#createembedding) | **POST** /embeddings | Creates an embedding vector representing the input text.
*OpenAIApi* | [**createFile**](docs/OpenAIApi.md#createfile) | **POST** /files | Upload a file that contains document(s) to be used across various endpoints/features. Currently, the size of all the files uploaded by one organization can be up to 1 GB. Please contact us if you need to increase the storage limit. 
*OpenAIApi* | [**createFineTune**](docs/OpenAIApi.md#createfinetune) | **POST** /fine-tunes | Creates a job that fine-tunes a specified model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) 
*OpenAIApi* | [**createImage**](docs/OpenAIApi.md#createimage) | **POST** /images/generations | Creates an image given a prompt.
*OpenAIApi* | [**createImageEdit**](docs/OpenAIApi.md#createimageedit) | **POST** /images/edits | Creates an edited or extended image given an original image and a prompt.
*OpenAIApi* | [**createImageVariation**](docs/OpenAIApi.md#createimagevariation) | **POST** /images/variations | Creates a variation of a given image.
*OpenAIApi* | [**createModeration**](docs/OpenAIApi.md#createmoderation) | **POST** /moderations | Classifies if text violates OpenAI's Content Policy
*OpenAIApi* | [**createSearch**](docs/OpenAIApi.md#createsearch) | **POST** /engines/{engine_id}/search | The search endpoint computes similarity scores between provided query and documents. Documents can be passed directly to the API if there are no more than 200 of them.  To go beyond the 200 document limit, documents can be processed offline and then used for efficient retrieval at query time. When `file` is set, the search endpoint searches over all the documents in the given file and returns up to the `max_rerank` number of documents. These documents will be returned along with their search scores.  The similarity score is a positive score that usually ranges from 0 to 300 (but can sometimes go higher), where a score above 200 usually means the document is semantically similar to the query. 
*OpenAIApi* | [**createTranscription**](docs/OpenAIApi.md#createtranscription) | **POST** /audio/transcriptions | Transcribes audio into the input language.
*OpenAIApi* | [**createTranslation**](docs/OpenAIApi.md#createtranslation) | **POST** /audio/translations | Translates audio into into English.
*OpenAIApi* | [**deleteFile**](docs/OpenAIApi.md#deletefile) | **DELETE** /files/{file_id} | Delete a file.
*OpenAIApi* | [**deleteModel**](docs/OpenAIApi.md#deletemodel) | **DELETE** /models/{model} | Delete a fine-tuned model. You must have the Owner role in your organization.
*OpenAIApi* | [**downloadFile**](docs/OpenAIApi.md#downloadfile) | **GET** /files/{file_id}/content | Returns the contents of the specified file
*OpenAIApi* | [**listEngines**](docs/OpenAIApi.md#listengines) | **GET** /engines | Lists the currently available (non-finetuned) models, and provides basic information about each one such as the owner and availability.
*OpenAIApi* | [**listFiles**](docs/OpenAIApi.md#listfiles) | **GET** /files | Returns a list of files that belong to the user's organization.
*OpenAIApi* | [**listFineTuneEvents**](docs/OpenAIApi.md#listfinetuneevents) | **GET** /fine-tunes/{fine_tune_id}/events | Get fine-grained status updates for a fine-tune job. 
*OpenAIApi* | [**listFineTunes**](docs/OpenAIApi.md#listfinetunes) | **GET** /fine-tunes | List your organization's fine-tuning jobs 
*OpenAIApi* | [**listModels**](docs/OpenAIApi.md#listmodels) | **GET** /models | Lists the currently available models, and provides basic information about each one such as the owner and availability.
*OpenAIApi* | [**retrieveEngine**](docs/OpenAIApi.md#retrieveengine) | **GET** /engines/{engine_id} | Retrieves a model instance, providing basic information about it such as the owner and availability.
*OpenAIApi* | [**retrieveFile**](docs/OpenAIApi.md#retrievefile) | **GET** /files/{file_id} | Returns information about a specific file.
*OpenAIApi* | [**retrieveFineTune**](docs/OpenAIApi.md#retrievefinetune) | **GET** /fine-tunes/{fine_tune_id} | Gets info about the fine-tune job.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) 
*OpenAIApi* | [**retrieveModel**](docs/OpenAIApi.md#retrievemodel) | **GET** /models/{model} | Retrieves a model instance, providing basic information about the model such as the owner and permissioning.


<a name="documentation-for-models"></a>
## Documentation for Models

 - [org.openapitools.client.models.ChatCompletionRequestMessage](docs/ChatCompletionRequestMessage.md)
 - [org.openapitools.client.models.ChatCompletionResponseMessage](docs/ChatCompletionResponseMessage.md)
 - [org.openapitools.client.models.CreateAnswerRequest](docs/CreateAnswerRequest.md)
 - [org.openapitools.client.models.CreateAnswerResponse](docs/CreateAnswerResponse.md)
 - [org.openapitools.client.models.CreateAnswerResponseSelectedDocuments](docs/CreateAnswerResponseSelectedDocuments.md)
 - [org.openapitools.client.models.CreateChatCompletionRequest](docs/CreateChatCompletionRequest.md)
 - [org.openapitools.client.models.CreateChatCompletionResponse](docs/CreateChatCompletionResponse.md)
 - [org.openapitools.client.models.CreateChatCompletionResponseChoices](docs/CreateChatCompletionResponseChoices.md)
 - [org.openapitools.client.models.CreateClassificationRequest](docs/CreateClassificationRequest.md)
 - [org.openapitools.client.models.CreateClassificationResponse](docs/CreateClassificationResponse.md)
 - [org.openapitools.client.models.CreateClassificationResponseSelectedExamples](docs/CreateClassificationResponseSelectedExamples.md)
 - [org.openapitools.client.models.CreateCompletionRequest](docs/CreateCompletionRequest.md)
 - [org.openapitools.client.models.CreateCompletionResponse](docs/CreateCompletionResponse.md)
 - [org.openapitools.client.models.CreateCompletionResponseChoices](docs/CreateCompletionResponseChoices.md)
 - [org.openapitools.client.models.CreateCompletionResponseLogprobs](docs/CreateCompletionResponseLogprobs.md)
 - [org.openapitools.client.models.CreateCompletionResponseUsage](docs/CreateCompletionResponseUsage.md)
 - [org.openapitools.client.models.CreateEditRequest](docs/CreateEditRequest.md)
 - [org.openapitools.client.models.CreateEditResponse](docs/CreateEditResponse.md)
 - [org.openapitools.client.models.CreateEmbeddingRequest](docs/CreateEmbeddingRequest.md)
 - [org.openapitools.client.models.CreateEmbeddingResponse](docs/CreateEmbeddingResponse.md)
 - [org.openapitools.client.models.CreateEmbeddingResponseData](docs/CreateEmbeddingResponseData.md)
 - [org.openapitools.client.models.CreateEmbeddingResponseUsage](docs/CreateEmbeddingResponseUsage.md)
 - [org.openapitools.client.models.CreateFineTuneRequest](docs/CreateFineTuneRequest.md)
 - [org.openapitools.client.models.CreateImageRequest](docs/CreateImageRequest.md)
 - [org.openapitools.client.models.CreateModerationRequest](docs/CreateModerationRequest.md)
 - [org.openapitools.client.models.CreateModerationResponse](docs/CreateModerationResponse.md)
 - [org.openapitools.client.models.CreateModerationResponseCategories](docs/CreateModerationResponseCategories.md)
 - [org.openapitools.client.models.CreateModerationResponseCategoryScores](docs/CreateModerationResponseCategoryScores.md)
 - [org.openapitools.client.models.CreateModerationResponseResults](docs/CreateModerationResponseResults.md)
 - [org.openapitools.client.models.CreateSearchRequest](docs/CreateSearchRequest.md)
 - [org.openapitools.client.models.CreateSearchResponse](docs/CreateSearchResponse.md)
 - [org.openapitools.client.models.CreateSearchResponseData](docs/CreateSearchResponseData.md)
 - [org.openapitools.client.models.CreateTranscriptionResponse](docs/CreateTranscriptionResponse.md)
 - [org.openapitools.client.models.CreateTranslationResponse](docs/CreateTranslationResponse.md)
 - [org.openapitools.client.models.DeleteFileResponse](docs/DeleteFileResponse.md)
 - [org.openapitools.client.models.DeleteModelResponse](docs/DeleteModelResponse.md)
 - [org.openapitools.client.models.Engine](docs/Engine.md)
 - [org.openapitools.client.models.FineTune](docs/FineTune.md)
 - [org.openapitools.client.models.FineTuneEvent](docs/FineTuneEvent.md)
 - [org.openapitools.client.models.ImagesResponse](docs/ImagesResponse.md)
 - [org.openapitools.client.models.ImagesResponseData](docs/ImagesResponseData.md)
 - [org.openapitools.client.models.ListEnginesResponse](docs/ListEnginesResponse.md)
 - [org.openapitools.client.models.ListFilesResponse](docs/ListFilesResponse.md)
 - [org.openapitools.client.models.ListFineTuneEventsResponse](docs/ListFineTuneEventsResponse.md)
 - [org.openapitools.client.models.ListFineTunesResponse](docs/ListFineTunesResponse.md)
 - [org.openapitools.client.models.ListModelsResponse](docs/ListModelsResponse.md)
 - [org.openapitools.client.models.Model](docs/Model.md)
 - [org.openapitools.client.models.OpenAIFile](docs/OpenAIFile.md)


<a name="documentation-for-authorization"></a>
## Documentation for Authorization

All endpoints do not require authorization.
