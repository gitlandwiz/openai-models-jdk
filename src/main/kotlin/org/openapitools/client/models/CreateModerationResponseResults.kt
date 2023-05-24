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

import org.openapitools.client.models.CreateModerationResponseCategories
import org.openapitools.client.models.CreateModerationResponseCategoryScores

import com.squareup.moshi.Json

/**
 * 
 * @param flagged 
 * @param categories 
 * @param categoryScores 
 */

data class CreateModerationResponseResults (
    @Json(name = "flagged")
    val flagged: kotlin.Boolean,
    @Json(name = "categories")
    val categories: CreateModerationResponseCategories,
    @Json(name = "category_scores")
    val categoryScores: CreateModerationResponseCategoryScores
)

