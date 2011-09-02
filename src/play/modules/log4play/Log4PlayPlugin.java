/** 
 * Copyright 2011 The Apache Software Foundation
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
 * 
 * @author Felipe Oliveira (http://mashup.fm)
 * @author Deepthi Rallabandi
 * 
 */
package play.modules.log4play;

import play.Logger;
import play.PlayPlugin;
import play.mvc.Router;

public class Log4PlayPlugin extends PlayPlugin {

	@Override
	public void onApplicationStart() {
		final boolean disabled = "true".equals(play.Play.configuration.getProperty("log4play.disabled"));
		if ( disabled ) {
			Logger.warn("Log4Play is currently disabled, if you would like to enable it just change configuration property 'log4play.disabled'.");
			return;
		}
		Logger.log4j.addAppender(new PlayWebSocketLogAppender());
		Router.addRoute("WS", "/logstream", "log4play.Log4Play.WebSocket.index");
	}
}
