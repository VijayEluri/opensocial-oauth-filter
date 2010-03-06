/*
 * Copyright (C) 2009-2010 hidetake.org
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.hidetake.util.oauth.model;

import net.oauth.OAuthAccessor;
import net.oauth.OAuthConsumer;
import net.oauth.signature.RSA_SHA1;

public class OpenSocialApp
{

	private final String appId;
	private final String appUrl;
	private final OAuthAccessor oauthAccessor;

	public static OAuthAccessor createOAuthAccessorRSASHA1(String consumerKey, String certificate)
	{
		OAuthConsumer consumer = new OAuthConsumer(null, consumerKey, null, null);
		consumer.setProperty(RSA_SHA1.X509_CERTIFICATE, certificate);
		OAuthAccessor oauthAccessor = new OAuthAccessor(consumer);
		return oauthAccessor;
	}
	
	public OpenSocialApp(String appId, String appUrl, OAuthAccessor oauthAccessor)
	{
		this.appId = appId;
		this.appUrl = appUrl;
		this.oauthAccessor = oauthAccessor;
	}

	public final String getAppId()
	{
		return appId;
	}
	
	public final String getAppUrl()
	{
		return appUrl;
	}

	public OAuthAccessor getOAuthAccessor()
	{
		return oauthAccessor;
	}

}
