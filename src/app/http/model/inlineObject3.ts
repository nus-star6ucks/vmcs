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
import { Coin } from './coin';

export interface InlineObject3 {
  drinkId: number;
  /**
   * 合并 object 的 quantity
   */
  coins: Array<Coin>;
}
