/*
 * ngBot is an open source tool for simulate network packets
 * Copyright (C) 2021-present original author(s). All rights reserved.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */
package io.ngbot.protocol.http.data;

import org.cache2k.Cache;

import lombok.Getter;

/**
 * @author Arpan Mukhopadhyay
 *
 */
public class HttpPacketCache {
	
	@Getter
	private final String instanceName;
	
	private Cache<String, HttpRequestData> requestCache;
	private Cache<String, HttpRequestData> responseCache;
	
	public HttpPacketCache(String instanceName) {
		this.instanceName = instanceName;
	}
	
	private void initRequestCache() {
		
	}
	
	private void initResponseCache() {
		
	}
}
