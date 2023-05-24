
# CreateEditRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**model** | **kotlin.String** | ID of the model to use. You can use the &#x60;text-davinci-edit-001&#x60; or &#x60;code-davinci-edit-001&#x60; model with this endpoint. | 
**instruction** | **kotlin.String** | The instruction that tells the model how to edit the prompt. | 
**input** | **kotlin.String** | The input text to use as a starting point for the edit. |  [optional]
**n** | **kotlin.Int** | How many edits to generate for the input and instruction. |  [optional]
**temperature** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | completions_temperature_description |  [optional]
**topP** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | completions_top_p_description |  [optional]



