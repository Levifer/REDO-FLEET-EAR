package com.realdolmen.util;

import org.springframework.security.crypto.bcrypt.BCrypt;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by BPTAT47 on 7/10/2014.
 */
public class EncryptUtil {


    private final int WORKLOAD = 12; // must be between 10 and 31
    private String password;
    private String encryptedPassword=null;
    private String salt = null;

    public EncryptUtil() {

    }

    public EncryptUtil(String password) {
        this.password = password;
        encryptPassword();
    }

    public void encryptPassword() {
        salt = (salt == null ) ? BCrypt.gensalt(WORKLOAD) : salt;
        encryptedPassword = BCrypt.hashpw(password, salt);
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEncryptedPassword() {
        return encryptedPassword;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getSalt() {
        return salt;
    }
}
