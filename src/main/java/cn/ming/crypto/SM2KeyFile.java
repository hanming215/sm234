package cn.ming.crypto;

import java.math.BigInteger;

import org.bouncycastle.math.ec.ECPoint;

public class SM2KeyFile {
	
	public static void main(String[] args) {
		SM2 sm02 = new SM2();
		SM2KeyPair KeyPair = sm02.generateKeyPair();
		String priKeyPath="privatekey.pem";
		String pubKeyPath="publickey.pem";
		//导出公私钥
		sm02.exportPrivateKey(KeyPair.getPrivateKey(),priKeyPath);
		sm02.exportPublicKey(KeyPair.getPublicKey(),pubKeyPath );	
	}
}
