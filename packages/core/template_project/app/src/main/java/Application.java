/*
 * Copyright 2020 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package <%= packageId %>;

import com.my.tracker.MyTracker;
<% for(const imp of applicationClass.imports) { %>
  import <%= imp %>;
<% } %>

public class Application extends android.app.Application {

  <% for(const variable of applicationClass.variables) { %>
    <%= variable %>
  <% } %>

  @Override
  public void onCreate() {
      super.onCreate();
      <% for(const code of applicationClass.onCreate) { %>
        <%= code %>
      <% } %>
      initMyTracker();
  }

  public void initMyTracker() {
      MyTracker.initTracker("myTrackerKey", this);
  }
}
