/**
 * VMCS
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

export interface InlineObject2 {
  id: number;
  /**
   * ex. Maintainer
   */
  role: string;
  /**
   * 6 alphanumeric chars
   */
  password: string;
  /**
   * [\'login\', \'logout\']
   */
  status: string;
}