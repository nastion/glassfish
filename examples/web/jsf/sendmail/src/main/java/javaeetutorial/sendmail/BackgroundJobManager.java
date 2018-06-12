package javaeetutorial.sendmail;

import java.io.UnsupportedEncodingException;

import javax.ejb.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.mail.internet.MimeMessage.RecipientType;
import javax.naming.*;

@Singleton
@Startup
public class BackgroundJobManager {
	@Schedule(hour="0", minute="0", second="0", persistent=false)
	public void someDailyJob() {
	    try {
	    	InitialContext ctx = new InitialContext();
	        Session session =
	            (Session) ctx.lookup("mail/pedda.fux@gmail.com");
	        
	        // Create email and headers.
	        Message msg = new MimeMessage(session);
	        msg.setSubject("Daily Status Update");
	        msg.setRecipient(RecipientType.TO,
	                         new InternetAddress(
	                         "pfuchs@student.tgm.ac.at",
	                         "Peter"));
	        msg.setFrom(new InternetAddress(
	                    "admin@glassfish.com",
	                    "Admin"));
	
	        // Body text.
	        BodyPart messageBodyPart = new MimeBodyPart();
	        messageBodyPart.setText("Status update incoming... The Server is running beautifully!");
	
	        // Multipart message.
	        Multipart multipart = new MimeMultipart();
	        multipart.addBodyPart(messageBodyPart);
	        
	        // Add multipart message to email.
	        msg.setContent(multipart);
	        
	        // Send email.
	        Transport.send(msg);
		} catch (MessagingException | NamingException | UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}