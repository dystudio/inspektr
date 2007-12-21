/**
 *  Copyright 2007 Rutgers, the State University of New Jersey
 *  
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *  
 *      http://www.apache.org/licenses/LICENSE-2.0
 *      
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.inspektr.common.web;

import javax.servlet.http.HttpServletRequest;

/**
 * Captures information from the HttpServletRequest to log later.
 * 
 * @author Scott Battaglia
 * @version $Revision$ $Date$
 * @since 1.0
 *
 */
public final class ClientInfo {
	
	private final String serverIpAddress;
	
	private final String clientIpAddress;
	
	public ClientInfo(final HttpServletRequest request) {
		this.serverIpAddress = request.getLocalAddr();
		this.clientIpAddress = request.getRemoteAddr();
	}

	public String getServerIpAddress() {
		return this.serverIpAddress;
	}

	public String getClientIpAddress() {
		return this.clientIpAddress;
	}
}
