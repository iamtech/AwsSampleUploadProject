package com.amazonaws.samples;

import com.amazonaws.AmazonClientException;
import com.amazonaws.auth.profile.ProfileCredentialsProvider;

public class SampleUploadProject {
	
	private static ProfileCredentialsProvider credentialsProvider = null;
	
	public static void main(String[] args) {
		credentialsProvider = new ProfileCredentialsProvider();
		S3TransferProgressSample s3 ;
		 try {
             credentialsProvider.getCredentials();
             s3 = new S3TransferProgressSample();
 			 s3.uploadFile(credentialsProvider);
         } catch (Exception e) {
             throw new AmazonClientException(
                     "Cannot load the credentials from the credential profiles file. " +
                     "Please make sure that your credentials file is at the correct " +
                     "location (C:\\Users\\amit.singh\\.aws\\credentials), and is in valid format.",
                     e);
         }
		
	}

}
