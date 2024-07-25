package kodlama.io.rentACar.entities.concretes;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Table(name = "brands")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Brand {
    @Id //PK yaptık.
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id") //PK
    private int id;
    @Column(name= "name")
    private String name;

    @OneToMany(mappedBy = "brand")
    List<Model> models;




}
