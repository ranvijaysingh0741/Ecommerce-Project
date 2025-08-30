import jakarta.persistence.GeneratedValue;

@Entity

public class User {
    @Id
    @GeneratedValue

    private Long
            id;

    private String
            name;

    private String
            email;

    private String
            password;

    private String
            role;
  #Generate Getter and Setter
    methods

 # Generate toString() method
