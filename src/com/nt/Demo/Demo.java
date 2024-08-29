package com.nt.Demo;


import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class Demo {
	
	public static void main(String[] args) throws Exception {
		
		String str="admin123";
		Encoder encoder=Base64.getEncoder();
		byte[] emsg=encoder.encode(str.getBytes());
		System.out.println(new String(emsg));
		
		Decoder decoder=Base64.getDecoder();
		byte[]dmsg=decoder.decode(emsg);
		System.out.println(new String(dmsg));
		
		String str1="admin123";
		
		MessageDigest messageDigest=MessageDigest.getInstance("SHA-256");
		messageDigest.reset();
		messageDigest.update(str.getBytes());
		byte[] msg =messageDigest.digest();
		byte[] emsg1=Base64.getEncoder().encode(msg);
		System.out.println(new String (msg));
		System.out.println(new String (emsg1));
		
	}

}
