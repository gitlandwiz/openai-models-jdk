
# CreateAnswerRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**model** | **kotlin.String** | ID of the model to use for completion. You can select one of &#x60;ada&#x60;, &#x60;babbage&#x60;, &#x60;curie&#x60;, or &#x60;davinci&#x60;. | 
**question** | **kotlin.String** | Question to get answered. | 
**examples** | **kotlin.collections.List&lt;kotlin.collections.List&lt;kotlin.String&gt;&gt;** | List of (question, answer) pairs that will help steer the model towards the tone and answer format you&#39;d like. We recommend adding 2 to 3 examples. | 
**examplesContext** | **kotlin.String** | A text snippet containing the contextual information used to generate the answers for the &#x60;examples&#x60; you provide. | 
**documents** | **kotlin.collections.List&lt;kotlin.String&gt;** | List of documents from which the answer for the input &#x60;question&#x60; should be derived. If this is an empty list, the question will be answered based on the question-answer examples.  You should specify either &#x60;documents&#x60; or a &#x60;file&#x60;, but not both.  |  [optional]
**file** | **kotlin.String** | The ID of an uploaded file that contains documents to search over. See [upload file](/docs/api-reference/files/upload) for how to upload a file of the desired format and purpose.  You should specify either &#x60;documents&#x60; or a &#x60;file&#x60;, but not both.  |  [optional]
**searchModel** | **kotlin.String** | ID of the model to use for [Search](/docs/api-reference/searches/create). You can select one of &#x60;ada&#x60;, &#x60;babbage&#x60;, &#x60;curie&#x60;, or &#x60;davinci&#x60;. |  [optional]
**maxRerank** | **kotlin.Int** | The maximum number of documents to be ranked by [Search](/docs/api-reference/searches/create) when using &#x60;file&#x60;. Setting it to a higher value leads to improved accuracy but with increased latency and cost. |  [optional]
**temperature** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. |  [optional]
**logprobs** | **kotlin.Int** | Include the log probabilities on the &#x60;logprobs&#x60; most likely tokens, as well the chosen tokens. For example, if &#x60;logprobs&#x60; is 5, the API will return a list of the 5 most likely tokens. The API will always return the &#x60;logprob&#x60; of the sampled token, so there may be up to &#x60;logprobs+1&#x60; elements in the response.  The maximum value for &#x60;logprobs&#x60; is 5. If you need more than this, please contact us through our [Help center](https://help.openai.com) and describe your use case.  When &#x60;logprobs&#x60; is set, &#x60;completion&#x60; will be automatically added into &#x60;expand&#x60; to get the logprobs.  |  [optional]
**maxTokens** | **kotlin.Int** | The maximum number of tokens allowed for the generated answer |  [optional]
**stop** | [**OneOfLessThanStringCommaArrayGreaterThan**](OneOfLessThanStringCommaArrayGreaterThan.md) | completions_stop_description |  [optional]
**n** | **kotlin.Int** | How many answers to generate for each question. |  [optional]
**returnPrompt** | **kotlin.Boolean** | If set to &#x60;true&#x60;, the returned JSON will include a \&quot;prompt\&quot; field containing the final prompt that was used to request a completion. This is mainly useful for debugging purposes. |  [optional]
**expand** | [**kotlin.collections.List&lt;AnyType&gt;**](AnyType.md) | If an object name is in the list, we provide the full information of the object; otherwise, we only provide the object ID. Currently we support &#x60;completion&#x60; and &#x60;file&#x60; objects for expansion. |  [optional]



