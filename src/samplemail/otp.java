package samplemail;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.SimpleEmail;

public class otp {
	public static void send() throws Exception {
		   Email email = new SimpleEmail();
		     email.setSmtpPort(587);
		     email.setAuthenticator(new DefaultAuthenticator("chatbesimple@gmail.com",
		             "nefzpdsifvajwzzk"));
		     email.setDebug(false);
		     email.setHostName("smtp.gmail.com");
		     email.setFrom("chatbesimple@gmail.com");
		     email.setSubject("Hi");
		     email.setMsg("This is a test mail ... :-)");
		     email.addTo("chatbesimple@gmail.com");
		     email.setTLS(true);
		     email.send();
		     System.out.println("Mail sent!");
	}

}
