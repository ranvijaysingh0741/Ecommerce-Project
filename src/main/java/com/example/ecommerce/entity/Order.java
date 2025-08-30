@Entity

@Table(name
        = "orders")

public class Order {



    @Id @GeneratedValue

    private Long
            id;

    private String
            userEmail;

    private LocalDateTime orderDate;

    private double totalAmount;

    @OneToMany(mappedBy
            = "order", cascade = CascadeType.ALL)

    private List<OrderItem> items = new ArrayList<>();