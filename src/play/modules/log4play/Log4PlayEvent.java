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

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.log4j.Level;
import org.apache.log4j.Priority;
import org.apache.log4j.spi.LoggingEvent;

public class Log4PlayEvent {
	public String level;
	public String category;
	public String thread;
	public String message;
	public String date;

	public Log4PlayEvent(final LoggingEvent event) {
		this.category = event.getLoggerName();
		this.thread = event.getThreadName();
		this.date = SimpleDateFormat.getDateTimeInstance().format(new Date(event.getTimeStamp()));
		this.message = event.getRenderedMessage().replaceAll("\u003c", "&lt;").replaceAll("\u003e", "&gt;");
		this.level = event.getLevel().toString();
	}
}
