/*
 * SCIM-Client is available under the MIT License (2008). See http://opensource.org/licenses/MIT for full text.
 *
 * Copyright (c) 2014, Gluu
 */
package gluu.scim2.client;

import gluu.BaseScimTest;
import gluu.scim.client.ScimResponse;
import org.gluu.oxtrust.model.scim2.User;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * @author Val Pecaoco
 */
public class PersonRequiredParamsTests extends BaseScimTest {

    Scim2Client client;

    @BeforeTest
    @Parameters({"domainURL", "umaMetaDataUrl", "umaAatClientId", "umaAatClientJksPath", "umaAatClientJksPassword", "umaAatClientKeyId"})
    public void init(final String domainURL, final String umaMetaDataUrl, final String umaAatClientId, final String umaAatClientJksPath, final String umaAatClientJksPassword, @Optional final String umaAatClientKeyId) throws Exception {
        client = Scim2Client.umaInstance(domainURL, umaMetaDataUrl, umaAatClientId, umaAatClientJksPath, umaAatClientJksPassword, umaAatClientKeyId);
    }

    @Test
    public void testPersonRequiredParams() throws Exception {

        System.out.println("IN testPersonRequiredParams...");

        User user = new User();

        ScimResponse response = client.createUser(user, new String[]{});
        System.out.println("response body = " + response.getResponseBodyString());

        assertEquals(response.getStatusCode(), 400, "Status code is not equal to 400");
        assert response.getResponseBodyString().contains("There are missing required parameters");

        System.out.println("response.getStatusCode() = " + response.getStatusCode());

        System.out.println("LEAVING testPersonRequiredParams...");
    }
}
