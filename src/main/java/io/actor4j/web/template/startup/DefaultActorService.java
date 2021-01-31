/*
 * Copyright (c) 2015-2017, David A. Bauer. All rights reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.actor4j.web.template.startup;

import static io.actor4j.core.logging.system.SystemActorLogger.*;

import io.actor4j.core.ActorService;
import io.actor4j.web.websocket.WebsocketActorClientRunnable;

public class DefaultActorService {
	protected static ActorService service;
	
	private DefaultActorService() {
		super();
	}
	
	public static void start() {
		service = new ActorService();
		
		config(service);
		service.setClientRunnable(new WebsocketActorClientRunnable(service.getServiceNodes(), service.getParallelismMin()*service.getParallelismFactor(), 10000));
		
		systemLogger().info(String.format("%s - Service started...", service.getName()));
		service.start();
	}
	
	protected static void config(ActorService service) {
		/* Insert your code here! */ 
	}
	
	public static void stop() {
		service.shutdownWithActors(true);
		((WebsocketActorClientRunnable)service.getClientRunnable()).closeAll();
		systemLogger().info(String.format("%s - Service stopped...", service.getName()));
	}
	
	public static ActorService getService() {
		return service;
	}
}
