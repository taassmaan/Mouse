package kg.megacom.test_app.models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Data
@Entity
@Table(name = "tb_question")
public class Question {

    @Id
    @GeneratedValue
    private Long id;
    private String question;
    @ManyToOne
    @JoinColumn(name = "subject_id")
    private Subject subject;
    private boolean is_active;
    private String image;
    private int score;

}
