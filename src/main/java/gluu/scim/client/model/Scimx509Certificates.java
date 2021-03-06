/*
 * SCIM-Client is available under the MIT License (2008). See http://opensource.org/licenses/MIT for full text.
 *
 * Copyright (c) 2014, Gluu
 */
package gluu.scim.client.model;

/**
 * SCIM person x509Certificates
 *
 * @author Reda Zerrad Date: 04.23.2012
 */
public class Scimx509Certificates {
	
	private String value;
	
	public Scimx509Certificates(){
		value = new String();
	}
	
	public String getValue(){
		return this.value;
	}
	
	public void setValue(String value){
		this.value = value;
	}

}
