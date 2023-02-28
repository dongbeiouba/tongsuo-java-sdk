/*
 * Copyright 2023 The Tongsuo Project Authors. All Rights Reserved.
 *
 * Licensed under the Apache License 2.0 (the "License").  You may not use
 * this file except in compliance with the License.  You can obtain a copy
 * in the file LICENSE in the source distribution or at
 * https://github.com/Tongsuo-Project/Tongsuo/blob/master/LICENSE.txt
 */

package org.conscrypt;

import java.security.spec.InvalidKeySpecException;

public class SM2PublicKey extends OpenSSLECPublicKey{
    private static final long serialVersionUID = 8840925409605495924L;

    private static final String ALGORITHM = "SM2";

    SM2PublicKey(OpenSSLKey key) {
        super(OpenSSLECGroupContext.getCurveByName(ALGORITHM), key);  // faster than super(key)
    }

    SM2PublicKey(SM2PublicKeySpec sm2KeySpec) throws InvalidKeySpecException {
        super(sm2KeySpec);
    }

    @Override
    public String getAlgorithm() {
        return ALGORITHM;
    }
}
