@Service
public class EmailService {

    @Autowired
    private JavaMailSender mailSender;

    public void sendOrderEmail(String to, String subject, String body) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("rohittkumarr0511@gmail.com");
        message.setTo(to);
        message.setSubject(subject);
        message.setText(body);
        mailSender.send(message);
    }
}