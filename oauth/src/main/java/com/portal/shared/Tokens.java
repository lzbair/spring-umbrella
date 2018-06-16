package com.portal.shared;

import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.InMemoryTokenStore;


public class Tokens {

    public static final TokenStore store = new InMemoryTokenStore();

}
