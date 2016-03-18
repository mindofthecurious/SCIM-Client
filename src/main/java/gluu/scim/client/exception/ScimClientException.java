/*
 * SCIM-Client is available under the MIT License (2008). See http://opensource.org/licenses/MIT for full text.
 *
 * Copyright (c) 2014, Gluu
 */
package gluu.scim.client.exception;

/**
 * Base SCIM exception
 * 
 * @author Yuriy Movchan Date: 08/08/2013
 */
public class ScimClientException extends Exception {

	private static final long serialVersionUID = 8466204221569657665L;

	public ScimClientException(String message) {
		super(message);
	}

	public ScimClientException(String message, Throwable cause) {
        super(message, cause);
    }

}
