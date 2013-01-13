package com.rr.trackexpense.server;

import java.io.IOException;
import java.util.Properties;
import java.util.logging.Logger;

import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.datanucleus.util.StringUtils;

import com.rr.trackexpense.server.util.TrackExpenseUtils;

@SuppressWarnings("serial")
public class TrackexpenseEmailServlet extends HttpServlet {

	private static Logger log = Logger.getLogger(TrackexpenseEmailServlet.class
			.getName());

	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setContentType("text/plain");
		resp.getWriter().println("Hello, world");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		log.info("Received email for adding expense...");
		Properties props = new Properties();
		Session session = Session.getDefaultInstance(props, null);
		try {
			MimeMessage message = new MimeMessage(session, req.getInputStream());
			String expensesString = "";
			if (!StringUtils.isEmpty(message.getSubject())) {
				expensesString = message.getSubject() + "\n";
			} else {
				if (message.getContent() instanceof String)
					expensesString += message.getContent().toString();
				else if (message.getContent() instanceof MimeMultipart) {
					MimeMultipart mp = ((MimeMultipart) message.getContent());
					log.info(mp.getBodyPart(0).getContent().getClass() + " -> "
							+ mp.getBodyPart(0).getContent().toString());
					expensesString += mp.getBodyPart(0).getContent().toString();
				} else
					log.info("Received email with body of type: "
							+ message.getContent().getClass());
				log.info("Email message: " + expensesString);
			}

			TrackExpenseUtils.processExpenseAddRequest(expensesString);

		} catch (MessagingException e) {
			log.severe("Error: " + e.getMessage());
			e.printStackTrace();
		}
	}
}
