package jp.te4a.spring.boot.myapp9;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
public interface BookRepository extends JpaRepository<BookBean, Integer>{
	@org.springframework.data.jpa.repository.Query("SELECT X FROM BookBean X ORDER BY X.title")
	List<BookBean> findAllOrderByTitle();
//	public Optional<BookBean> finfById(Integer id);
//	public Optional<BookBean> DeleteById(Integer id);
}



