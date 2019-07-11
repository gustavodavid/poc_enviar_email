import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class Principal {

    public static void main(String[] args) {

        try {
            Email email = new SimpleEmail();
            email.setHostName("smtp.googlemail.com");
            email.setSmtpPort(465);
            email.setAuthenticator(new DefaultAuthenticator("gustavo.souza@sovis.com.br", "SValterar12345"));
            email.setSSLOnConnect(true);
            email.addTo("gustavo.souza@sovis.com.br");
            email.setFrom("gustavo.souza@sovis.com.br");
            email.setSubject("Mensagem de teste");
            email.setMsg("Mensagem de teste");
            email.send();
        } catch (EmailException e) {
            System.out.print("Erro ao enviar e-mail.");
            e.printStackTrace();
        }
    }
}
