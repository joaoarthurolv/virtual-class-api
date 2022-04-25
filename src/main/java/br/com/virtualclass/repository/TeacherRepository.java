package br.com.virtualclass.repository;
import br.com.virtualclass.repository.entity.TeacherEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
@Repository
public interface TeacherRepository extends JpaRepository<TeacherEntity, Integer> {
    @Query("SELECT t FROM teacher t")
    TeacherEntity searchById(Integer id);
}
