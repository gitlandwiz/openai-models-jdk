/**
* OpenAI API
* APIs for sampling from and fine-tuning language models
*
* The version of the OpenAPI document: 1.2.0
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package org.openapitools.client.models

import org.openapitools.client.models.CreateEmbeddingResponseData
import org.openapitools.client.models.CreateEmbeddingResponseUsage

import com.squareup.moshi.Json

/**
 * 
 * @param `object` 
 * @param model 
 * @param data 
 * @param usage 
 */

data class CreateEmbeddingResponse (
    @Json(name = "object")
    val `object`: kotlin.String,
    @Json(name = "model")
    val model: kotlin.String,
    @Json(name = "data")
    val data: kotlin.collections.List<CreateEmbeddingResponseData>,
    @Json(name = "usage")
    val usage: CreateEmbeddingResponseUsage
)

