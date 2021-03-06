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
package com.google.developers.gdgfirenze.admin.client;

import com.google.developers.gdgfirenze.admin.client.service.GwtSensormixService;
import com.google.developers.gdgfirenze.admin.client.service.GwtSensormixServiceAsync;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.shared.GWT;
import com.google.gwt.user.client.ui.RootLayoutPanel;
import com.google.web.bindery.event.shared.EventBus;
import com.google.web.bindery.event.shared.SimpleEventBus;

/**
 * GWT Web App entry point.
 */
public class SensormixAdminApp implements EntryPoint {
  
  /* (non-Javadoc)
   * @see com.google.gwt.core.client.EntryPoint#onModuleLoad()
   */
  @Override
  public void onModuleLoad() {
    final EventBus eventBus = GWT.create(SimpleEventBus.class);
    final GwtSensormixServiceAsync sensormixService = GWT.create(GwtSensormixService.class);
    final SensormixAdminUi ui = new SensormixAdminUi(eventBus, sensormixService);
    RootLayoutPanel.get().add(ui);
  }
}
