/*
 * Copyright 2015-2019 IGN
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package fr.ign.spark.iqmulus

import org.apache.spark.sql.catalyst.util.CaseInsensitiveMap

/**
 * Options for the header data source.
 */
private[iqmulus] class HeaderOptions(@transient private val parameters: CaseInsensitiveMap[String])
  extends Serializable {

  import HeaderOptions._

  def this(parameters: Map[String, String]) = this(CaseInsensitiveMap(parameters))

}

private[iqmulus] object HeaderOptions {
}
