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

import org.apache.log4j.Appender;
import org.apache.log4j.WriterAppender;
import org.apache.log4j.spi.LoggingEvent;

public class PlayWebSocketLogAppender extends WriterAppender implements Appender {

	@Override
	public void append(final LoggingEvent event) {
		LogStream.publish(new Log4PlayEvent(event));
	}
}
