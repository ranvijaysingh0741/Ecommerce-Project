@Entity

public class CartItem {



    @Id

    @GeneratedValue

    private Long
            id;

    @ManyToOne

    private Order
            order;

    @ManyToOne

    private Product
            product;

    private int quantity;

    private  String name;

    private double price;

    private String
            imageName;