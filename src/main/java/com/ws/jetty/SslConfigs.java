package com.ws.jetty;

import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.TrustManagerFactory;
import java.util.Set;

/**
 * @ description:
 * @ author: wangshuai
 * @ create: 2020-04-09 13:52
 **/
public class SslConfigs {
    /*
     * NOTE: DO NOT CHANGE EITHER CONFIG NAMES AS THESE ARE PART OF THE PUBLIC API AND CHANGE WILL BREAK USER CODE.
     */

    /**
     * @deprecated As of 1.0.0. This field will be removed in a future major release.
     */
    @Deprecated
    public static final String PRINCIPAL_BUILDER_CLASS_CONFIG = SecurityConfig.PRINCIPAL_BUILDER_CLASS_CONFIG;
    /**
     * @deprecated As of 1.0.0. This field will be removed in a future major release.
     */
    @Deprecated
    public static final String PRINCIPAL_BUILDER_CLASS_DOC = SecurityConfig.PRINCIPAL_BUILDER_CLASS_DOC;

    public static final String SSL_PROTOCOL_CONFIG = "ssl.protocol";
    public static final String SSL_PROTOCOL_DOC = "The SSL protocol used to generate the SSLContext. "
            + "Default setting is TLS, which is fine for most cases. "
            + "Allowed values in recent JVMs are TLS, TLSv1.1 and TLSv1.2. SSL, SSLv2 and SSLv3 "
            + "may be supported in older JVMs, but their usage is discouraged due to known security vulnerabilities.";

    public static final String DEFAULT_SSL_PROTOCOL = "TLS";

    public static final String SSL_PROVIDER_CONFIG = "ssl.provider";
    public static final String SSL_PROVIDER_DOC = "The name of the security provider used for SSL connections. Default value is the default security provider of the JVM.";

    public static final String SSL_CIPHER_SUITES_CONFIG = "ssl.cipher.suites";
    public static final String SSL_CIPHER_SUITES_DOC = "A list of cipher suites. This is a named combination of authentication, encryption, MAC and key exchange algorithm used to negotiate the security settings for a network connection using TLS or SSL network protocol. "
            + "By default all the available cipher suites are supported.";

    public static final String SSL_ENABLED_PROTOCOLS_CONFIG = "ssl.enabled.protocols";
    public static final String SSL_ENABLED_PROTOCOLS_DOC = "The list of protocols enabled for SSL connections.";
    public static final String DEFAULT_SSL_ENABLED_PROTOCOLS = "TLSv1.2,TLSv1.1,TLSv1";

    public static final String SSL_KEYSTORE_TYPE_CONFIG = "ssl.keystore.type";
    public static final String SSL_KEYSTORE_TYPE_DOC = "The file format of the key store file. "
            + "This is optional for client.";
    public static final String DEFAULT_SSL_KEYSTORE_TYPE = "JKS";

    public static final String SSL_KEYSTORE_LOCATION_CONFIG = "ssl.keystore.location";
    public static final String SSL_KEYSTORE_LOCATION_DOC = "The location of the key store file. "
            + "This is optional for client and can be used for two-way authentication for client.";

    public static final String SSL_KEYSTORE_PASSWORD_CONFIG = "ssl.keystore.password";
    public static final String SSL_KEYSTORE_PASSWORD_DOC = "The store password for the key store file. "
            + "This is optional for client and only needed if ssl.keystore.location is configured. ";

    public static final String SSL_KEY_PASSWORD_CONFIG = "ssl.key.password";
    public static final String SSL_KEY_PASSWORD_DOC = "The password of the private key in the key store file. "
            + "This is optional for client.";

    public static final String SSL_TRUSTSTORE_TYPE_CONFIG = "ssl.truststore.type";
    public static final String SSL_TRUSTSTORE_TYPE_DOC = "The file format of the trust store file.";
    public static final String DEFAULT_SSL_TRUSTSTORE_TYPE = "JKS";

    public static final String SSL_TRUSTSTORE_LOCATION_CONFIG = "ssl.truststore.location";
    public static final String SSL_TRUSTSTORE_LOCATION_DOC = "The location of the trust store file. ";

    public static final String SSL_TRUSTSTORE_PASSWORD_CONFIG = "ssl.truststore.password";
    public static final String SSL_TRUSTSTORE_PASSWORD_DOC = "The password for the trust store file. If a password is not set access to the truststore is still available, but integrity checking is disabled.";

    public static final String SSL_KEYMANAGER_ALGORITHM_CONFIG = "ssl.keymanager.algorithm";
    public static final String SSL_KEYMANAGER_ALGORITHM_DOC = "The algorithm used by key manager factory for SSL connections. "
            + "Default value is the key manager factory algorithm configured for the Java Virtual Machine.";
    public static final String DEFAULT_SSL_KEYMANGER_ALGORITHM = KeyManagerFactory.getDefaultAlgorithm();

    public static final String SSL_TRUSTMANAGER_ALGORITHM_CONFIG = "ssl.trustmanager.algorithm";
    public static final String SSL_TRUSTMANAGER_ALGORITHM_DOC = "The algorithm used by trust manager factory for SSL connections. "
            + "Default value is the trust manager factory algorithm configured for the Java Virtual Machine.";
    public static final String DEFAULT_SSL_TRUSTMANAGER_ALGORITHM = TrustManagerFactory.getDefaultAlgorithm();

    public static final String SSL_ENDPOINT_IDENTIFICATION_ALGORITHM_CONFIG = "ssl.endpoint.identification.algorithm";
    public static final String SSL_ENDPOINT_IDENTIFICATION_ALGORITHM_DOC = "The endpoint identification algorithm to validate server hostname using server certificate. ";
    public static final String DEFAULT_SSL_ENDPOINT_IDENTIFICATION_ALGORITHM = "https";

    public static final String SSL_SECURE_RANDOM_IMPLEMENTATION_CONFIG = "ssl.secure.random.implementation";
    public static final String SSL_SECURE_RANDOM_IMPLEMENTATION_DOC = "The SecureRandom PRNG implementation to use for SSL cryptography operations. ";

    /**
     * @deprecated As of 1.0.0. This field will be removed in a future major release.
     */
    @Deprecated
    public static final String SSL_CLIENT_AUTH_CONFIG = SecurityConfig.SSL_CLIENT_AUTH_CONFIG;
    /**
     * @deprecated As of 1.0.0. This field will be removed in a future major release.
     */
    @Deprecated
    public static final String SSL_CLIENT_AUTH_DOC = SecurityConfig.SSL_CLIENT_AUTH_DOC;


}

