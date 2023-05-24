# OpenAIApi

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancelFineTune**](OpenAIApi.md#cancelFineTune) | **POST** /fine-tunes/{fine_tune_id}/cancel | Immediately cancel a fine-tune job. 
[**createAnswer**](OpenAIApi.md#createAnswer) | **POST** /answers | Answers the specified question using the provided documents and examples.  The endpoint first [searches](/docs/api-reference/searches) over provided documents or files to find relevant context. The relevant context is combined with the provided examples and question to create the prompt for [completion](/docs/api-reference/completions). 
[**createChatCompletion**](OpenAIApi.md#createChatCompletion) | **POST** /chat/completions | Creates a completion for the chat message
[**createClassification**](OpenAIApi.md#createClassification) | **POST** /classifications | Classifies the specified &#x60;query&#x60; using provided examples.  The endpoint first [searches](/docs/api-reference/searches) over the labeled examples to select the ones most relevant for the particular query. Then, the relevant examples are combined with the query to construct a prompt to produce the final label via the [completions](/docs/api-reference/completions) endpoint.  Labeled examples can be provided via an uploaded &#x60;file&#x60;, or explicitly listed in the request using the &#x60;examples&#x60; parameter for quick tests and small scale use cases. 
[**createCompletion**](OpenAIApi.md#createCompletion) | **POST** /completions | Creates a completion for the provided prompt and parameters
[**createEdit**](OpenAIApi.md#createEdit) | **POST** /edits | Creates a new edit for the provided input, instruction, and parameters.
[**createEmbedding**](OpenAIApi.md#createEmbedding) | **POST** /embeddings | Creates an embedding vector representing the input text.
[**createFile**](OpenAIApi.md#createFile) | **POST** /files | Upload a file that contains document(s) to be used across various endpoints/features. Currently, the size of all the files uploaded by one organization can be up to 1 GB. Please contact us if you need to increase the storage limit. 
[**createFineTune**](OpenAIApi.md#createFineTune) | **POST** /fine-tunes | Creates a job that fine-tunes a specified model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) 
[**createImage**](OpenAIApi.md#createImage) | **POST** /images/generations | Creates an image given a prompt.
[**createImageEdit**](OpenAIApi.md#createImageEdit) | **POST** /images/edits | Creates an edited or extended image given an original image and a prompt.
[**createImageVariation**](OpenAIApi.md#createImageVariation) | **POST** /images/variations | Creates a variation of a given image.
[**createModeration**](OpenAIApi.md#createModeration) | **POST** /moderations | Classifies if text violates OpenAI&#39;s Content Policy
[**createSearch**](OpenAIApi.md#createSearch) | **POST** /engines/{engine_id}/search | The search endpoint computes similarity scores between provided query and documents. Documents can be passed directly to the API if there are no more than 200 of them.  To go beyond the 200 document limit, documents can be processed offline and then used for efficient retrieval at query time. When &#x60;file&#x60; is set, the search endpoint searches over all the documents in the given file and returns up to the &#x60;max_rerank&#x60; number of documents. These documents will be returned along with their search scores.  The similarity score is a positive score that usually ranges from 0 to 300 (but can sometimes go higher), where a score above 200 usually means the document is semantically similar to the query. 
[**createTranscription**](OpenAIApi.md#createTranscription) | **POST** /audio/transcriptions | Transcribes audio into the input language.
[**createTranslation**](OpenAIApi.md#createTranslation) | **POST** /audio/translations | Translates audio into into English.
[**deleteFile**](OpenAIApi.md#deleteFile) | **DELETE** /files/{file_id} | Delete a file.
[**deleteModel**](OpenAIApi.md#deleteModel) | **DELETE** /models/{model} | Delete a fine-tuned model. You must have the Owner role in your organization.
[**downloadFile**](OpenAIApi.md#downloadFile) | **GET** /files/{file_id}/content | Returns the contents of the specified file
[**listEngines**](OpenAIApi.md#listEngines) | **GET** /engines | Lists the currently available (non-finetuned) models, and provides basic information about each one such as the owner and availability.
[**listFiles**](OpenAIApi.md#listFiles) | **GET** /files | Returns a list of files that belong to the user&#39;s organization.
[**listFineTuneEvents**](OpenAIApi.md#listFineTuneEvents) | **GET** /fine-tunes/{fine_tune_id}/events | Get fine-grained status updates for a fine-tune job. 
[**listFineTunes**](OpenAIApi.md#listFineTunes) | **GET** /fine-tunes | List your organization&#39;s fine-tuning jobs 
[**listModels**](OpenAIApi.md#listModels) | **GET** /models | Lists the currently available models, and provides basic information about each one such as the owner and availability.
[**retrieveEngine**](OpenAIApi.md#retrieveEngine) | **GET** /engines/{engine_id} | Retrieves a model instance, providing basic information about it such as the owner and availability.
[**retrieveFile**](OpenAIApi.md#retrieveFile) | **GET** /files/{file_id} | Returns information about a specific file.
[**retrieveFineTune**](OpenAIApi.md#retrieveFineTune) | **GET** /fine-tunes/{fine_tune_id} | Gets info about the fine-tune job.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) 
[**retrieveModel**](OpenAIApi.md#retrieveModel) | **GET** /models/{model} | Retrieves a model instance, providing basic information about the model such as the owner and permissioning.


<a name="cancelFineTune"></a>
# **cancelFineTune**
> FineTune cancelFineTune(fineTuneId)

Immediately cancel a fine-tune job. 

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OpenAIApi()
val fineTuneId : kotlin.String = ft-AF1WoRqd3aJAHsqc9NY7iL8F // kotlin.String | The ID of the fine-tune job to cancel 
try {
    val result : FineTune = apiInstance.cancelFineTune(fineTuneId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OpenAIApi#cancelFineTune")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OpenAIApi#cancelFineTune")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fineTuneId** | **kotlin.String**| The ID of the fine-tune job to cancel  |

### Return type

[**FineTune**](FineTune.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createAnswer"></a>
# **createAnswer**
> CreateAnswerResponse createAnswer(createAnswerRequest)

Answers the specified question using the provided documents and examples.  The endpoint first [searches](/docs/api-reference/searches) over provided documents or files to find relevant context. The relevant context is combined with the provided examples and question to create the prompt for [completion](/docs/api-reference/completions). 

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OpenAIApi()
val createAnswerRequest : CreateAnswerRequest =  // CreateAnswerRequest | 
try {
    val result : CreateAnswerResponse = apiInstance.createAnswer(createAnswerRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OpenAIApi#createAnswer")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OpenAIApi#createAnswer")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createAnswerRequest** | [**CreateAnswerRequest**](CreateAnswerRequest.md)|  |

### Return type

[**CreateAnswerResponse**](CreateAnswerResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createChatCompletion"></a>
# **createChatCompletion**
> CreateChatCompletionResponse createChatCompletion(createChatCompletionRequest)

Creates a completion for the chat message

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OpenAIApi()
val createChatCompletionRequest : CreateChatCompletionRequest =  // CreateChatCompletionRequest | 
try {
    val result : CreateChatCompletionResponse = apiInstance.createChatCompletion(createChatCompletionRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OpenAIApi#createChatCompletion")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OpenAIApi#createChatCompletion")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createChatCompletionRequest** | [**CreateChatCompletionRequest**](CreateChatCompletionRequest.md)|  |

### Return type

[**CreateChatCompletionResponse**](CreateChatCompletionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createClassification"></a>
# **createClassification**
> CreateClassificationResponse createClassification(createClassificationRequest)

Classifies the specified &#x60;query&#x60; using provided examples.  The endpoint first [searches](/docs/api-reference/searches) over the labeled examples to select the ones most relevant for the particular query. Then, the relevant examples are combined with the query to construct a prompt to produce the final label via the [completions](/docs/api-reference/completions) endpoint.  Labeled examples can be provided via an uploaded &#x60;file&#x60;, or explicitly listed in the request using the &#x60;examples&#x60; parameter for quick tests and small scale use cases. 

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OpenAIApi()
val createClassificationRequest : CreateClassificationRequest =  // CreateClassificationRequest | 
try {
    val result : CreateClassificationResponse = apiInstance.createClassification(createClassificationRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OpenAIApi#createClassification")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OpenAIApi#createClassification")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createClassificationRequest** | [**CreateClassificationRequest**](CreateClassificationRequest.md)|  |

### Return type

[**CreateClassificationResponse**](CreateClassificationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createCompletion"></a>
# **createCompletion**
> CreateCompletionResponse createCompletion(createCompletionRequest)

Creates a completion for the provided prompt and parameters

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OpenAIApi()
val createCompletionRequest : CreateCompletionRequest =  // CreateCompletionRequest | 
try {
    val result : CreateCompletionResponse = apiInstance.createCompletion(createCompletionRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OpenAIApi#createCompletion")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OpenAIApi#createCompletion")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createCompletionRequest** | [**CreateCompletionRequest**](CreateCompletionRequest.md)|  |

### Return type

[**CreateCompletionResponse**](CreateCompletionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createEdit"></a>
# **createEdit**
> CreateEditResponse createEdit(createEditRequest)

Creates a new edit for the provided input, instruction, and parameters.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OpenAIApi()
val createEditRequest : CreateEditRequest =  // CreateEditRequest | 
try {
    val result : CreateEditResponse = apiInstance.createEdit(createEditRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OpenAIApi#createEdit")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OpenAIApi#createEdit")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createEditRequest** | [**CreateEditRequest**](CreateEditRequest.md)|  |

### Return type

[**CreateEditResponse**](CreateEditResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createEmbedding"></a>
# **createEmbedding**
> CreateEmbeddingResponse createEmbedding(createEmbeddingRequest)

Creates an embedding vector representing the input text.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OpenAIApi()
val createEmbeddingRequest : CreateEmbeddingRequest =  // CreateEmbeddingRequest | 
try {
    val result : CreateEmbeddingResponse = apiInstance.createEmbedding(createEmbeddingRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OpenAIApi#createEmbedding")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OpenAIApi#createEmbedding")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createEmbeddingRequest** | [**CreateEmbeddingRequest**](CreateEmbeddingRequest.md)|  |

### Return type

[**CreateEmbeddingResponse**](CreateEmbeddingResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createFile"></a>
# **createFile**
> OpenAIFile createFile(file, purpose)

Upload a file that contains document(s) to be used across various endpoints/features. Currently, the size of all the files uploaded by one organization can be up to 1 GB. Please contact us if you need to increase the storage limit. 

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OpenAIApi()
val file : java.io.File = BINARY_DATA_HERE // java.io.File | Name of the [JSON Lines](https://jsonlines.readthedocs.io/en/latest/) file to be uploaded.  If the `purpose` is set to \\\"fine-tune\\\", each line is a JSON record with \\\"prompt\\\" and \\\"completion\\\" fields representing your [training examples](/docs/guides/fine-tuning/prepare-training-data). 
val purpose : kotlin.String = purpose_example // kotlin.String | The intended purpose of the uploaded documents.  Use \\\"fine-tune\\\" for [Fine-tuning](/docs/api-reference/fine-tunes). This allows us to validate the format of the uploaded file. 
try {
    val result : OpenAIFile = apiInstance.createFile(file, purpose)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OpenAIApi#createFile")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OpenAIApi#createFile")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | **java.io.File**| Name of the [JSON Lines](https://jsonlines.readthedocs.io/en/latest/) file to be uploaded.  If the &#x60;purpose&#x60; is set to \\\&quot;fine-tune\\\&quot;, each line is a JSON record with \\\&quot;prompt\\\&quot; and \\\&quot;completion\\\&quot; fields representing your [training examples](/docs/guides/fine-tuning/prepare-training-data).  |
 **purpose** | **kotlin.String**| The intended purpose of the uploaded documents.  Use \\\&quot;fine-tune\\\&quot; for [Fine-tuning](/docs/api-reference/fine-tunes). This allows us to validate the format of the uploaded file.  |

### Return type

[**OpenAIFile**](OpenAIFile.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="createFineTune"></a>
# **createFineTune**
> FineTune createFineTune(createFineTuneRequest)

Creates a job that fine-tunes a specified model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) 

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OpenAIApi()
val createFineTuneRequest : CreateFineTuneRequest =  // CreateFineTuneRequest | 
try {
    val result : FineTune = apiInstance.createFineTune(createFineTuneRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OpenAIApi#createFineTune")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OpenAIApi#createFineTune")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createFineTuneRequest** | [**CreateFineTuneRequest**](CreateFineTuneRequest.md)|  |

### Return type

[**FineTune**](FineTune.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createImage"></a>
# **createImage**
> ImagesResponse createImage(createImageRequest)

Creates an image given a prompt.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OpenAIApi()
val createImageRequest : CreateImageRequest =  // CreateImageRequest | 
try {
    val result : ImagesResponse = apiInstance.createImage(createImageRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OpenAIApi#createImage")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OpenAIApi#createImage")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createImageRequest** | [**CreateImageRequest**](CreateImageRequest.md)|  |

### Return type

[**ImagesResponse**](ImagesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createImageEdit"></a>
# **createImageEdit**
> ImagesResponse createImageEdit(image, prompt, mask)

Creates an edited or extended image given an original image and a prompt.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OpenAIApi()
val image : java.io.File = BINARY_DATA_HERE // java.io.File | The image to edit. Must be a valid PNG file, less than 4MB, and square. If mask is not provided, image must have transparency, which will be used as the mask.
val prompt : kotlin.String = prompt_example // kotlin.String | A text description of the desired image(s). The maximum length is 1000 characters.
val mask : java.io.File = BINARY_DATA_HERE // java.io.File | An additional image whose fully transparent areas (e.g. where alpha is zero) indicate where `image` should be edited. Must be a valid PNG file, less than 4MB, and have the same dimensions as `image`.
try {
    val result : ImagesResponse = apiInstance.createImageEdit(image, prompt, mask)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OpenAIApi#createImageEdit")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OpenAIApi#createImageEdit")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **image** | **java.io.File**| The image to edit. Must be a valid PNG file, less than 4MB, and square. If mask is not provided, image must have transparency, which will be used as the mask. |
 **prompt** | **kotlin.String**| A text description of the desired image(s). The maximum length is 1000 characters. |
 **mask** | **java.io.File**| An additional image whose fully transparent areas (e.g. where alpha is zero) indicate where &#x60;image&#x60; should be edited. Must be a valid PNG file, less than 4MB, and have the same dimensions as &#x60;image&#x60;. | [optional]

### Return type

[**ImagesResponse**](ImagesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="createImageVariation"></a>
# **createImageVariation**
> ImagesResponse createImageVariation(image)

Creates a variation of a given image.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OpenAIApi()
val image : java.io.File = BINARY_DATA_HERE // java.io.File | The image to use as the basis for the variation(s). Must be a valid PNG file, less than 4MB, and square.
try {
    val result : ImagesResponse = apiInstance.createImageVariation(image)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OpenAIApi#createImageVariation")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OpenAIApi#createImageVariation")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **image** | **java.io.File**| The image to use as the basis for the variation(s). Must be a valid PNG file, less than 4MB, and square. |

### Return type

[**ImagesResponse**](ImagesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="createModeration"></a>
# **createModeration**
> CreateModerationResponse createModeration(createModerationRequest)

Classifies if text violates OpenAI&#39;s Content Policy

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OpenAIApi()
val createModerationRequest : CreateModerationRequest =  // CreateModerationRequest | 
try {
    val result : CreateModerationResponse = apiInstance.createModeration(createModerationRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OpenAIApi#createModeration")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OpenAIApi#createModeration")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createModerationRequest** | [**CreateModerationRequest**](CreateModerationRequest.md)|  |

### Return type

[**CreateModerationResponse**](CreateModerationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createSearch"></a>
# **createSearch**
> CreateSearchResponse createSearch(engineId, createSearchRequest)

The search endpoint computes similarity scores between provided query and documents. Documents can be passed directly to the API if there are no more than 200 of them.  To go beyond the 200 document limit, documents can be processed offline and then used for efficient retrieval at query time. When &#x60;file&#x60; is set, the search endpoint searches over all the documents in the given file and returns up to the &#x60;max_rerank&#x60; number of documents. These documents will be returned along with their search scores.  The similarity score is a positive score that usually ranges from 0 to 300 (but can sometimes go higher), where a score above 200 usually means the document is semantically similar to the query. 

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OpenAIApi()
val engineId : kotlin.String = davinci // kotlin.String | The ID of the engine to use for this request.  You can select one of `ada`, `babbage`, `curie`, or `davinci`.
val createSearchRequest : CreateSearchRequest =  // CreateSearchRequest | 
try {
    val result : CreateSearchResponse = apiInstance.createSearch(engineId, createSearchRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OpenAIApi#createSearch")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OpenAIApi#createSearch")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **engineId** | **kotlin.String**| The ID of the engine to use for this request.  You can select one of &#x60;ada&#x60;, &#x60;babbage&#x60;, &#x60;curie&#x60;, or &#x60;davinci&#x60;. |
 **createSearchRequest** | [**CreateSearchRequest**](CreateSearchRequest.md)|  |

### Return type

[**CreateSearchResponse**](CreateSearchResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createTranscription"></a>
# **createTranscription**
> CreateTranscriptionResponse createTranscription(file, model, prompt, responseFormat, temperature, language)

Transcribes audio into the input language.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OpenAIApi()
val file : java.io.File = BINARY_DATA_HERE // java.io.File | The audio file to transcribe, in one of these formats: mp3, mp4, mpeg, mpga, m4a, wav, or webm. 
val model : kotlin.String = model_example // kotlin.String | ID of the model to use. Only `whisper-1` is currently available. 
val prompt : kotlin.String = prompt_example // kotlin.String | An optional text to guide the model's style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should match the audio language. 
val responseFormat : kotlin.String = responseFormat_example // kotlin.String | The format of the transcript output, in one of these options: json, text, srt, verbose_json, or vtt. 
val temperature : java.math.BigDecimal = 8.14 // java.math.BigDecimal | The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit. 
val language : kotlin.String = language_example // kotlin.String | The language of the input audio. Supplying the input language in [ISO-639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) format will improve accuracy and latency. 
try {
    val result : CreateTranscriptionResponse = apiInstance.createTranscription(file, model, prompt, responseFormat, temperature, language)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OpenAIApi#createTranscription")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OpenAIApi#createTranscription")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | **java.io.File**| The audio file to transcribe, in one of these formats: mp3, mp4, mpeg, mpga, m4a, wav, or webm.  |
 **model** | **kotlin.String**| ID of the model to use. Only &#x60;whisper-1&#x60; is currently available.  |
 **prompt** | **kotlin.String**| An optional text to guide the model&#39;s style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should match the audio language.  | [optional]
 **responseFormat** | **kotlin.String**| The format of the transcript output, in one of these options: json, text, srt, verbose_json, or vtt.  | [optional] [default to &quot;json&quot;]
 **temperature** | **java.math.BigDecimal**| The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit.  | [optional] [default to 0]
 **language** | **kotlin.String**| The language of the input audio. Supplying the input language in [ISO-639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) format will improve accuracy and latency.  | [optional]

### Return type

[**CreateTranscriptionResponse**](CreateTranscriptionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="createTranslation"></a>
# **createTranslation**
> CreateTranslationResponse createTranslation(file, model, prompt, responseFormat, temperature)

Translates audio into into English.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OpenAIApi()
val file : java.io.File = BINARY_DATA_HERE // java.io.File | The audio file to translate, in one of these formats: mp3, mp4, mpeg, mpga, m4a, wav, or webm. 
val model : kotlin.String = model_example // kotlin.String | ID of the model to use. Only `whisper-1` is currently available. 
val prompt : kotlin.String = prompt_example // kotlin.String | An optional text to guide the model's style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should be in English. 
val responseFormat : kotlin.String = responseFormat_example // kotlin.String | The format of the transcript output, in one of these options: json, text, srt, verbose_json, or vtt. 
val temperature : java.math.BigDecimal = 8.14 // java.math.BigDecimal | The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit. 
try {
    val result : CreateTranslationResponse = apiInstance.createTranslation(file, model, prompt, responseFormat, temperature)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OpenAIApi#createTranslation")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OpenAIApi#createTranslation")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | **java.io.File**| The audio file to translate, in one of these formats: mp3, mp4, mpeg, mpga, m4a, wav, or webm.  |
 **model** | **kotlin.String**| ID of the model to use. Only &#x60;whisper-1&#x60; is currently available.  |
 **prompt** | **kotlin.String**| An optional text to guide the model&#39;s style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should be in English.  | [optional]
 **responseFormat** | **kotlin.String**| The format of the transcript output, in one of these options: json, text, srt, verbose_json, or vtt.  | [optional] [default to &quot;json&quot;]
 **temperature** | **java.math.BigDecimal**| The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit.  | [optional] [default to 0]

### Return type

[**CreateTranslationResponse**](CreateTranslationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="deleteFile"></a>
# **deleteFile**
> DeleteFileResponse deleteFile(fileId)

Delete a file.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OpenAIApi()
val fileId : kotlin.String = fileId_example // kotlin.String | The ID of the file to use for this request
try {
    val result : DeleteFileResponse = apiInstance.deleteFile(fileId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OpenAIApi#deleteFile")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OpenAIApi#deleteFile")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fileId** | **kotlin.String**| The ID of the file to use for this request |

### Return type

[**DeleteFileResponse**](DeleteFileResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteModel"></a>
# **deleteModel**
> DeleteModelResponse deleteModel(model)

Delete a fine-tuned model. You must have the Owner role in your organization.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OpenAIApi()
val model : kotlin.String = curie:ft-acmeco-2021-03-03-21-44-20 // kotlin.String | The model to delete
try {
    val result : DeleteModelResponse = apiInstance.deleteModel(model)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OpenAIApi#deleteModel")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OpenAIApi#deleteModel")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model** | **kotlin.String**| The model to delete |

### Return type

[**DeleteModelResponse**](DeleteModelResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="downloadFile"></a>
# **downloadFile**
> kotlin.String downloadFile(fileId)

Returns the contents of the specified file

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OpenAIApi()
val fileId : kotlin.String = fileId_example // kotlin.String | The ID of the file to use for this request
try {
    val result : kotlin.String = apiInstance.downloadFile(fileId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OpenAIApi#downloadFile")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OpenAIApi#downloadFile")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fileId** | **kotlin.String**| The ID of the file to use for this request |

### Return type

**kotlin.String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listEngines"></a>
# **listEngines**
> ListEnginesResponse listEngines()

Lists the currently available (non-finetuned) models, and provides basic information about each one such as the owner and availability.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OpenAIApi()
try {
    val result : ListEnginesResponse = apiInstance.listEngines()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OpenAIApi#listEngines")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OpenAIApi#listEngines")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ListEnginesResponse**](ListEnginesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listFiles"></a>
# **listFiles**
> ListFilesResponse listFiles()

Returns a list of files that belong to the user&#39;s organization.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OpenAIApi()
try {
    val result : ListFilesResponse = apiInstance.listFiles()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OpenAIApi#listFiles")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OpenAIApi#listFiles")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ListFilesResponse**](ListFilesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listFineTuneEvents"></a>
# **listFineTuneEvents**
> ListFineTuneEventsResponse listFineTuneEvents(fineTuneId, stream)

Get fine-grained status updates for a fine-tune job. 

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OpenAIApi()
val fineTuneId : kotlin.String = ft-AF1WoRqd3aJAHsqc9NY7iL8F // kotlin.String | The ID of the fine-tune job to get events for. 
val stream : kotlin.Boolean = true // kotlin.Boolean | Whether to stream events for the fine-tune job. If set to true, events will be sent as data-only [server-sent events](https://developer.mozilla.org/en-US/docs/Web/API/Server-sent_events/Using_server-sent_events#Event_stream_format) as they become available. The stream will terminate with a `data: [DONE]` message when the job is finished (succeeded, cancelled, or failed).  If set to false, only events generated so far will be returned. 
try {
    val result : ListFineTuneEventsResponse = apiInstance.listFineTuneEvents(fineTuneId, stream)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OpenAIApi#listFineTuneEvents")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OpenAIApi#listFineTuneEvents")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fineTuneId** | **kotlin.String**| The ID of the fine-tune job to get events for.  |
 **stream** | **kotlin.Boolean**| Whether to stream events for the fine-tune job. If set to true, events will be sent as data-only [server-sent events](https://developer.mozilla.org/en-US/docs/Web/API/Server-sent_events/Using_server-sent_events#Event_stream_format) as they become available. The stream will terminate with a &#x60;data: [DONE]&#x60; message when the job is finished (succeeded, cancelled, or failed).  If set to false, only events generated so far will be returned.  | [optional] [default to false]

### Return type

[**ListFineTuneEventsResponse**](ListFineTuneEventsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listFineTunes"></a>
# **listFineTunes**
> ListFineTunesResponse listFineTunes()

List your organization&#39;s fine-tuning jobs 

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OpenAIApi()
try {
    val result : ListFineTunesResponse = apiInstance.listFineTunes()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OpenAIApi#listFineTunes")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OpenAIApi#listFineTunes")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ListFineTunesResponse**](ListFineTunesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listModels"></a>
# **listModels**
> ListModelsResponse listModels()

Lists the currently available models, and provides basic information about each one such as the owner and availability.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OpenAIApi()
try {
    val result : ListModelsResponse = apiInstance.listModels()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OpenAIApi#listModels")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OpenAIApi#listModels")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ListModelsResponse**](ListModelsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="retrieveEngine"></a>
# **retrieveEngine**
> Engine retrieveEngine(engineId)

Retrieves a model instance, providing basic information about it such as the owner and availability.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OpenAIApi()
val engineId : kotlin.String = davinci // kotlin.String | The ID of the engine to use for this request 
try {
    val result : Engine = apiInstance.retrieveEngine(engineId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OpenAIApi#retrieveEngine")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OpenAIApi#retrieveEngine")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **engineId** | **kotlin.String**| The ID of the engine to use for this request  |

### Return type

[**Engine**](Engine.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="retrieveFile"></a>
# **retrieveFile**
> OpenAIFile retrieveFile(fileId)

Returns information about a specific file.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OpenAIApi()
val fileId : kotlin.String = fileId_example // kotlin.String | The ID of the file to use for this request
try {
    val result : OpenAIFile = apiInstance.retrieveFile(fileId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OpenAIApi#retrieveFile")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OpenAIApi#retrieveFile")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fileId** | **kotlin.String**| The ID of the file to use for this request |

### Return type

[**OpenAIFile**](OpenAIFile.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="retrieveFineTune"></a>
# **retrieveFineTune**
> FineTune retrieveFineTune(fineTuneId)

Gets info about the fine-tune job.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) 

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OpenAIApi()
val fineTuneId : kotlin.String = ft-AF1WoRqd3aJAHsqc9NY7iL8F // kotlin.String | The ID of the fine-tune job 
try {
    val result : FineTune = apiInstance.retrieveFineTune(fineTuneId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OpenAIApi#retrieveFineTune")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OpenAIApi#retrieveFineTune")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fineTuneId** | **kotlin.String**| The ID of the fine-tune job  |

### Return type

[**FineTune**](FineTune.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="retrieveModel"></a>
# **retrieveModel**
> Model retrieveModel(model)

Retrieves a model instance, providing basic information about the model such as the owner and permissioning.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OpenAIApi()
val model : kotlin.String = text-davinci-001 // kotlin.String | The ID of the model to use for this request
try {
    val result : Model = apiInstance.retrieveModel(model)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OpenAIApi#retrieveModel")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OpenAIApi#retrieveModel")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model** | **kotlin.String**| The ID of the model to use for this request |

### Return type

[**Model**](Model.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

