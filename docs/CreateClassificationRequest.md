
# CreateClassificationRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**query** | **kotlin.String** | Query to be classified. | 
**examples** | **kotlin.collections.List&lt;kotlin.collections.List&lt;kotlin.String&gt;&gt;** | A list of examples with labels, in the following format:  &#x60;[[\&quot;The movie is so interesting.\&quot;, \&quot;Positive\&quot;], [\&quot;It is quite boring.\&quot;, \&quot;Negative\&quot;], ...]&#x60;  All the label strings will be normalized to be capitalized.  You should specify either &#x60;examples&#x60; or &#x60;file&#x60;, but not both.  |  [optional]
**file** | **kotlin.String** | The ID of the uploaded file that contains training examples. See [upload file](/docs/api-reference/files/upload) for how to upload a file of the desired format and purpose.  You should specify either &#x60;examples&#x60; or &#x60;file&#x60;, but not both.  |  [optional]
**labels** | **kotlin.collections.List&lt;kotlin.String&gt;** | The set of categories being classified. If not specified, candidate labels will be automatically collected from the examples you provide. All the label strings will be normalized to be capitalized. |  [optional]
**temperature** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. |  [optional]
**maxExamples** | **kotlin.Int** | The maximum number of examples to be ranked by [Search](/docs/api-reference/searches/create) when using &#x60;file&#x60;. Setting it to a higher value leads to improved accuracy but with increased latency and cost. |  [optional]



