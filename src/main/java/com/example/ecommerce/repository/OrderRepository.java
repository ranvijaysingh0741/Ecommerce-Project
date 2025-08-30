public interface OrderRepository extends JpaRepository<Order, Long> {

    List<Order> findByUserEmail(String userEmail);

}