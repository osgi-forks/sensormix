/*
 * Copyright 2013, Cristiano Costantini, Giuseppe Gerla, Michele Ficarra, Sergio Ciampi, Stefano
 * Cigheri.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
package com.google.developers.gdgfirenze.comparators;

import com.google.developers.gdgfirenze.model.Sensor;

import java.util.Comparator;

/**
 * The Class SamplesAscDateComparator.
 */
public class SensorsDescDateComparator implements Comparator<Sensor> {

  /* (non-Javadoc)
   * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
   */
  @Override
  public int compare(Sensor o1, Sensor o2) {
    return o2.getLastSeen().compareTo(o1.getLastSeen());
  }

}
