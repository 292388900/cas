package org.apereo.cas.digest;

import javax.security.auth.login.AccountNotFoundException;

/**
 * This is {@link DigestHashedCredentialRetriever}.
 *
 * @author Misagh Moayyed
 * @since 5.0.0
 */
public interface DigestHashedCredentialRetriever {

    /**
     * Find the MD5 hashed secret for a given user and realm.
     *
     * @param uid   the uid
     * @param realm the realm
     * @return the secret
     * @throws AccountNotFoundException if the account is not found
     */
    String findCredential(final String uid, final String realm) throws AccountNotFoundException;
}
