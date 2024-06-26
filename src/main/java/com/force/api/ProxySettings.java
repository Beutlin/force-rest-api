package com.force.api;

import java.net.Authenticator;
import java.net.Proxy;

public class ProxySettings {
    private final Proxy proxy;
    private final Authenticator proxyAuthenticator;

    ProxySettings(Proxy proxy, Authenticator proxyAuthenticator) {
        this.proxy = proxy;
        this.proxyAuthenticator = proxyAuthenticator;
    }

    public Proxy getProxy() {
        return proxy;
    }

    public Authenticator getProxyAuthenticator() {
        return proxyAuthenticator;
    }
}
