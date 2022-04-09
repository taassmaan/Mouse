package kg.megacom.test_app.dao;

import kg.megacom.test_app.models.Answer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnswerDao extends JpaRepository<Answer, Long> {
}
